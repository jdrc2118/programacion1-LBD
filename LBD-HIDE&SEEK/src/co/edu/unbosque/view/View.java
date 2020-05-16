package co.edu.unbosque.view;

import javax.swing.JFrame;

public class View extends JFrame{
	
	private panel_Principal panel_1;
	private panel_Cliente panel_c;
	private panel_Tienda panel_t;
	private panel_RegTie panel_rg;
	private panel_RegCli panel_rc;
	private panel_AdminCli panel_ac;
	private panel_AdminTie panel_at;
	
	public View(){
		
		setTitle("Hide&Seek - LBD");
		getContentPane().setLayout(null);
		setSize(455, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inicializarComponentes();

		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {
		
		panel_1 = new panel_Principal();
		panel_1.setBounds(0, 0, 420,450);
		add(panel_1);
		
		panel_c = new panel_Cliente();
		panel_c.setBounds(0, 0, 420,450);
		add(panel_c);
		
		panel_t = new panel_Tienda();
		panel_t.setBounds(0, 0, 420,450);
		add(panel_t);
		
		panel_rg = new panel_RegTie();
		panel_rg.setBounds(0, 0, 420,450);
		add(panel_rg);
		
		panel_rc = new panel_RegCli();
		panel_rc.setBounds(0, 0, 420,450);
		add(panel_rc);
		
		panel_ac = new panel_AdminCli();
		panel_ac.setBounds(0, 0, 420,450);
		add(panel_ac);
		
		panel_at = new panel_AdminTie();
		panel_at.setBounds(0, 0, 420,450);
		add(panel_at);
	}

	public panel_Principal getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(panel_Principal panel_1) {
		this.panel_1 = panel_1;
	}

	public panel_Cliente getPanel_c() {
		return panel_c;
	}

	public void setPanel_c(panel_Cliente panel_c) {
		this.panel_c = panel_c;
	}

	public panel_Tienda getPanel_t() {
		return panel_t;
	}

	public void setPanel_t(panel_Tienda panel_t) {
		this.panel_t = panel_t;
	}

	public panel_RegTie getPanel_rg() {
		return panel_rg;
	}

	public void setPanel_rg(panel_RegTie panel_rg) {
		this.panel_rg = panel_rg;
	}

	public panel_RegCli getPanel_rc() {
		return panel_rc;
	}

	public void setPanel_rc(panel_RegCli panel_rc) {
		this.panel_rc = panel_rc;
	}

	public panel_AdminCli getPanel_ac() {
		return panel_ac;
	}

	public void setPanel_ac(panel_AdminCli panel_ac) {
		this.panel_ac = panel_ac;
	}

	public panel_AdminTie getPanel_at() {
		return panel_at;
	}

	public void setPanel_at(panel_AdminTie panel_at) {
		this.panel_at = panel_at;
	}
	

}
