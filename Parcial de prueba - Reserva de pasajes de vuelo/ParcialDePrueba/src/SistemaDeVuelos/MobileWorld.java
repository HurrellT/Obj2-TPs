package SistemaDeVuelos;

import java.util.Observable;
import java.util.Observer;

public class MobileWorld implements Observer {

	private Vuelo subject;
	private AndroidMessageAlert android;
	
	public MobileWorld() {
		
	}

	@Override
	public void update(Observable o, Object arg) {
		String aspecto = (String) arg;
		if (aspecto == "Reserva") {
			android.title("Alerta!");
			android.body("El vuelo cambio de horario" + subject.getFechaHoraS());
			android.show();
		}
		
	}
	
	
}
