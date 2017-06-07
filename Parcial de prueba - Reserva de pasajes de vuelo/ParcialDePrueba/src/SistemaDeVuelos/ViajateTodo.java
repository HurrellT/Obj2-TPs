package SistemaDeVuelos;

import java.util.Observable;
import java.util.Observer;

public class ViajateTodo implements Observer {

	private WebPage web;
	private Vuelo subject;
	
	@Override
	public void update(Observable arg0, Object arg1) {
		String aspecto = (String) arg1;
		if (aspecto == "Horario") {
			web.showAlert("Alerta: vuelo nro " + this.subject.getNroVuelo() + "cambio la fecha a " + this.subject.getFechaHoraS());
		}

	}
	
	public ViajateTodo(Vuelo vuelo) {
		subject	= vuelo;
		subject.addObserver(this);
	}

}
