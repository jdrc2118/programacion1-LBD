package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.view.View;


public class Controller implements ActionListener {

	//Creamos las variables de los paquetes model y view 
	public Usuario m;
	private View v;
	
	
	public Controller() {
		//Inicializamos las variables 
		m= new Usuario();
		v = new View();

}
//	public void actionPerformed(ActionEvent e) {
//
//		if(e.getSource().equals(vnt.cli)) {
//			vntCl.setVisible(true);
//			vnt.setVisible(false);	
//		}
//		if(e.getSource().equals(vnt.tie)) {
//			vntTie.setVisible(true);
//			vnt.setVisible(false);
//		}
//		if(e.getSource().equals(vntCl.volver)) {
//			vntCl.setVisible(false);
//			vnt.setVisible(true);
//		}
//		if(e.getSource().equals(vntTie.volver)) {
//			vntTie.setVisible(false);
//			vnt.setVisible(true);
//		}
//		if(e.getSource().equals(vntCl.reg)) {
//			vntCl.setVisible(false);
//			vntRegCli.setVisible(true);
//		}
//		if(e.getSource().equals(vntCl.info)) {
////			String cedcl = JOptionPane.showInputDialog(null, "Ingresa tú cédula: ");
////			String pass = JOptionPane.showInputDialog(null, "Ingresa tú contraseña: ");
//		}
//		if(e.getSource().equals(vntCl.admin)) {
//			vntCl.setVisible(false);
//			//vntAdmCli.setVisible(true);
//		}
//		if(e.getSource().equals(vntTie.reg)) {
//			vntTie.setVisible(false);
//			pnlRegSup.setVisible(true);
//		}
//
//
//	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}





}
