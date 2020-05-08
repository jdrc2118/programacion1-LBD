package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class ClienteDTO implements Serializable{
	
	
	private String usuario;
	private String correo;
	private String contrase�a;
	private int parejas;
	
	
	
	public ClienteDTO(String usuario,String correo, String contrase�a, int parejas) {
		this.usuario = usuario;
		this.correo = correo;
		this.contrase�a = contrase�a;
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



	@Override
	public String toString() {
		return "ClienteDTO [usuario=" + usuario + ", correo=" + correo + ", contrase�a=" + contrase�a + ", parejas="
				+ parejas + "]";
	}
	
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
