package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Ventana_RegCli extends JFrame{

	public JLabel nom;
	public JLabel user;
	public JLabel email;
	public JLabel clave;
	public JLabel parejas;
	public JLabel genero;
	
	public JComboBox<String> sex;
	public String [] sexo = {"Seleccionar...","Masculino","Femenino"};
	public JTextField nomT;
	public JTextField userT;
	public JTextField emailT;
	public JTextField claveT;
	public JTextField pareT;
	
	public JButton reg;
	
	public Ventana_RegCli() {
		
		setTitle("Registro de nuevo cliente");
		setResizable(false);
		setSize(455, 345);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Iniciar();
		setVisible(false);
		setLocationRelativeTo(null);
		setLayout(null);
	}
	public void Iniciar() {
		
		nom = new JLabel("Nombre: ");
		nom.setBounds(25, 25, 100, 20);
		add(nom);
		
		nomT = new JTextField();
		nomT.setBounds(180, 25, 250, 20);
		add(nomT);
		
		user = new JLabel("Usuario (Alias): ");
		user.setBounds(25, 60, 100, 20);
		add(user);
		
		userT = new JTextField();
		userT.setBounds(180, 60, 250, 20);
		add(userT);
		
		email = new JLabel("E-mail: ");
		email.setBounds(25, 95, 100, 20);
		add(email);
		
		emailT = new JTextField();
		emailT.setBounds(180, 95, 250, 20);
		add(emailT);
		
		clave = new JLabel("Contraseña: ");
		clave.setBounds(25, 130, 100, 20);
		add(clave);
		
		claveT = new JTextField();
		claveT.setBounds(180, 130, 250, 20);
		add(claveT);
		
		parejas = new JLabel("Número de parejas: ");
		parejas.setBounds(25, 165, 150, 20);
		add(parejas);
		
		pareT = new JTextField();
		pareT.setBounds(180, 165, 250, 20);
		add(pareT);
		
		genero = new JLabel("Genero: ");
		genero.setBounds(25, 200, 100, 20);
		add(genero);
		
		sex = new JComboBox<String>(sexo);
		sex.setFocusable(false);
		sex.setBounds(180, 200, 250, 20);
		add(sex);
		
		reg = new JButton("Registrar");
		reg.setFocusable(false);
		reg.setBounds(175, 250, 100, 50);
		add(reg);
	}
}
