package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class panel_Principal extends JPanel{

	private JLabel img;
	private JButton tie;
	private JButton cli;
	private ImageIcon imagen;
	private Icon ico;

	public panel_Principal() {

		inicializarComponentes();
		setLayout(null);
		setVisible(true);
		
	}

	public void inicializarComponentes() {

		img = new JLabel();
		img.setBounds(15, 15, 420, 370);
		img.setBackground(Color.BLACK);
		ImagenR();
		add(img);

		tie = new JButton("Tienda");
		tie.setBounds(15, 390, 200, 50);
		tie.setFocusable(false);
		add(tie);

		cli = new JButton("Cliente");
		cli.setBounds(220, 390, 200, 50);
		cli.setFocusable(false);
		add(cli);

	}
	
	public void ImagenR() {
		imagen = new ImageIcon("src/Imagenes/LogoPru.jpg");
		ico = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
		img.setIcon(ico);
		this.repaint();
	}

	public JLabel getImg() {
		return img;
	}

	public void setImg(JLabel img) {
		this.img = img;
	}

	public JButton getTie() {
		return tie;
	}

	public void setTie(JButton tie) {
		this.tie = tie;
	}

	public JButton getCli() {
		return cli;
	}

	public void setCli(JButton cli) {
		this.cli = cli;
	}

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}

	public Icon getIco() {
		return ico;
	}

	public void setIco(Icon ico) {
		this.ico = ico;
	}
	
	
}

