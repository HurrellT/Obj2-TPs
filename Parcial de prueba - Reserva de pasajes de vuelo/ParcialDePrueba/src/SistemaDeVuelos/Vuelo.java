package SistemaDeVuelos;

import java.util.Date;
import java.util.Observable;

public class Vuelo extends Observable {

	//Colabs
	private Integer nroVuelo;
	private String ciudadO;
	private String ciudadD;
	private Integer capacidad;
	private Date fechaHoraS;
	private Date fechaHoraLL;
	
	
	public Vuelo(	Integer nroVuelo, 
					String ciudadO, 
					String ciudadD, 
					Integer capacidad, 
					Date fechaHoraS,
					Date fechaHoraLL) {
		
		this.nroVuelo		= nroVuelo;
		this.ciudadO		= ciudadO;
		this.ciudadD		= ciudadD;
		this.capacidad		= capacidad;
		this.fechaHoraS 	= fechaHoraS;
		this.fechaHoraLL 	= fechaHoraLL;
	}


	public Integer getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}


	public Date getFechaHoraS() {
		return fechaHoraS;
	}


	public void setFechaHoraS(Date fechaHoraS) {
		this.fechaHoraS = fechaHoraS;
		this.setChanged();
		this.notifyObservers("Horario");
	}


	public Date getFechaHoraLL() {
		return fechaHoraLL;
	}


	public void setFechaHoraLL(Date fechaHoraLL) {
		this.fechaHoraLL = fechaHoraLL;
	}


	public Integer getNroVuelo() {
		return nroVuelo;
	}


	public String getCiudadO() {
		return ciudadO;
	}


	public String getCiudadD() {
		return ciudadD;
	}


	public void cancelarReserva() {
		this.setCapacidad(capacidad++);
		this.setChanged();
		this.notifyObservers("Reserva");
	}
}
