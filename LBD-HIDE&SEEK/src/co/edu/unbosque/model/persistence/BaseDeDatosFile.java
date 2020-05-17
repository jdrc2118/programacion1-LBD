package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BaseDeDatosFile {
	
	private String rutaReg = ".//Usuarios.txt";
	private String rutaReg1 = ".//Administradores.txt";
	private ArrayList<ClienteDTO> datos;
	private ArrayList<SupermercadoDTO> datos1;
	private  ObjectInputStream in;
	
	public void escribirUsuario(ArrayList<ClienteDTO> lista) {
		String mensaje="";
		ArrayList<ClienteDTO> staff = lista;
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}	
	}
	
	public ArrayList<ClienteDTO> leerUsuario() {       
		try {
			in = new ObjectInputStream(new FileInputStream(rutaReg));
	        datos = (ArrayList<ClienteDTO>)in.readObject();
	        in.close();	        

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return datos;
	}
	
	
	public void escribirSupermercado(ArrayList<SupermercadoDTO> lista) {
		String mensaje="";
		ArrayList<SupermercadoDTO> staff = lista;
		

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg1));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}	
		
	}
	
	public ArrayList<SupermercadoDTO> leerSupermercado() {
       
		try {
			in = new ObjectInputStream(new FileInputStream(rutaReg1));
	        datos1 = (ArrayList<SupermercadoDTO>)in.readObject();
	        in.close();
	       
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datos1;
	}
	
	
	
	

	public ArrayList<SupermercadoDTO> getDatos1() {
		return datos1;
	}

	public void setDatos1(ArrayList<SupermercadoDTO> datos1) {
		this.datos1 = datos1;
	}

	public ArrayList<ClienteDTO> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<ClienteDTO> datos) {
		this.datos = datos;
	}

	

}






