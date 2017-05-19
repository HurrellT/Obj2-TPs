package tp5_obj2_MercadoCentral;

import java.util.ArrayList;

public class Caja {

	private int montoTotal;
	private ArrayList<Producto> productosEnCaja;
	
	public Caja() {
		this.montoTotal = 0;
		this.productosEnCaja = new ArrayList<>();
	}
	
	public void updateMonto(int nuevoMonto) {
		this.montoTotal = montoTotal + nuevoMonto;
	}
	
	public void registrarProd(Producto prod, Proveedor prov) {
		this.updateMonto((prov.getProd(prod).getCosto()));
		this.addProd(prod);
		prov.reduceStock();		//reduce el stock al proveedor
	}

	private void addProd(Producto prod) {
		
		this.productosEnCaja.add(prod);
	}

	public int getMontoTotal() {
		
		return montoTotal;
	}

	public int getCantProds() {
		
		return productosEnCaja.size();
	}
	
}
