package MercadoCentralTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tp5_obj2_MercadoCentral.Producto;
import tp5_obj2_MercadoCentral.ProductoDeEmpresa;

public class ProductoTest {

	private Producto manzanaTest;
	
	@Before
	public void setUp() throws Exception {
		
		manzanaTest = new ProductoDeEmpresa(25, "Manzana", 100);
	}

	@Test
	public void test001_UnaManzanaCuesta25PesosYSeLlamaManzana() {
		
		String man = "Manzana";
		int costo = 31;
		int stock = 100;
		
		assertEquals(costo, manzanaTest.getCosto());
		assertEquals(man, manzanaTest.getNombreProd());
		assertEquals(stock, manzanaTest.getStock());
	}

}
