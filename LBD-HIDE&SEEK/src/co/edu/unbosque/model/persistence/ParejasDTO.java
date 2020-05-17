package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class ParejasDTO implements Serializable {

	private String nombre;
	private String cedula;
	private double credito;
	private String clave;
	private String horario;

	public ParejasDTO(String nombre, String cedula, double credito,	String clave, String horario) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.credito = credito;
		this.clave = clave;
		this.horario = horario;

	}

	@Override
	public String toString() {
		return "ParejasDTO [nombre=" + nombre + ", cedula=" + cedula
				+ ", credito=" + credito + ", clave=" + clave + ", horario="
				+ horario + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
