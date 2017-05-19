package MercadoCentralTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tp5_obj2_MercadoCentral.Caja;
import tp5_obj2_MercadoCentral.Producto;
import tp5_obj2_MercadoCentral.ProductoDeCooperativa;
import tp5_obj2_MercadoCentral.ProductoDeEmpresa;

public class CajaTest {

	private Caja cajaDePruebaVacia;
	private Caja cajaDePruebaCon3Productos;
	
	@Before
	public void setUp() throws Exception {
		
		//Productos
		Producto prod1 = new ProductoDeEmpresa(25, "Manzana",100);
		Producto prod2 = new ProductoDeEmpresa(25, "Pera",100);
		Producto prod3 = new ProductoDeCooperativa(100, "Choco",25);
		
		//Caja vacia
		cajaDePruebaVacia = new Caja();
		
		//Caja con 3 prods
		cajaDePruebaCon3Productos = new Caja();
		
		cajaDePruebaCon3Productos.registrarProd(prod1);
		cajaDePruebaCon3Productos.registrarProd(prod2);
		cajaDePruebaCon3Productos.registrarProd(prod3);
	}

	@Test
	public void test001_UnaCajaVaciaTiene0PesosAcumulados() {
		
		int result = 0;
		
		assertEquals(result, cajaDePruebaVacia.getMontoTotal());
	}
	
	@Test
	public void test002_UnaCajaTieneTresProductosYSuMontoTotalEsDe150Pesos() {
		
		int cantProds = 3;
		int montoEsperado = 172;
		
		assertEquals(cantProds, cajaDePruebaCon3Productos.getCantProds());
		assertEquals(montoEsperado, cajaDePruebaCon3Productos.getMontoTotal());
	}

}
