package SistemaDeVuelos;

public class Reserva {

	private Vuelo Vuelo;
	private Cliente Cliente;

	public Reserva(Cliente cliente, Vuelo vuelo) {
		this.Cliente = cliente;
		this.Vuelo   = vuelo;
	}
	
	public Cliente getCliente() {
		return Cliente;
	}
	
	public Vuelo getVuelo() {
		return Vuelo;
	}
	
}
