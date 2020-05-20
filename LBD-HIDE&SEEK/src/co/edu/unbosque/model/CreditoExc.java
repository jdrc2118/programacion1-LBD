package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class CreditoExc extends Exception{
	
	public CreditoExc() {
		super("El credito no puede ser menor o igual a 0");
	}

}
