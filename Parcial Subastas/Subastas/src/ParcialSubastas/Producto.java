package ParcialSubastas;

public class Producto {
	
	private String nombre;
	private String descripcion;
	
	public Producto(String nombre, String desc) {
		nombre = nombre;
		descripcion = desc;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
