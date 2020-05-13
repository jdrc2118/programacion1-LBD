package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class ParejasDTO implements Serializable{
	
	private String nombre ;
	private double credito;
	private String horario;
	private String cedula;
	
	
	public ParejasDTO(String nombre,double credito,String horario, String cedula) {
		this.nombre=nombre;
		this.credito=credito;
		this.horario=horario;
		this.cedula= cedula;
		
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getCredito() {
		return credito;
	}


	public void setCredito(double credito) {
		this.credito = credito;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	@Override
	public String toString() {
		return "ParejasDTO [nombre=" + nombre + ", credito=" + credito + ", horario=" + horario + "]";
	}
	

}
