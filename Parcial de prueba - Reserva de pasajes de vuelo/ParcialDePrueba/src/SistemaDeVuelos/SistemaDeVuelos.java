package SistemaDeVuelos;

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
		
	}

	public void modificarHorario(Vuelo vuelo, int nuevoHorario) {
		
		vuelo.setHorario(nuevoHorario);
		
	}

}
