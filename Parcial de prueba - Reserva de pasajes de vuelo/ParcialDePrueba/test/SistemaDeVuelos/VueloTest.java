package SistemaDeVuelos;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class VueloTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test01UnVueloSeCreaConUnNumeroDeVueloUnaCiudadOrigenYDestinoUnaCapacidadYLasFechasDeSalidaYLlegada() throws ParseException{
		Integer nroVuelo 	= new Integer(153);
		String 	ciudadO 	= "Buenos Aires";
		String 	ciudadD 	= "Santiago De Chile";
		Integer capacidad	= new Integer(159);
//		Date 	fechaHoraS	= new Date();
//		Date	fechaHoraLL	= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse("2017-06-7 12:15:45.156");
		Date 	fechaHoraS	= mock(Date.class);
		Date	fechaHoraLL	= mock(Date.class);
		
		Vuelo vuelo 		= new Vuelo(nroVuelo, ciudadO, ciudadD, capacidad, fechaHoraS, fechaHoraLL);
		
		assertEquals(nroVuelo, vuelo.getNroVuelo());
		assertEquals(ciudadO, vuelo.getCiudadO());
		assertEquals(ciudadD, vuelo.getCiudadD());
		assertEquals(capacidad, vuelo.getCapacidad());
		assertEquals(fechaHoraS, vuelo.getFechaHoraS());
		assertEquals(fechaHoraLL, vuelo.getFechaHoraLL());
	}
	
	@Test
	public void test02CuandoUnVueloCambiaSuHorarioViajateTodoIndicaElCambioDeHorario() {
		Integer nroVuelo 	= new Integer(153);
		String 	ciudadO 	= "Buenos Aires";
		String 	ciudadD 	= "Santiago De Chile";
		Integer capacidad	= new Integer(159);
//		Date 	fechaHoraS	= new Date();
//		Date	fechaHoraLL	= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse("2017-06-7 12:15:45.156");
		Date 	fechaHoraS	= mock(Date.class);
		Date	fechaHoraLL	= mock(Date.class);
		
		Vuelo vuelo 		= new Vuelo(nroVuelo, ciudadO, ciudadD, capacidad, fechaHoraS, fechaHoraLL);
		
		ViajateTodo vt = mock(ViajateTodo.class);
		
		vuelo.addObserver(vt);
		
		vuelo.setFechaHoraS(fechaHoraLL);
		
		verify(vt).update(vuelo, "Horario");
	}
	
	@Test
	public void test03CuandoUnVueloCambiaSuHorarioMobileWorldIndicaElCambioDeHorario() {
		Integer nroVuelo 	= new Integer(153);
		String 	ciudadO 	= "Buenos Aires";
		String 	ciudadD 	= "Santiago De Chile";
		Integer capacidad	= new Integer(159);
//		Date 	fechaHoraS	= new Date();
//		Date	fechaHoraLL	= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse("2017-06-7 12:15:45.156");
		Date 	fechaHoraS	= mock(Date.class);
		Date	fechaHoraLL	= mock(Date.class);
		
		Vuelo vuelo 		= new Vuelo(nroVuelo, ciudadO, ciudadD, capacidad, fechaHoraS, fechaHoraLL);
		
		MobileWorld mb = mock(MobileWorld.class);
		
		vuelo.addObserver(mb);
		
		vuelo.cancelarReserva();
		
		verify(mb).update(vuelo, "Reserva");
	}

}
