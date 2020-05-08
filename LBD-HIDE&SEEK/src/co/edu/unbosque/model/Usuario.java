package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.UsuarioDAO;

public class Usuario {
	
	
private UsuarioDAO u;





public Usuario() {
	
	
	u= new UsuarioDAO();
	
	
}





public UsuarioDAO getU() {
	return u;
}





public void setU(UsuarioDAO u) {
	this.u = u;
}



}
