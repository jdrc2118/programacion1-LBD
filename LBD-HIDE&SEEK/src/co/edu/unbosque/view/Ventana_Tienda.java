package co.edu.unbosque.view;

import javax.swing.*;

public class Ventana_Tienda extends JFrame{

	public JButton reg;
	public JButton info;
	public JButton admin;
	public JButton volver;
	public JButton superv;
	
	public Ventana_Tienda() {

		setTitle("Tienda");
		setResizable(false);
		Iniciar();
		setLayout(null);
		setVisible(false);
		setSize(520,180);
		setLocationRelativeTo(null);
	}
	public void Iniciar() {

		superv = new JButton("Registrar supervisor");
		superv.setBounds(20, 100, 170, 40);
		superv.setFocusable(false);
		add(superv);
		
		reg = new JButton("Registrar");
		reg.setBounds(20, 20, 100, 40);
		reg.setFocusable(false);
		add(reg);

		info = new JButton("Info. de tienda");
		info.setBounds(140, 20, 150, 40);
		info.setFocusable(false);
		add(info);

		admin = new JButton("Administración de tienda");
		admin.setBounds(310, 20, 190, 40);
		admin.setFocusable(false);
		add(admin);

		volver = new JButton("Volver");
		volver.setBounds(400, 100, 100, 40);
		volver.setFocusable(false);
		add(volver);
	}

}
