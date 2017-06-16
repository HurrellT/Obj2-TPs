package ParcialSubastas;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SistemaDeComercionTest {


	Usuario dummyRoberto;
	Usuario dummyPablo;
	Producto dummyProd;
	Subasta dummySub;
	SistemaDeComercio system;
	
	
	@Before
	public void setUp() throws Exception {
		dummyRoberto = mock(Usuario.class);
		dummyPablo = mock(Usuario.class);
		dummyProd = mock(Producto.class);
		dummySub = mock(Subasta.class);
		system = new SistemaDeComercio();
	}

	@Test
	public void test01VerificoQueUnUsuarioHaceUnaPublicacion(){

		system.registrarUsuario(dummyPablo);
		system.registrarUsuario(dummyRoberto);
		
		system.publicar(dummyPablo, dummyProd, 5, 20);
		
		assertEquals(1, system.getPublicaciones().size());
		
		Subasta subasta = system.getPublicaciones().get(0);
		
		verify(dummyPablo).aniadirPublicacionHecha(subasta);
		
		
	}

	@Test
	public void test02RobertoHaceUnaOfertaDe15PesosAUnaSubastaDePrecioActual10() {
		when(dummySub.getPrecioActual()).thenReturn(10);
		when(dummySub.getPrecioRef()).thenReturn(25);
		when(dummySub.getPrecioMin()).thenReturn(5);
		
		system.ofertar(dummyRoberto, dummySub, 15);
		verify(dummySub).setMejorPostor(dummyRoberto);
	}
/*
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
	*/
}
