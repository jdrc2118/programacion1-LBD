package co.edu.unbosque.model.persistence;

import java.io.Serializable;
import java.util.ArrayList;

public class ClienteDTO implements Serializable{
	
	private String nombre;
	private String credito;
	private String usuario;
	private String cedula;
	private String correo;
	private String contrase�a;
	private int parejas;
	private String sexo;
	private ArrayList <ParejasDTO> lista;
	
	
	
	public ClienteDTO(String nombre,String credito,String usuario,String cedula,String correo, String contrase�a,String sexo, int parejas) {
		this.nombre=nombre;
		this.credito=credito;
		this.usuario = usuario;
		this.cedula = cedula;
		this.correo = correo;
		this.contrase�a = contrase�a;
		this.parejas = parejas;
		this.sexo=sexo;
		
		lista= new ArrayList<>();
			
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getContrase�a() {
		return contrase�a;
	}



	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}



	public int getParejas() {
		return parejas;
	}



	public void setParejas(int parejas) {
		this.parejas = parejas;
	}

	

	public ArrayList<ParejasDTO> getLista() {
		return lista;
	}



	public void setLista(ArrayList<ParejasDTO> lista) {
		this.lista = lista;
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



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getCredito() {
		return credito;
	}



	public void setCredito(String credito) {
		this.credito = credito;
	}



	@Override
	public String toString() {
		return "ClienteDTO [usuario=" + usuario + ", correo=" + correo + ", contrase�a=" + contrase�a + ", parejas="
				+ parejas + "]";
	}
	
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
