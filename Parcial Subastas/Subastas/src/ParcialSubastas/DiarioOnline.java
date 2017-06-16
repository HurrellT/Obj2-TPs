package ParcialSubastas;

import java.util.List;
import java.util.Observable;
import java.util.stream.Stream;

public class DiarioOnline extends SistemaExternoDeSubastas implements Publisher {

	private List<Subasta> subastasPublicadas;
	
	@Override
	public void update(Observable o, Object arg) {
		Stream<Subasta> subastas = subastasPublicadas.stream();
		
		subastas.filter(s -> s.isEstado() == true)
				.forEach(s -> showInBanner("Nuevo precio para la subasta" +s.getProducto() + " " + s.getPrecioActual()));
		
		subastas.filter(s -> s.isEstado() == false)
				.forEach(s -> showInBanner("La subasta " +s.getProducto() + "ha finalizado."));
	}

	@Override
	public void showInBanner(String text) {
		// TODO Auto-generated method stub
		
	}

}
