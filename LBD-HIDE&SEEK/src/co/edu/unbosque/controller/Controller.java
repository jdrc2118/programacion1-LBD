package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.view.View;




public class Controller implements ActionListener {
	
	
	
	// creamos las variables de los paquetes model y view 
	public View v;
	public Usuario m;

	

	
	
	public Controller() {
		
		//inicializamos las variables 
		v= new View();
		m= new Usuario();
		
		m.getU().agregarcliente("juan","sdda@","456",4);
		v.mostrarMensaje(m.getU().agregarcliente(v.entrarDatoString("nombre de usuario: "), v.entrarDatoString("correo: "), v.entrarDatoString("contraseņa: "), v.entrarDatoInt("numero de parejas: ")));
		v.mostrarMensaje(m.getU().agregarSupermercado(v.entrarDatoString("nombre de usuario: "), v.entrarDatoString("almacen: "), v.entrarDatoString("correo: "), v.entrarDatoString("contraseņa: "),v.entrarDatoInt("sucursales: ")));
		
		
		
//		v.mostrarMensaje(m.getU().borrarCliente(v.entrarDatoString("usuario al que quiere borrar: ")));
		v.mostrarMensaje(m.getU().listarClientes());
		v.mostrarMensaje(m.getU().listarSupermercado());

		
		
		
		
		
		
		
		
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

	
	


}
