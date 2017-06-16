package ParcialSubastas;

import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {
	
	private String nombre;
	private Map<Subasta, Integer> publicacionesHechas;
	//Tiene la publicacion y su desempe�o calculado en base a la
	//	cantidad de ofertantes que hicieron ofertas.
	private Map<Subasta, Integer> ofertasHechas;
	private Map<Subasta, Usuario> ofertasSuperadas;
	private List<Subasta> subastasAdjudicadas;
	private List<Subasta> subastasFinalizadas;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void update(Observable observable, Object arg1) {
		publicacionesHechas.put((Subasta) observable, observable.countObservers());
		ofertaSuperadaPara((Subasta) observable);
		
	}

	public void ofertaSuperadaPara(Subasta sub) {
		ofertasSuperadas.put(sub, sub.getMejorPostor());
		//Se decidio poner al usuario que supero la oferta
		//Pero tambien puede ser el monto actual de la subasta.
	}
	
	public void adjudicar(Subasta sub) {
		subastasAdjudicadas.add(sub);
	}

	public void subastaFinalizada(Subasta sub) {
		subastasFinalizadas.add(sub);
	}

	public void aniadirPublicacionHecha(Subasta subasta) {
		publicacionesHechas.put(subasta, subasta.countObservers());
	}

	public void aniadirOferta(Subasta sub, int monto) {
		ofertasHechas.put(sub, monto);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
