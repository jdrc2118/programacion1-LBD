package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class panel_RegCli extends JPanel{

	
	private JLabel nom;
	private JLabel user;
	private JLabel email;
	private JLabel ced;
	private JLabel clave;
	private JLabel parejas;
	private JLabel genero;
	private JLabel credito;
	
	private JComboBox<String> sex;
	private String [] sexo = {"Seleccionar...","Masculino","Femenino"};
	private JTextField nomT;
	private JTextField cedT;
	private JTextField userT;
	private JTextField emailT;
	private JPasswordField claveT;
	private JTextField pareT;
	private JTextField creditoT;
	
	private JButton reg;
	
	public panel_RegCli() {

		setVisible(false);
		setLayout(null);
		inicializarComponentes();
		
	}
	public void inicializarComponentes() {
		
		nom = new JLabel("Nombre: ");
		nom.setBounds(40,40,150, 20);
		add(nom);
		
		nomT = new JTextField();
		nomT.setBounds(175, 40, 240, 20);
		add(nomT);
		
		user = new JLabel("Usuario (Alias): ");
		user.setBounds(40, 90, 150, 20);
		add(user);
		
		userT = new JTextField();
		userT.setBounds(175, 90, 240, 20);
		add(userT);
		
		ced = new JLabel("Cédula: ");
		ced.setBounds(40, 140, 150, 20);
		add(ced);
		
		cedT = new JTextField();
		cedT.setBounds(175, 140, 240, 20);
		add(cedT);
		
		email = new JLabel("E-mail: ");
		email.setBounds(40, 190, 150, 20);
		add(email);
		
		emailT = new JTextField();
		emailT.setBounds(175, 190, 240, 20);
		add(emailT);
		
		clave = new JLabel("Contraseña: ");
		clave.setBounds(40, 240, 150, 20);
		add(clave);
		
		claveT = new JPasswordField();
		claveT.setBounds(175, 240, 240, 20);
		add(claveT);
		
		parejas = new JLabel("Número de parejas: ");
		parejas.setBounds(40, 290, 150, 20);
		add(parejas);
		
		pareT = new JTextField();
		pareT.setBounds(175, 290, 240, 20);
		add(pareT);
		
		genero = new JLabel("Genero: ");
		genero.setBounds(40, 340, 150, 20);
		add(genero);
		
		sex = new JComboBox<String>(sexo);
		sex.setFocusable(false);
		sex.setBounds(175, 340, 240, 20);
		add(sex);
		
		credito = new JLabel("Credito: ");
		credito.setBounds(40, 390, 150, 20);
		add(credito);
		
		creditoT = new JTextField();
		creditoT.setBounds(175, 390, 240, 20);
		add(creditoT);
		
		reg = new JButton("Registrar");
		reg.setFocusable(false);
		reg.setBounds(175, 420, 100, 20);
		add(reg);
	}
	
	public JLabel getNom() {
		return nom;
	}
	public void setNom(JLabel nom) {
		this.nom = nom;
	}
	public JLabel getUser() {
		return user;
	}
	public void setUser(JLabel user) {
		this.user = user;
	}
	public JLabel getEmail() {
		return email;
	}
	public void setEmail(JLabel email) {
		this.email = email;
	}
	public JLabel getCed() {
		return ced;
	}
	public void setCed(JLabel ced) {
		this.ced = ced;
	}
	public JLabel getClave() {
		return clave;
	}
	public void setClave(JLabel clave) {
		this.clave = clave;
	}
	public JLabel getParejas() {
		return parejas;
	}
	public void setParejas(JLabel parejas) {
		this.parejas = parejas;
	}
	public JLabel getGenero() {
		return genero;
	}
	public void setGenero(JLabel genero) {
		this.genero = genero;
	}
	public JComboBox<String> getSex() {
		return sex;
	}
	public void setSex(JComboBox<String> sex) {
		this.sex = sex;
	}
	public String[] getSexo() {
		return sexo;
	}
	public void setSexo(String[] sexo) {
		this.sexo = sexo;
	}
	public JTextField getNomT() {
		return nomT;
	}
	public void setNomT(JTextField nomT) {
		this.nomT = nomT;
	}
	public JTextField getCedT() {
		return cedT;
	}
	public void setCedT(JTextField cedT) {
		this.cedT = cedT;
	}
	public JTextField getUserT() {
		return userT;
	}
	public void setUserT(JTextField userT) {
		this.userT = userT;
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
	public JLabel getCredito() {
		return credito;
	}
	public void setCredito(JLabel credito) {
		this.credito = credito;
	}
	public JTextField getCreditoT() {
		return creditoT;
	}
	public void setCreditoT(JTextField creditoT) {
		this.creditoT = creditoT;
	}
	
}
