package SistemaDeVuelos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class SistemaDeVuelos {

	//Colabs
	private List<Reserva> reservas = new ArrayList<>();

	//Getters
	public List<Reserva> getReservas() {
		
		return reservas;
	}

	//Methods
	public void reservar(Cliente cliente, Vuelo vuelo) {
		
		reservas.add(new Reserva(cliente, vuelo));
		
	}

	public void cancelarReserva(Cliente cliente, Vuelo vuelo) {
		
		reservas.removeIf(r -> r.getCliente() == cliente && r.getVuelo() == vuelo);
		vuelo.cancelarReserva();		
	}

	public void modificarHorario(Vuelo vuelo, Date nuevoHorario) {
		
		vuelo.setFechaHoraS(nuevoHorario);
		
	}

}
