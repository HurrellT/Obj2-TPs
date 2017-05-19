package tp5_obj2_MercadoCentral;

public class ProductoDeEmpresa extends Producto {

	public ProductoDeEmpresa(int costo, String nombre, int stock) {
		
		super(costo, nombre, stock);
	}

	public int getCosto() {
		
		return (int) (costo * 1.24);
	}
	
}
