package tp5_obj2_MercadoCentral;

public class Caja {

	private int montoTotal;
	
	public void updateMonto(int nuevoMonto) {
		this.montoTotal = montoTotal + nuevoMonto;
	}
	
	public void registrarProd(Producto prod) {
		this.updateMonto((prod.getCosto());
		prod.updateStock();
	}
	
}
