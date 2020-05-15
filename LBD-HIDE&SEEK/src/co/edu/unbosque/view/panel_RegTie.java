package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class panel_RegTie extends JPanel{
	
	private JLabel nom;
	private JLabel supe;
	private JLabel emailsup;
	private JLabel clavesup;
	private JLabel sucursales;
	
	private JTextField nomT;
	private JTextField supeT;
	private JTextField emailT;
	private JPasswordField claveT;
	private JTextField pareT;
	
	private JButton reg;
	
	public panel_RegTie() {
		
		setLayout(null);
		setVisible(false);
		inicializarComponentes();
		
	}
	public void inicializarComponentes() {
		
		nom = new JLabel("Nombre de tienda: ");
		nom.setBounds(40, 40, 150, 20);
		add(nom);
		
		nomT = new JTextField();
		nomT.setBounds(175, 40, 240, 20);
		add(nomT);
		
		supe = new JLabel("Usuario (Alias): ");
		supe.setBounds(40, 90, 150, 20);
		add(supe);
		
		supeT = new JTextField();
		supeT.setBounds(175, 90, 240, 20);
		add(supeT);
		
		emailsup = new JLabel("E-mail: ");
		emailsup.setBounds(40, 140, 150, 20);
		add(emailsup);
		
		emailT = new JTextField();
		emailT.setBounds(175, 140, 240, 20);
		add(emailT);
		
		clavesup = new JLabel("Contraseña: ");
		clavesup.setBounds(40, 190, 150, 20);
		add(clavesup);
		
		claveT = new JPasswordField();
		claveT.setBounds(175, 190, 240, 20);
		add(claveT);
		
		sucursales = new JLabel("Número de sucursales: ");
		sucursales.setBounds(40, 240, 150, 20);
		add(sucursales);
		
		pareT = new JTextField();
		pareT.setBounds(175, 240, 240, 20);
		add(pareT);
		
		reg = new JButton("Registrar");
		reg.setFocusable(false);
		reg.setBounds(175, 370, 100, 30);
		add(reg);
	}
	public JLabel getNom() {
		return nom;
	}
	public void setNom(JLabel nom) {
		this.nom = nom;
	}
	public JLabel getSupe() {
		return supe;
	}
	public void setSupe(JLabel supe) {
		this.supe = supe;
	}
	public JLabel getEmailsup() {
		return emailsup;
	}
	public void setEmailsup(JLabel emailsup) {
		this.emailsup = emailsup;
	}
	public JLabel getClavesup() {
		return clavesup;
	}
	public void setClavesup(JLabel clavesup) {
		this.clavesup = clavesup;
	}
	public JLabel getSucursales() {
		return sucursales;
	}
	public void setSucursales(JLabel sucursales) {
		this.sucursales = sucursales;
	}
	public JTextField getNomT() {
		return nomT;
	}
	public void setNomT(JTextField nomT) {
		this.nomT = nomT;
	}
	public JTextField getSupeT() {
		return supeT;
	}
	public void setSupeT(JTextField supeT) {
		this.supeT = supeT;
	}
	public JTextField getEmailT() {
		return emailT;
	}
	public void setEmailT(JTextField emailT) {
		this.emailT = emailT;
	}
	public JPasswordField getClaveT() {
		return claveT;
	}
	public void setClaveT(JPasswordField claveT) {
		this.claveT = claveT;
	}
	public JTextField getPareT() {
		return pareT;
	}
	public void setPareT(JTextField pareT) {
		this.pareT = pareT;
	}
	public JButton getReg() {
		return reg;
	}
	public void setReg(JButton reg) {
		this.reg = reg;
	}
	
	
}
