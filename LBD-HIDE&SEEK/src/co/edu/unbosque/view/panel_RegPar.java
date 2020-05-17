package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class panel_RegPar extends JPanel {

	private JLabel nom;
	private JLabel ced;
	private JLabel porcentaje_credito;
	private JLabel clave;
	private JLabel horario;
	private JLabel ced_U;
	private JLabel aux;

	private JTextField nomT;
	private JTextField cedT;
	private JTextField claveT;
	private JTextField porcentaje_creditoT;
	private JTextField ced_uT;

	private JComboBox<String> diasSemana;
	private JComboBox<String> hora;
	private JComboBox<String> hora2;

	private JButton reg;
	private JButton comprobar;

	public panel_RegPar() {

		setVisible(false);
		setLayout(null);
		inicializarComponentes();

	}

	public void inicializarComponentes() {
		nom = new JLabel("Nombre: ");
		nom.setBounds(40, 40, 150, 20);
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

		clave = new JLabel("Contraseña: ");
		clave.setBounds(40, 190, 150, 20);
		add(clave);

		claveT = new JPasswordField();
		claveT.setBounds(175, 190, 240, 20);
		claveT.setEnabled(false);
		add(claveT);

		horario = new JLabel("Horario: ");
		horario.setBounds(40, 240, 150, 20);
		add(horario);

		hora = new JComboBox<String>();
		hora.addItem("1");
		hora.addItem("2");
		hora.addItem("3");
		hora.addItem("4");
		hora.addItem("5");
		hora.addItem("6");
		hora.addItem("7");
		hora.addItem("8");
		hora.addItem("9");
		hora.addItem("10");
		hora.addItem("11");
		hora.addItem("12");
		hora.addItem("13");
		hora.addItem("14");
		hora.addItem("15");
		hora.addItem("16");
		hora.addItem("17");
		hora.addItem("18");
		hora.addItem("19");
		hora.addItem("20");
		hora.addItem("21");
		hora.addItem("22");
		hora.addItem("23");
		hora.addItem("24");
		hora.setBounds(175, 240, 40, 20);
		hora.setEnabled(false);
		add(hora);

		aux = new JLabel("A");
		aux.setBounds(230, 240, 20, 20);
		add(aux);

		hora2 = new JComboBox<String>();
		hora2.addItem("1");
		hora2.addItem("2");
		hora2.addItem("3");
		hora2.addItem("4");
		hora2.addItem("5");
		hora2.addItem("6");
		hora2.addItem("7");
		hora2.addItem("8");
		hora2.addItem("9");
		hora2.addItem("10");
		hora2.addItem("11");
		hora2.addItem("12");
		hora2.addItem("13");
		hora2.addItem("14");
		hora2.addItem("15");
		hora2.addItem("16");
		hora2.addItem("17");
		hora2.addItem("18");
		hora2.addItem("19");
		hora2.addItem("20");
		hora2.addItem("21");
		hora2.addItem("22");
		hora2.addItem("23");
		hora2.addItem("24");
		hora2.setBounds(270, 240, 40, 20);
		hora2.setEnabled(false);
		add(hora2);

		diasSemana = new JComboBox<String>();
		diasSemana.addItem("Lunes");
		diasSemana.addItem("Martes");
		diasSemana.addItem("Miercoles");
		diasSemana.addItem("Jueves");
		diasSemana.addItem("Viernes");
		diasSemana.addItem("Sábado");
		diasSemana.addItem("Domingo");
		diasSemana.setBounds(320, 240, 100, 20);
		diasSemana.setEnabled(false);
		add(diasSemana);

		ced_U = new JLabel("Cedula Usuario: ");
		ced_U.setBounds(40, 290, 150, 20);
		add(ced_U);

		ced_uT = new JTextField();
		ced_uT.setBounds(175, 290, 240, 20);
		add(ced_uT);

		reg = new JButton("Registrar pareja");
		reg.setFocusable(false);
		reg.setBounds(150, 390, 190, 30);
		add(reg);

		comprobar = new JButton("comprobar");
		comprobar.setFocusable(false);
		comprobar.setBounds(150, 340, 170, 30);
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

	public JLabel getClave() {
		return clave;
	}

	public void setClave(JLabel horario) {
		this.clave = horario;
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

	public JComboBox<String> getDiasSemana() {
		return diasSemana;
	}

	public void setDiasSemana(JComboBox<String> diasSemana) {
		this.diasSemana = diasSemana;
	}

	public JComboBox<String> getHora() {
		return hora;
	}

	public void setHora(JComboBox<String> hora) {
		this.hora = hora;
	}

	public JComboBox<String> getHora2() {
		return hora2;
	}

	public void setHora2(JComboBox<String> hora2) {
		this.hora2 = hora2;
	}

}
