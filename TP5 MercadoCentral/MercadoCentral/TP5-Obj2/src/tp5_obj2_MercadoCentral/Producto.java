package tp5_obj2_MercadoCentral;

public abstract class Producto {

	//Collabs internos
	private int costo;
	private String nombreProd;
	
	//Constructor
	public Producto(int costo, String nombre) {
		
		this.costo = costo;
		this.nombreProd = nombre;
	}

	//Getters
	
	public int getCosto() {
		return costo;
	}
	
	public String getNombreProd() {
		return nombreProd;
	}
}
