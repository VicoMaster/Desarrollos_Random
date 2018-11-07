package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Pantalla_Inicial extends JFrame {

	private JPanel panel_principal;
	
	//Cosntructor
	public Pantalla_Inicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel_principal = new JPanel();
		panel_principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_principal.setLayout(new BorderLayout(0, 0));
		setContentPane(panel_principal);
	}
	
	//Metodo Inicial Llamada a la grafica.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_Inicial ventana_init = new Pantalla_Inicial();
				ventana_init.setVisible(true);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}

}
