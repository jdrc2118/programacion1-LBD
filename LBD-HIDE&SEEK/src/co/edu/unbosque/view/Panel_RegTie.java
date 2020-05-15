package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Panel_RegTie extends JPanel{
	
	public JLabel nom;
	public JLabel supe;
	public JLabel emailsup;
	public JLabel clavesup;
	public JLabel sucursales;
	
	public JTextField nomT;
	public JTextField supeT;
	public JTextField emailT;
	public JPasswordField claveT;
	public JTextField pareT;
	
	public JButton reg;
	
	public Panel_RegTie() {
		
		setSize(455, 345);
		Iniciar();
		setLayout(null);
		setVisible(false);
		
	}
	public void Iniciar() {
		
		nom = new JLabel("Nombre de tienda: ");
		nom.setBounds(25, 25, 120, 20);
		add(nom);
		
		nomT = new JTextField();
		nomT.setBounds(180, 25, 250, 20);
		add(nomT);
		
		supe = new JLabel("Usuario (Alias): ");
		supe.setBounds(25, 60, 100, 20);
		add(supe);
		
		supeT = new JTextField();
		supeT.setBounds(180, 60, 250, 20);
		add(supeT);
		
		emailsup = new JLabel("E-mail: ");
		emailsup.setBounds(25, 95, 100, 20);
		add(emailsup);
		
		emailT = new JTextField();
		emailT.setBounds(180, 95, 250, 20);
		add(emailT);
		
		clavesup = new JLabel("Contraseña: ");
		clavesup.setBounds(25, 130, 100, 20);
		add(clavesup);
		
		claveT = new JPasswordField();
		claveT.setBounds(180, 130, 250, 20);
		add(claveT);
		
		sucursales = new JLabel("Número de parejas: ");
		sucursales.setBounds(25, 165, 150, 20);
		add(sucursales);
		
		pareT = new JTextField();
		pareT.setBounds(180, 165, 250, 20);
		add(pareT);
		
		reg = new JButton("Registrar");
		reg.setFocusable(false);
		reg.setBounds(175, 250, 100, 50);
		add(reg);
	}
}
