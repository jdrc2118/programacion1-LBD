package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
	
	
	private ArrayList <AdministradorDTO> administradores; 
	private ArrayList <ClienteDTO> clientes; 
	private BaseDeDatosFile base;

	
	
	public UsuarioDAO() {
		
	administradores=new ArrayList<>();
	clientes=new ArrayList<>();
	base=new BaseDeDatosFile();
		
		
	}
	
	
	public String agregarcliente(String usuario,String correo, String contraseña,int parejas) {
		String a ="";
		boolean b = true;
		for(int i = 0;i<clientes.size();i++) {
			
			if(clientes.get(i).getUsuario().equals(usuario)) {
				b=false;
				a="el cliente ya existe";
				
				
				}
		}
		
		if(b==true) {
			
		ClienteDTO cliente = new ClienteDTO(usuario,correo,contraseña,parejas);
		
		clientes.add(cliente);
		a="se creo el cliente exitosamente";
		//base.escribirRegistro(clientes);
		}
		
		return a;
		
		
	}
	
	public String agregarAdministrador(String usuario,String almacen,String correo, String contraseña) {
		String a ="";
		boolean b = true;
		for(int i = 0;i<administradores.size();i++) {
			
			if(administradores.get(i).getUsuario().equals(usuario)||administradores.get(i).getCorreo().equals(correo)) {
				b=false;
				a="el administrador ya existe";
				
				
				}
		}
		
		if(b==true) {
		AdministradorDTO cliente = new AdministradorDTO(usuario,almacen,correo,contraseña);
		
		administradores.add(cliente);
		a="se creo el administrador exitosamente";
		//base.escribirRegistro(clientes);
		}
		return a;
		
		
	}
	
	public String borrarCliente(String usuario) {
		String a = "no se encontro";
		for(int i = 0;i<clientes.size();i++) {
			
			if(clientes.get(i).getUsuario().equals(usuario)) {
			
				clientes.remove(i);
				a="se borro correctamente";
			}
		}
		//base.escribirRegistro(clientes);
		
		
		return a;
		
	}
	
	public String borrarCliente(String usuario,String contraseña) {
		String a = "no se encontro";
		for(int i = 0;i<clientes.size();i++) {
			
			if(clientes.get(i).getUsuario().equals(usuario) && clientes.get(i).getContraseña().equals(contraseña)) {
			
				clientes.remove(i);
				a="se borro correctamente";
			}
		}
		//base.escribirRegistro(clientes);
		
		
		return a;
		
	}
	public String listarClientes() {
		
		String a="";
//		base.leerRegistro();
		for(int i = 0; i < clientes.size(); i++) {
			a+=clientes.get(i)+"\n";
		}
		
		
		
		return a ;
		
	}
	
public String listarAdmin() {
		
		String a="";
//		base.leerRegistro();
		for(int i = 0; i < administradores.size(); i++) {
			a+=administradores.get(i)+"\n";
		}
		
		
		
		return a ;
		
	}


	public ArrayList<AdministradorDTO> getAdministradores() {
		return administradores;
	}


	public void setAdministradores(ArrayList<AdministradorDTO> administradores) {
		this.administradores = administradores;
	}


	public ArrayList<ClienteDTO> getClientes() {
		return clientes;
	}


	public void setClientes(ArrayList<ClienteDTO> clientes) {
		this.clientes = clientes;
	}


	public BaseDeDatosFile getBase() {
		return base;
	}


	public void setBase(BaseDeDatosFile base) {
		this.base = base;
	}
	


	
	

}
