package ParcialSubastas;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SistemaDeComercionTest {

/*
	Usuario dummyRoberto;
	Usuario dummyPablo;
	Producto dummyProd;
	Subasta dummySub;
	SistemaDeComercio dummySys;
	
	SistemaDeComercio sys;
	
	@Before
	public void setUp() throws Exception {
		dummyRoberto = mock(Usuario.class);
		dummyPablo = mock(Usuario.class);
		dummyProd = mock(Producto.class);
		dummySys = mock(SistemaDeComercio.class);
		dummySub = mock(Subasta.class);
	}

	@Test
	public void test01RobertoHaceUnaOfertaDe15PesosAUnaSubastaDePrecioActual10() {

		verify(dummySys).registrarUsuario(dummyPablo);
		verify(dummySys).registrarUsuario(dummyRoberto);
		
		verify(dummySys).publicar(dummyPablo, dummyProd, 5, 20);
		
		verify(dummySys).ofertar(dummyRoberto, dummySub, 15);
	}
*/

	SistemaDeComercio system;
	Producto prod;
	Usuario roberto;
	Usuario pablo;
	
	@Before
	public void setUp() throws Exception {
		system = new SistemaDeComercio();
		prod = new Producto("Manzana", "Es una manzana...");
		roberto = new Usuario("Roberto");
		pablo = new Usuario("Pablo");
	}
	
	@Test
	public void test01() {
		system.registrarUsuario(pablo);
		system.registrarUsuario(roberto);
		
		system.publicar(pablo, prod, 5, 25);
		
		Subasta sub = system.getPublicaciones().get(0);
		
		assertTrue(sub.getPrecioMin() == 0);
	}
	
}
