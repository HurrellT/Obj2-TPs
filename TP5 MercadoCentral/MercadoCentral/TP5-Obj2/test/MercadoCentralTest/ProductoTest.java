package MercadoCentralTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tp5_obj2_MercadoCentral.Manzana;
import tp5_obj2_MercadoCentral.Producto;

public class ProductoTest {

	private Producto manzanaTest;
	
	@Before
	public void setUp() throws Exception {
		
		manzanaTest = new Manzana(25, "Manzana");
	}

	@Test
	public void test001_UnaManzanaCuesta25PesosYSeLlamaManzana() {
		
		int costo = 25;
		
		assertEquals(costo, manzanaTest.getCosto());
	}

}
