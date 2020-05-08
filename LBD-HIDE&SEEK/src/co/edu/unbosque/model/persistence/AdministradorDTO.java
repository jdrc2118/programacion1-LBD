package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class AdministradorDTO implements Serializable {

	
	private String usuario;
	private String almacen;
	private String correo;
	private String contrase�a;
	
	
	public AdministradorDTO(String usuario,String almacen,String correo,String contrase�a) {
		
		this.usuario=usuario;
		this.almacen=almacen;
		this.correo=correo;
		this.contrase�a=contrase�a;
		
		
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getAlmacen() {
		return almacen;
	}


	public void setAlmacen(String almacen) {
		this.almacen = almacen;
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


	@Override
	public String toString() {
		return "AdministradorDTO [usuario=" + usuario + ", almacen=" + almacen + ", correo=" + correo + ", contrase�a="
				+ contrase�a + "]";
	}
	
	
	
	
}
