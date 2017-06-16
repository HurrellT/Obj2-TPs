package ParcialSubastas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SistemaDeComercio {
	
	private List<Usuario> usuarios;
	private List<Subasta> publicaciones;
	private List<SistemaExternoDeSubastas> sistemasRegistrados;
	
	public SistemaDeComercio() {
		usuarios = new ArrayList<Usuario>();
		publicaciones = new ArrayList<Subasta>();
		sistemasRegistrados = new ArrayList<SistemaExternoDeSubastas>();
	}
	
	public void registrarUsuario(Usuario user) {
		this.usuarios.add(user);
	}

	public void publicar(Usuario autor, Producto prod, int precioMin, int precioRef) {
		Subasta subasta = new Subasta(prod, precioMin, precioRef, autor);
		
		this.publicaciones.add(subasta);
		autor.aniadirPublicacionHecha(subasta);
	}
	
	public void ofertar(Usuario user, Subasta sub, int monto) {
		if(monto>=sub.getPrecioRef()) {
			//Se adjudica la subasta al usuario
			//Y se guarda la subasta en las subs finalizadas.
			user.adjudicar(sub);
			user.subastaFinalizada(sub);
			
			//La subasta se finaliza
			sub.finalizar();
			
			//Se avisan los cambios
			sub.setearCambio();
			sub.notifyObservers();
			
			//Se borran los observers de la subasta para
			//que dejen de recibir notificaciones de la misma.
			sub.deleteObservers();
		}
		else {
			if(monto>sub.getPrecioActual()) {
				user.aniadirOferta(sub,monto);
				sub.ofertar(monto, user);
				sub.setMejorPostor(user);
				sub.addObserver(user);
				sub.setearCambio();
				sub.notifyObservers();
			}
			else {
				sub.addObserver(user);
			}	
		}
	}
	
	public void registrarSistema(SistemaExternoDeSubastas sistema) {
		this.sistemasRegistrados.add(sistema);
		
		Stream<Subasta> subastas = publicaciones.stream();
		subastas.forEach(s -> s.addObserver(sistema));
	}
	
	public List<Subasta> getPublicaciones() {
		return publicaciones;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
}
