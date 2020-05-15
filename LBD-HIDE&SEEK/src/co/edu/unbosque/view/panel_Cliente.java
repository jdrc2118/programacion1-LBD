package co.edu.unbosque.view;

import javax.swing.*;

public class panel_Cliente extends JPanel {
	
	private JButton reg;
	private JButton info;
	private JButton admin;
	private JButton volver;
	
	public panel_Cliente() {
		
		
		setLayout(null);
		setVisible(false);
		inicializarComponentes();
		
		
	}
	public void inicializarComponentes() {
		
		reg = new JButton("Registrar");
		reg.setBounds(130, 70, 200, 50);
		reg.setFocusable(false);
		add(reg);
		
		info = new JButton("Info. de usuario");
		info.setBounds(130, 140, 200, 50);
		info.setFocusable(false);
		add(info);
		
		admin = new JButton("Administración de usuario");
		admin.setBounds(130, 210, 200, 50);
		admin.setFocusable(false);
		add(admin);
		
		volver = new JButton("Volver");
		volver.setBounds(130, 280, 200, 50);
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
	
	
}
