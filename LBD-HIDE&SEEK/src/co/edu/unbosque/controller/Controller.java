package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.view.Ventana_Cliente;
import co.edu.unbosque.view.Ventana_Principal;
import co.edu.unbosque.view.Ventana_Supervisor;

public class Controller implements ActionListener {

	//Creamos las variables de los paquetes model y view 
	public Usuario m;
	public Ventana_Principal vnt;
	public Ventana_Cliente vntCl;
	public Ventana_Supervisor vntSup;

	public Controller() {
		//Inicializamos las variables 
		m= new Usuario();
		vnt = new Ventana_Principal();
		vntCl = new Ventana_Cliente();
		vntSup = new Ventana_Supervisor();

		vnt.cli.addActionListener(this);
		vnt.sup.addActionListener(this);
		vntCl.volver.addActionListener(this);
		vntSup.volver.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(vnt.cli)) {
			vntCl.setVisible(true);
			vnt.setVisible(false);	
		}
		if(e.getSource().equals(vnt.sup)) {
			vntSup.setVisible(true);
			vnt.setVisible(false);
		}
		if(e.getSource().equals(vntCl.volver)) {
			vntCl.setVisible(false);
			vnt.setVisible(true);
		}
		if(e.getSource().equals(vntSup.volver)) {
			vntSup.setVisible(false);
			vnt.setVisible(true);
		}

	}





}
