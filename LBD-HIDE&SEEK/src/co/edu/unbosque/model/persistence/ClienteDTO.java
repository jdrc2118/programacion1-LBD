package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class ClienteDTO implements Serializable{
	
	
	private String usuario;
	private String correo;
	private String contraseña;
	private int parejas;
	
	
	
	public ClienteDTO(String usuario,String correo, String contraseña, int parejas) {
		this.usuario = usuario;
		this.correo = correo;
		this.contraseña = contraseña;
		this.parejas = parejas;
			
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



	public String getContraseña() {
		return contraseña;
	}



	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}



	public int getParejas() {
		return parejas;
	}



	public void setParejas(int parejas) {
		this.parejas = parejas;
	}



	@Override
	public String toString() {
		return "ClienteDTO [usuario=" + usuario + ", correo=" + correo + ", contraseña=" + contraseña + ", parejas="
				+ parejas + "]";
	}
	
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
