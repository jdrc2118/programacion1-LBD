package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BaseDeDatosFile {
	
	private String rutaReg = ".//registro.out";
	private ArrayList<ClienteDTO> datos;
	private  ObjectInputStream in;
	
	
	
	public void escribirRegistro(ArrayList<ClienteDTO> lista) {
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
	
	public ArrayList<ClienteDTO> leerRegistro() {
       
		try {
			in = new ObjectInputStream(new FileInputStream(rutaReg));
	        datos = (ArrayList<ClienteDTO>)in.readObject();
	        in.close();
	        for (int i = 0; i < datos.size(); i++) {
//	       
	            
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datos;
	}

	public ArrayList<ClienteDTO> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<ClienteDTO> datos) {
		this.datos = datos;
	}

	

}






