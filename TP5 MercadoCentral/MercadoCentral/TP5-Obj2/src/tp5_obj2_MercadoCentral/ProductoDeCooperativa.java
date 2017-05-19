package tp5_obj2_MercadoCentral;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(int costo, String nombre, int stock) {
		
		super(costo, nombre, stock);
	}

	public int getCosto() {
		
		return (int) (costo * 1.10);
	}
}
