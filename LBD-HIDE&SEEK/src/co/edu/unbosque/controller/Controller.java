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
		v.getPanel_1().getCli().addActionListener(this);
		v.getPanel_1().getTie().addActionListener(this);
		v.getPanel_c().getVolver().addActionListener(this);
		v.getPanel_t().getVolver().addActionListener(this);
		v.getPanel_c().getReg().addActionListener(this);
		v.getPanel_t().getSuperv().addActionListener(this);
		v.getPanel_rg().getReg().addActionListener(this);
		v.getPanel_rc().getReg().addActionListener(this);

}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Tienda")) {
			
			v.getPanel_1().setVisible(false);
			v.getPanel_t().setVisible(true);
			
			
			
			
		}else if(e.getActionCommand().equals("Cliente")) {
			
			v.getPanel_1().setVisible(false);
			v.getPanel_c().setVisible(true);			
			
			
		}else if(e.getActionCommand().equals("Volver")) {
			
			v.getPanel_1().setVisible(true);			
			v.getPanel_c().setVisible(false);
			v.getPanel_t().setVisible(false);
		}else if (e.getActionCommand().equals("Registrarte")){
			
			v.getPanel_c().setVisible(false);
			v.getPanel_rc().setVisible(true);
		}else if (e.getActionCommand().equals("Registrar")) {
		
			//genero-nombre-cedula
			String aux=v.getPanel_rc().getPareT().getText();			
			int a = Integer.parseInt(aux);
			String sexo="";
			if(v.getPanel_rc().getSex().getSelectedItem().equals("Masculino")) {
				 sexo= "Masculino";
				
			}else {
				sexo="Femenino";
			}
			System.out.println(m.getU().agregarcliente(v.getPanel_rc().getNomT().getText(),v.getPanel_rc().getUserT().getText(),v.getPanel_rc().getCedT().getText(), v.getPanel_rc().getEmailT().getText(), v.getPanel_rc().getClaveT().getText(),sexo,a ));
			
			m.getU().listarClientes();
			v.getPanel_rc().getNomT().setText("");
			v.getPanel_rc().getUserT().setText("");
			v.getPanel_rc().getCedT().setText("");
			v.getPanel_rc().getEmailT().setText("");
			v.getPanel_rc().getClaveT().setText("");
			v.getPanel_rc().getSex().setSelectedItem("Seleccionar...");
			v.getPanel_rc().getPareT().setText("");
			
			
			v.getPanel_1().setVisible(true);
			v.getPanel_rc().setVisible(false);
			
			
		}else if(e.getActionCommand().equals("Registrar Supervisor")) {
			
			v.getPanel_t().setVisible(false);
			v.getPanel_rg().setVisible(true);
			
		}else if(e.getActionCommand().equals("Registrar supervisor")) {
			String aux=v.getPanel_rg().getPareT().getText();
			int a = Integer.parseInt(aux);
			m.getU().agregarSupermercado(v.getPanel_rg().getSupeT().getText(), v.getPanel_rg().getNomT().getText(),v.getPanel_rg().getEmailT().getText() , v.getPanel_rg().getClaveT().getText(), a);
			m.getU().listarSupermercado();
			
			v.getPanel_rg().getSupeT().setText("");
			v.getPanel_rg().getNomT().setText("");
			v.getPanel_rg().getEmailT().setText("");
			v.getPanel_rg().getClaveT().setText("");
			v.getPanel_rg().getPareT().setText("");
			
			v.getPanel_1().setVisible(true);
			v.getPanel_rg().setVisible(false);
		}
		
	}





}
