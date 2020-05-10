package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana_RegTie extends JFrame{
	
	public JLabel nom;
	
	public JTextField nomT;
	
	public Ventana_RegTie() {
		
		setTitle("Registro de nueva tienda");
		setResizable(false);
		setSize(455, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Iniciar();
		setLayout(null);
		setVisible(false);
		setLocationRelativeTo(null);
	}
	public void Iniciar() {
		
	}
}
