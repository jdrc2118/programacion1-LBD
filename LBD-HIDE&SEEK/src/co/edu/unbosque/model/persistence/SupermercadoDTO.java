package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class SupermercadoDTO implements Serializable {

	
	private String usuario;
	private String almacen;
	private String correo;
	private String contraseña;
	private int sucursales;
	
	
	public SupermercadoDTO(String usuario,String almacen,String correo,String contraseña,int sucursales ) {
		
		this.usuario=usuario;
		this.almacen=almacen;
		this.correo=correo;
		this.contraseña=contraseña;
		this.sucursales =sucursales ;
		
		
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


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public int getSucursales() {
		return sucursales;
	}


	public void setSucursales(int sucursales) {
		this.sucursales = sucursales;
	}


	@Override
	public String toString() {
		return "AdministradorDTO [usuario=" + usuario + ", almacen=" + almacen + ", correo=" + correo + ", contraseña="
				+ contraseña + "]";
	}
	
	
	
	
}
