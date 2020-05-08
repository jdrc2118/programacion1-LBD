package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
		
		
		
		
		
		public View() {
		
			
			
			 
		}


		
		
		
		
		public void mostrarMensaje(String mensaje){
			JOptionPane.showMessageDialog(null, mensaje);
			
			
		}
		public String entrarDatoString(String mensaje) {
			
			String a=JOptionPane.showInputDialog(mensaje);
			if(a.equals("")) {
				mostrarMensaje("no ingreso nada");
				a="";
			}
			return a;
			
		}
		public int entrarDatoInt(String mensaje) {
			String a=JOptionPane.showInputDialog(mensaje);
			int aux =0;
			if(a.equals("")) {
			
			}else {
				 aux = Integer.parseInt(a);
				return aux;
			}
			return aux;
			
		}




	
		
		
	


		
		
		
		

}
