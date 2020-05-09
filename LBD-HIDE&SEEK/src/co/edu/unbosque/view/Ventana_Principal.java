package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class Ventana_Principal extends JFrame{

	public JLabel img;
	public JButton sup;
	public JButton cli;
	public ImageIcon imagen;
	public Icon ico;

	public Ventana_Principal() {
		setTitle("Hide&Seek - LBD");
		setResizable(false);
		setSize(455, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Iniciar();
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public void Iniciar() {

		img = new JLabel();
		img.setBounds(15, 15, 420, 370);
		img.setBackground(Color.BLACK);
		ImagenR();
		add(img);

		sup = new JButton("Supervisor");
		sup.setBounds(15, 408, 200, 50);
		sup.setFocusable(false);
		add(sup);

		cli = new JButton("Cliente");
		cli.setBounds(235, 408, 200, 50);
		cli.setFocusable(false);
		add(cli);

	}
	
	public void ImagenR() {
		imagen = new ImageIcon("src/Imagenes/LogoPru.jpg");
		ico = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
		img.setIcon(ico);
		this.repaint();
	}
}

