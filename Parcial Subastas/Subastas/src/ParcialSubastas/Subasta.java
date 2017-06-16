package ParcialSubastas;

import java.util.Map;
import java.util.Observable;

public class Subasta extends Observable {
	
	private Producto producto;
	private int precioMin;
	private int precioRef;
	private int precioActual;
	private Usuario autor;
	private boolean estado;
	private Usuario mejorPostor;
	private Map<Usuario, Integer> ofertasHechas;

	public Subasta(Producto prod, int precioMin, int precioRef, Usuario autor) {
		this.producto = prod;
		this.precioMin = precioMin;
		this.precioRef = precioRef;
		this.precioActual = 0;
		this.autor = autor;
		this.estado = true;
	}
	
	public void ofertar(int unMonto, Usuario ofertante) {
		ofertasHechas.put(ofertante, unMonto);
		setPrecioActual(unMonto);
	}
	
	public void finalizar() {
		this.setEstado(false);
	}
	
	public void setearCambio() {
		this.setChanged();
	}

	//Getters y Setters
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getPrecioMin() {
		return precioMin;
	}

	public void setPrecioMin(int precioMin) {
		this.precioMin = precioMin;
	}

	public int getPrecioRef() {
		return precioRef;
	}

	public void setPrecioRef(int precioRef) {
		this.precioRef = precioRef;
	}

	public int getPrecioActual() {
		return precioActual;
	}

	public void setPrecioActual(int precioActual) {
		this.precioActual = precioActual;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Usuario getMejorPostor() {
		return mejorPostor;
	}

	public void setMejorPostor(Usuario mejorPostor) {
		this.mejorPostor = mejorPostor;
	}

	public Map<Usuario, Integer> getOfertasHechas() {
		return ofertasHechas;
	}

}
