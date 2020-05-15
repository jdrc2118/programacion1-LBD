package co.edu.unbosque.view;

import javax.swing.*;

public class panel_Tienda extends JPanel{

	private JButton reg;
	private JButton info;
	private JButton admin;
	private JButton volver;
	private JButton superv;
	
	public panel_Tienda() {

		setLayout(null);
		setVisible(false);
		inicializarComponentes();
		
	}
	public void inicializarComponentes() {

		superv = new JButton("Registrar Supervisor");
		superv.setBounds(130, 50, 200, 50);
		superv.setFocusable(false);
		add(superv);
		
		reg = new JButton("Registrar");
		reg.setBounds(130, 120, 200, 50);
		reg.setFocusable(false);
		add(reg);

		info = new JButton("Info. de tienda");
		info.setBounds(130, 190, 200, 50);
		info.setFocusable(false);
		add(info);

		admin = new JButton("Administración de tienda");
		admin.setBounds(130, 260, 200, 50);
		admin.setFocusable(false);
		add(admin);

		volver = new JButton("Volver");
		volver.setBounds(130, 330, 200, 50);
		volver.setFocusable(false);
		add(volver);
	}

	public JButton getReg() {
		return reg;
	}
	public void setReg(JButton reg) {
		this.reg = reg;
	}
	public JButton getInfo() {
		return info;
	}
	public void setInfo(JButton info) {
		this.info = info;
	}
	public JButton getAdmin() {
		return admin;
	}
	public void setAdmin(JButton admin) {
		this.admin = admin;
	}
	public JButton getVolver() {
		return volver;
	}
	public void setVolver(JButton volver) {
		this.volver = volver;
	}
	public JButton getSuperv() {
		return superv;
	}
	public void setSuperv(JButton superv) {
		this.superv = superv;
	}
}
