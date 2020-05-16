package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

	private ArrayList<SupermercadoDTO> supermercados;
	private ArrayList<ClienteDTO> clientes;
	private BaseDeDatosFile base;

	public UsuarioDAO() {

		supermercados = new ArrayList<>();
		clientes = new ArrayList<>();
		base = new BaseDeDatosFile();

	}

	// hola

	public String agregarcliente(String nombre,String usuario,String cedula, String correo,	String contraseña,String sexo, int parejas) {
		String a = "";
		boolean b = true;
		for (int i = 0; i < clientes.size(); i++) {

			if (clientes.get(i).getUsuario().equals(usuario)) {
				b = false;
				a = "el cliente ya existe";

			}
		}

		if (b == true) {

			ClienteDTO cliente = new ClienteDTO(nombre,usuario,cedula, correo, contraseña,sexo, parejas);			
			clientes.add(cliente);
			
			
			a = "se creo el cliente exitosamente";
			base.escribirUsuario(clientes);
		}

		return a;

	}

	public boolean busquedaPareja(String cedula) {
		for (int i = 0; i < clientes.size(); i++) {
			for (int j = 0; j < clientes.get(i).getLista().size(); j++) {
				if (clientes.get(i).getLista().get(j).getCedula()
						.equals(cedula)) {
					return true;
				}
			}
		}
		return false;
	}

	public String agregarPareja(ClienteDTO cliente, String nombre, double credito, String horario, String cedula) {
		String a= "";
		if(!busquedaPareja(cedula)){
			ParejasDTO nuevo= new ParejasDTO(nombre, credito, horario, cedula);
			cliente.getLista().add(nuevo);
			a= "Pareja registrada con éxito";
			base.escribirUsuario(clientes);
		}else{
			a= "La pareja ya está registrada";
		}
		return a;
	}

	public String agregarSupermercado(String usuario, String almacen, String correo, String contraseña, int sucursales) {
		String a = "";
		boolean b = true;
		for (int i = 0; i < supermercados.size(); i++) {

			if (supermercados.get(i).getUsuario().equals(usuario)
					|| supermercados.get(i).getAlmacen().equals(almacen)) {
				b = false;
				a = "el administrador ya existe";

			}
		}

		if (b == true) {
			SupermercadoDTO supermercado = new SupermercadoDTO(usuario, almacen, correo, contraseña, sucursales);

			supermercados.add(supermercado);
			a = "se creo el administrador exitosamente";
			base.escribirSupermercado(supermercados);
		}
		return a;

	}

	public String borrarCliente(String usuario) {
		String a = "no se encontro";
		for (int i = 0; i < clientes.size(); i++) {

			if (clientes.get(i).getUsuario().equals(usuario)) {

				clientes.remove(i);
				a = "se borro correctamente";
			}
		}
		base.escribirUsuario(clientes);

		return a;

	}

	public String borrarCliente(String usuario, String contraseña) {
		String a = "no se encontro";
		for (int i = 0; i < clientes.size(); i++) {

			if (clientes.get(i).getUsuario().equals(usuario) && clientes.get(i).getContraseña().equals(contraseña)) {

				clientes.remove(i);
				a = "se borro correctamente";
			}
		}
		base.escribirUsuario(clientes);

		return a;

	}

	public String listarClientes() {

		String a = "";
		base.leerUsuario();
		for (int i = 0; i < base.getDatos().size(); i++) {
			a +=    base.getDatos().get(i).getNombre()+"\n"
					+base.getDatos().get(i).getUsuario() + "\n"
					+base.getDatos().get(i).getCedula() + "\n"
					+ base.getDatos().get(i).getContraseña() + "\n"
					+ base.getDatos().get(i).getCorreo() + "\n"
					+base.getDatos().get(i).getSexo() + "\n"
					+ base.getDatos().get(i).getParejas() + "\n";

		}
			System.out.println(a);
		return a;

	}

	public String listarSupermercado() {

		String a = "";
		base.leerSupermercado();
		for (int i = 0; i < base.getDatos1().size(); i++) {
			a += base.getDatos1().get(i).getUsuario() + "\n"
					+ base.getDatos1().get(i).getAlmacen() + "\n"
					+ base.getDatos1().get(i).getCorreo() + "\n"
					+ base.getDatos1().get(i).getContraseña() + "\n"
					+ base.getDatos1().get(i).getSucursales() + "\n";
		}
		System.out.println(a);
		return a;

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
