package tp5_obj2_MercadoCentral;

public abstract class Producto extends Caja {

	//Collabs internos
	protected int costo;
	private String nombreProd;
	private int stock;
	
	//Constructor
	public Producto(int costo, String nombre, int stock) {
		
		this.costo 		= costo;
		this.nombreProd = nombre;
		this.stock 		= stock;
	}

	//Getters
	
	public abstract int getCosto();
	
	public String getNombreProd() {
		return nombreProd;
	}
	
	public int getStock() {
		return stock;
	}
	
	// Metodos
	
	public void reduceStock() {
		this.costo = costo - 1;
	}
}
