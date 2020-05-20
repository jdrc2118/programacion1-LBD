package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CreditoExc;
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
		v.getPanel_c().getRegP().addActionListener(this);
		v.getPanel_c().getRegP().addActionListener(this);
		v.getPanel_rp().getComprobar().addActionListener(this);
		v.getPanel_rp().getReg().addActionListener(this);
		v.getPanel_c().getInfo().addActionListener(this);
		v.getPanel_t().getInfo().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(v.getPanel_c().getInfo())) {
			JOptionPane.showInputDialog(null, "","Ingresa cédula: ",JOptionPane.QUESTION_MESSAGE);
		}
		if(e.getSource().equals(v.getPanel_t().getInfo())) {
			JOptionPane.showInputDialog(null, "","Ingresa cédula del supervisor: ",JOptionPane.QUESTION_MESSAGE);
		}

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

		}else if (e.getActionCommand().equals("Registrar Usuario")){

			v.getPanel_c().setVisible(false);
			v.getPanel_rc().setVisible(true);

		}else if (e.getActionCommand().equals("Registrar")) {	
			try {
				String res;
				String aux1 = v.getPanel_rc().getCreditoT().getText();
				int cred = Integer.parseInt(aux1);
				RevCred(cred);
				String aux=v.getPanel_rc().getPareT().getText();			
				int a = Integer.parseInt(aux);
				String sexo="";
				if(v.getPanel_rc().getSex().getSelectedIndex() == 0){
					v.mostrarMensaje("Seleccione un género");
				}else{
					if(v.getPanel_rc().getSex().getSelectedItem().equals("Masculino")) {
						sexo= "Masculino";

					}else {
						sexo="Femenino";
					}
					if(Pattern.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}", v.getPanel_rc().getEmailT().getText())){
						if(Pattern.matches("[0-9]+", v.getPanel_rc().getCedT().getText())){
							if(Pattern.matches("[0-9]+", v.getPanel_rc().getCreditoT().getText())){
								v.mostrarMensaje(m.getU().agregarcliente(v.getPanel_rc().getNomT().getText(), v.getPanel_rc().getCreditoT().getText(), v.getPanel_rc().getUserT().getText(), v.getPanel_rc().getCedT().getText(), v.getPanel_rc().getEmailT().getText(), v.getPanel_rc().getClaveT().getText(), sexo, a ));
//								m.enviarEmail(v.getPanel_rc().getEmailT().getText());

								v.mostrarMensaje(m.getU().listarClientes());
								v.getPanel_rc().getNomT().setText("");
								v.getPanel_rc().getUserT().setText("");
								v.getPanel_rc().getCedT().setText("");
								v.getPanel_rc().getEmailT().setText("");
								v.getPanel_rc().getClaveT().setText("");
								v.getPanel_rc().getSex().setSelectedItem("Seleccionar...");
								v.getPanel_rc().getPareT().setText("");	
								v.getPanel_rc().getCreditoT().setText(null);

								v.getPanel_1().setVisible(true);
								v.getPanel_rc().setVisible(false);
							}else{
								v.mostrarMensaje("Créditos no válido");
							}							
						}else{
							v.mostrarMensaje("Cédula no válida");
						}
					}else{
						v.mostrarMensaje("Email no válido");
					}
				}
			} catch (NumberFormatException e2) {
				v.mostrarMensaje("Datos erróneos: " +e2.getMessage());
			} catch (CreditoExc e1) {
				v.mostrarMensaje("Credito Invalido: " + e1.getMessage());
			}			

		}else if(e.getActionCommand().equals("Registrar Supervisor")) {

			v.getPanel_t().setVisible(false);
			v.getPanel_rg().setVisible(true);

		}else if(e.getActionCommand().equals("Registrar supervisor")) {
			try {
				String aux=v.getPanel_rg().getPareT().getText();
				int a = Integer.parseInt(aux);
				if(Pattern.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}", v.getPanel_rg().getEmailT().getText())){
					if(Pattern.matches("[0-9]+", v.getPanel_rg().getPareT().getText())){
						m.getU().agregarSupermercado(v.getPanel_rg().getSupeT().getText(), v.getPanel_rg().getNomT().getText(),v.getPanel_rg().getEmailT().getText() , v.getPanel_rg().getClaveT().getText(), a);
						m.getU().listarSupermercado();

						v.getPanel_rg().getSupeT().setText("");
						v.getPanel_rg().getNomT().setText("");
						v.getPanel_rg().getEmailT().setText("");
						v.getPanel_rg().getClaveT().setText("");
						v.getPanel_rg().getPareT().setText("");

						v.getPanel_1().setVisible(true);
						v.getPanel_rg().setVisible(false);
					}else{
						v.mostrarMensaje("Ingrese un número de tiendas válido");
					}
				}else{
					v.mostrarMensaje("Correo no válido");
				}
			} catch (NumberFormatException e2) {
				v.mostrarMensaje("Dátos erróneos: " +e2.getMessage());
			}

		}else if(e.getActionCommand().equals("Registrar Pareja")) {			
			v.getPanel_c().setVisible(false);
			v.getPanel_rp().setVisible(true);

			v.mostrarMensaje("Ingrese la cedula del usuario");			

		}else if(e.getActionCommand().equals("Registrar pareja")) {			
			try {
				String aux= v.getPanel_rp().getPorcentaje_creditoT().getText();
				double a = Double.parseDouble(aux);
				String horario= (String)(v.getPanel_rp().getHora().getSelectedItem() +"-" +v.getPanel_rp().getHora2().getSelectedItem() +"-" +v.getPanel_rp().getDiasSemana().getSelectedItem());
				m.getU().agregarPareja(m.getU().buscarUsuario(v.getPanel_rp().getCed_uT().getText()), v.getPanel_rp().getNomT().getText(),v.getPanel_rp().getCedT().getText(), a, v.getPanel_rp().getClave().getText(), horario);
				m.getU().listarClientes();
			} catch (NumberFormatException e2) {
				v.mostrarMensaje("Dátos erróneos: " +e2.getMessage());
			}

		}else if(e.getActionCommand().equals("Comprobar")) {	
			if(preguntarCedula(v.entrarDatoString()).equals("")) {				
				v.mostrarMensaje("La cédula no se encontró");				

			}else {				
				v.getPanel_rp().getNomT().setEnabled(true);
				v.getPanel_rp().getCedT().setEnabled(true);
				v.getPanel_rp().getPorcentaje_creditoT().setEnabled(true);
				v.getPanel_rp().getClave().setEnabled(true);
				v.getPanel_rp().getHora().setEnabled(true);
				v.getPanel_rp().getHora2().setEnabled(true);
				v.getPanel_rp().getDiasSemana().setEnabled(true);
				v.getPanel_rp().getCed_uT().setEnabled(false);				
			}
		}

	}

	public String preguntarCedula(String cedula) {
		String a ="";
		for(int i=0;i<m.getU().getClientes().size();i++) {
			if(m.getU().getClientes().get(i).getCedula().equals(cedula)) {			
				a=cedula;
			}else {

			}		
		}
		return a;		
	}
	public void RevCred(int cred) throws CreditoExc{
		String a = v.getPanel_rc().getCreditoT().getText();
		cred = Integer.parseInt(a);
		if(cred <= 0) {
			throw new CreditoExc();
		}
	}

}
