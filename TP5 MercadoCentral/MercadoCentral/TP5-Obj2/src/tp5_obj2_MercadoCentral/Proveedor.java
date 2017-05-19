package tp5_obj2_MercadoCentral;

import java.util.ArrayList;

public interface Proveedor {

	ArrayList<Producto> productos;
//	private x stock;
	
	Producto getProd(Producto prod);

}
