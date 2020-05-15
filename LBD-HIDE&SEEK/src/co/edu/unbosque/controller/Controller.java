package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.view.*;
import co.edu.unbosque.view.Ventana_AdminCli;
import co.edu.unbosque.view.Ventana_AdminTie;
import co.edu.unbosque.view.Ventana_Cliente;
import co.edu.unbosque.view.Ventana_Principal;
import co.edu.unbosque.view.Ventana_RegCli;
import co.edu.unbosque.view.Ventana_Tienda;

public class Controller implements ActionListener {

	//Creamos las variables de los paquetes model y view 
	public Usuario m;
	public Ventana_Principal vnt;
	public Ventana_Cliente vntCl;
	public Ventana_Tienda vntTie;
	public Ventana_RegCli vntRegCli;
	public Panel_RegTie pnlRegSup;
	public Ventana_AdminCli vntAdmCli;
	public Ventana_AdminTie vntAdmSup;

	
	
	public Controller() {
		//Inicializamos las variables 
		m= new Usuario();
		vnt = new Ventana_Principal();
		vntCl = new Ventana_Cliente();
		vntTie = new Ventana_Tienda();
		vntRegCli = new Ventana_RegCli();
		pnlRegSup = new Panel_RegTie();
		vntAdmCli = new Ventana_AdminCli();
		vntAdmSup = new Ventana_AdminTie();

		vnt.cli.addActionListener(this);
		vnt.tie.addActionListener(this);
		vntCl.volver.addActionListener(this);
		vntCl.reg.addActionListener(this);
		vntCl.info.addActionListener(this);
		vntCl.admin.addActionListener(this);
		vntTie.volver.addActionListener(this);
		vntTie.reg.addActionListener(this);
		vntTie.info.addActionListener(this);
		vntTie.admin.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(vnt.cli)) {
			vntCl.setVisible(true);
			vnt.setVisible(false);	
		}
		if(e.getSource().equals(vnt.tie)) {
			vntTie.setVisible(true);
			vnt.setVisible(false);
		}
		if(e.getSource().equals(vntCl.volver)) {
			vntCl.setVisible(false);
			vnt.setVisible(true);
		}
		if(e.getSource().equals(vntTie.volver)) {
			vntTie.setVisible(false);
			vnt.setVisible(true);
		}
		if(e.getSource().equals(vntCl.reg)) {
			vntCl.setVisible(false);
			vntRegCli.setVisible(true);
		}
		if(e.getSource().equals(vntCl.info)) {
//			String cedcl = JOptionPane.showInputDialog(null, "Ingresa tú cédula: ");
//			String pass = JOptionPane.showInputDialog(null, "Ingresa tú contraseña: ");
		}
		if(e.getSource().equals(vntCl.admin)) {
			vntCl.setVisible(false);
			//vntAdmCli.setVisible(true);
		}
		if(e.getSource().equals(vntTie.reg)) {
			vntTie.setVisible(false);
			pnlRegSup.setVisible(true);
		}


	}





}
