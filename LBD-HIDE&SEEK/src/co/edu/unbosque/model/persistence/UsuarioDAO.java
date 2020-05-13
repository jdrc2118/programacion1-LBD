package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
	
	
	private ArrayList <SupermercadoDTO> supermercados; 
	private ArrayList <ClienteDTO> clientes; 
	private BaseDeDatosFile base;

	
	
	public UsuarioDAO() {
		
	supermercados=new ArrayList<>();
	clientes=new ArrayList<>();
	base=new BaseDeDatosFile();
		
		
	}
	
	
	public String agregarcliente(String usuario,String correo, String contrase�a,int parejas) {
		String a ="";
		boolean b = true;
		for(int i = 0;i<clientes.size();i++) {
			
			if(clientes.get(i).getUsuario().equals(usuario)) {
				b=false;
				a="el cliente ya existe";
				
				
				}
		}
		
		if(b==true) {
			
		ClienteDTO cliente = new ClienteDTO(usuario,correo,contrase�a,parejas);
		
		clientes.add(cliente);
		a="se creo el cliente exitosamente";
		base.escribirUsuario(clientes);
		}
		
		return a;
		
		
	}
	
	public String agregarSupermercado(String usuario,String almacen,String correo, String contrase�a,int sucursales) {
		String a ="";
		boolean b = true;
		for(int i = 0;i<supermercados.size();i++) {
			
			if(supermercados.get(i).getUsuario().equals(usuario)||supermercados.get(i).getAlmacen().equals(almacen)) {
				b=false;
				a="el administrador ya existe";
				
				
				}
		}
		
		if(b==true) {
		SupermercadoDTO supermercado = new SupermercadoDTO(usuario,almacen,correo,contrase�a,sucursales);
		
		supermercados.add(supermercado);
		a="se creo el administrador exitosamente";
		base.escribirSupermercado(supermercados);
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
		base.escribirUsuario(clientes);
		
		
		return a;
		
	}
	
	public String borrarCliente(String usuario,String contrase�a) {
		String a = "no se encontro";
		for(int i = 0;i<clientes.size();i++) {
			
			if(clientes.get(i).getUsuario().equals(usuario) && clientes.get(i).getContrase�a().equals(contrase�a)) {
			
				clientes.remove(i);
				a="se borro correctamente";
			}
		}
		base.escribirUsuario(clientes);
		
		
		return a;
		
	}
	public String listarClientes() {
		
		String a="";
		base.leerUsuario();
		for(int i = 0; i <base.getDatos().size() ; i++) {
			a+=base.getDatos().get(i).getUsuario()+"\n"+base.getDatos().get(i).getContrase�a()+"\n"+base.getDatos().get(i).getCorreo()+"\n"+base.getDatos().get(i).getParejas()+"\n";
			
		}
		
		
		
		return a ;
		
	}
	
public String listarSupermercado() {
		
		String a="";
		base.leerSupermercado();
		for(int i = 0; i < base.getDatos1().size(); i++) {
			a+=base.getDatos1().get(i).getUsuario()+"\n"+base.getDatos1().get(i).getAlmacen()+"\n"+base.getDatos1().get(i).getCorreo()+"\n"+base.getDatos1().get(i).getContrase�a()+"\n"+base.getDatos1().get(i).getSucursales()+"\n";
		}
		
		
		
		return a ;
		
	}





	public ArrayList<SupermercadoDTO> getSupermercados() {
	return supermercados;
}


public void setSupermercados(ArrayList<SupermercadoDTO> supermercados) {
	this.supermercados = supermercados;
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
