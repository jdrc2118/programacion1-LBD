package co.edu.unbosque.model.persistence;

import java.io.Serializable;
import java.util.ArrayList;

public class ClienteDTO implements Serializable{
	
	
	private String usuario;
	private String correo;
	private String contraseña;
	private int parejas;
	private ArrayList <ParejasDTO> lista;
	
	
	
	public ClienteDTO(String usuario,String correo, String contraseña, int parejas) {
		this.usuario = usuario;
		this.correo = correo;
		this.contraseña = contraseña;
		this.parejas = parejas;
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

	

	public ArrayList<ParejasDTO> getLista() {
		return lista;
	}



	public void setLista(ArrayList<ParejasDTO> lista) {
		this.lista = lista;
	}



	@Override
	public String toString() {
		return "ClienteDTO [usuario=" + usuario + ", correo=" + correo + ", contraseña=" + contraseña + ", parejas="
				+ parejas + "]";
	}
	
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
