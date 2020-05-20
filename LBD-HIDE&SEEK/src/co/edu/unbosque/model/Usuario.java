package co.edu.unbosque.model;

import java.util.Properties;
//
//import javax.mail.Message;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;

import co.edu.unbosque.model.persistence.UsuarioDAO;

public class Usuario {
	
	private UsuarioDAO u;

	public Usuario() {
		u = new UsuarioDAO();

	}

//	public void enviarEmail(String email){
//		Properties props= new Properties();		
//		props.setProperty("mail.smtp.host", "smtp.gmail.com");
//		props.setProperty("mail.smtp.starttls.enable", "true");
//		props.setProperty("mail.smtp.port","587");
//		props.setProperty("mail.smtp.user", "LoveByDelivery@gmail.com");
//		props.setProperty("mail.smtp.auth", "true");
//		
//		Session session= Session.getDefaultInstance(props, null);
//		session.getProperties().put("mail.smtp.ssl.trust", "smtp.gmail.com");
//
//		
//		 try {
//			 MimeMessage mensaje = new MimeMessage(session);
//	         mensaje.setFrom(new InternetAddress("LoveByDelivery@gmail.com"));
//	         mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
//	         mensaje.setSubject("Ingreso HIDE&SEEK");
//	         mensaje.setText("Se registró como cliente exitosamente");
//	         
//	         Transport t= session.getTransport("smtp");
//	         t.connect("LoveByDelivery@gmail.com", "123asdf123");
//	         t.sendMessage(mensaje, mensaje.getAllRecipients());
//	         
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public UsuarioDAO getU() {
		return u;
	}

	public void setU(UsuarioDAO u) {
		this.u = u;
	}

}
