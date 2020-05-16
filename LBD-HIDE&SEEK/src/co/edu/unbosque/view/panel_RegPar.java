package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class panel_RegPar extends JPanel{
	
	private JLabel nom;
	private JLabel ced;
	private JLabel porcentaje_credito;
	private JLabel horario;
	private JLabel ced_U;

	private JTextField nomT;
	private JTextField cedT;
	private JTextField horarioT;
	private JTextField porcentaje_creditoT;
	private JTextField ced_uT;

	
	private JButton reg;
	
	private JButton comprobar;
	
	public panel_RegPar() {

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
		nomT.setEnabled(false);
		add(nomT);
		
		ced = new JLabel("Cédula: ");
		ced.setBounds(40, 90, 150, 20);
		add(ced);
		
		cedT = new JTextField();
		cedT.setBounds(175, 90, 240, 20);
		cedT.setEnabled(false);
		add(cedT);
		
		porcentaje_credito = new JLabel("% credito");
		porcentaje_credito.setBounds(40, 140, 150, 20);
		add(porcentaje_credito);
		
		porcentaje_creditoT = new JTextField();
		porcentaje_creditoT.setBounds(175, 140, 240, 20);
		porcentaje_creditoT.setEnabled(false);
		add(porcentaje_creditoT);
		
		horario = new JLabel("Contraseña: ");
		horario.setBounds(40, 190, 150, 20);
		add(horario);
		
		horarioT = new JPasswordField();
		horarioT.setBounds(175, 190, 240, 20);
		horarioT.setEnabled(false);
		add(horarioT);

		reg = new JButton("Registrar pareja");
		reg.setFocusable(false);
		reg.setBounds(150, 390, 170, 30);
		add(reg);
		
		
		ced_U = new JLabel("Cedula Usuario: ");
		ced_U.setBounds(40,240,150, 20);
		add(ced_U);
		
		ced_uT = new JTextField();
		ced_uT.setBounds(175, 240, 240, 20);
		add(ced_uT);
		
		comprobar = new JButton("comprobar");
		comprobar.setFocusable(false);
		comprobar.setBounds(150, 290, 170, 30);
		add(comprobar);
		
		
	}
	
	
	public JLabel getNom() {
		return nom;
	}
	public void setNom(JLabel nom) {
		this.nom = nom;
	}
	public JLabel getCed() {
		return ced;
	}
	public void setCed(JLabel ced) {
		this.ced = ced;
	}
	public JLabel getPorcentaje_credito() {
		return porcentaje_credito;
	}
	public void setPorcentaje_credito(JLabel porcentaje_credito) {
		this.porcentaje_credito = porcentaje_credito;
	}
	public JLabel getHorario() {
		return horario;
	}
	public void setHorario(JLabel horario) {
		this.horario = horario;
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
	public JTextField getHorarioT() {
		return horarioT;
	}
	public void setHorarioT(JTextField horarioT) {
		this.horarioT = horarioT;
	}
	public JTextField getPorcentaje_creditoT() {
		return porcentaje_creditoT;
	}
	public void setPorcentaje_creditoT(JTextField porcentaje_creditoT) {
		this.porcentaje_creditoT = porcentaje_creditoT;
	}
	public JButton getReg() {
		return reg;
	}
	public void setReg(JButton reg) {
		this.reg = reg;
	}
	public JLabel getCed_U() {
		return ced_U;
	}
	public void setCed_U(JLabel ced_U) {
		this.ced_U = ced_U;
	}
	public JTextField getCed_uT() {
		return ced_uT;
	}
	public void setCed_uT(JTextField ced_uT) {
		this.ced_uT = ced_uT;
	}
	public JButton getComprobar() {
		return comprobar;
	}
	public void setComprobar(JButton comprobar) {
		this.comprobar = comprobar;
	}
	
	

}
