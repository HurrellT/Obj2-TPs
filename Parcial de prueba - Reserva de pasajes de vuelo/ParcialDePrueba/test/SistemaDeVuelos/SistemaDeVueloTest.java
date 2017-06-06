package SistemaDeVuelos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

public class SistemaDeVueloTest {
	
	Cliente dummyCliente;
	Vuelo dummyVuelo;
	
	Cliente dummyCliente2;
	Vuelo dummyVuelo2;
	
	Reserva dummyReserva;
	Reserva dummyReserva2;
	
	@Before
	public void setUp() {
		
		dummyCliente = mock(Cliente.class);
		dummyVuelo = mock(Vuelo.class);
		
		dummyCliente2 = mock(Cliente.class);
		dummyVuelo2 = mock(Vuelo.class);
		
		dummyReserva = mock(Reserva.class);
		dummyReserva2 = mock(Reserva.class);
		
		}
	
	@Test
	public void testUnSistemaDeVuelosNuevoNoTieneReservas() {
		
		assertTrue(new SistemaDeVuelos().getReservas().isEmpty());
	}
	
	@Test
	public void testUnSistemaDeVuelosRealizaUnaReservaDeUnClienteAUnVuelo() {
		
		SistemaDeVuelos sistemaDeVuelos = new SistemaDeVuelos();
		sistemaDeVuelos.reservar(dummyCliente, dummyVuelo);
		
		assertEquals(1, sistemaDeVuelos.getReservas().size());
	}
	
	@Test
	public void testUnSisDeVueloTieneUnaReservaYLaCancela() {
		
		SistemaDeVuelos sistemaDeVuelos = new SistemaDeVuelos();
		sistemaDeVuelos.reservar(dummyCliente, dummyVuelo);
		sistemaDeVuelos.cancelarReserva(dummyCliente, dummyVuelo);
		
		assertEquals(0, sistemaDeVuelos.getReservas().size());

	}
	
	@Test
	public void testAUnSisDeVuelosSeLeModificaElHorarioDeUnaDeSusReservas() {
		
		SistemaDeVuelos sistemaDeVuelos = new SistemaDeVuelos();
		sistemaDeVuelos.reservar(dummyCliente, dummyVuelo);
		sistemaDeVuelos.reservar(dummyCliente2, dummyVuelo2);
		
		int nuevoHorario = 1604; 
		
		sistemaDeVuelos.modificarHorario(dummyVuelo, nuevoHorario);
		
		verify(dummyVuelo).setHorario(nuevoHorario);
	}

}
