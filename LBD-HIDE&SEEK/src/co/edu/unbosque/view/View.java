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

}
