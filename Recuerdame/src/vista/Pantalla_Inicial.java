package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Pantalla_Inicial extends JFrame {

	private JPanel panel_principal;
	
	//Constructor
	public Pantalla_Inicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		panel_principal = new JPanel();
		panel_principal.setBorder(new EmptyBorder(15, 15, 15, 15));
		panel_principal.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		setContentPane(panel_principal);
		creacion_Paneles();
	}
	
	//Dise�o de Paneles
	public void creacion_Paneles() {
		JPanel panel_norte = new JPanel();
		panel_norte.setBackground(new Color(100, 149, 237));
		panel_principal.add(panel_norte, BorderLayout.NORTH);
		
		JButton btn_crearpass = new JButton("New button");
		btn_crearpass.setSelectedIcon(new ImageIcon("C:\\Users\\Administrador.DEV-CODE1\\Documents\\ProyectosJavaEclipse\\Recuerdame\\recursos\\boton_azul.png"));
		panel_norte.add(btn_crearpass);

		JPanel panel_oeste = new JPanel();
		panel_principal.add(panel_oeste, BorderLayout.WEST);
		
		JPanel panel_este = new JPanel();
		panel_principal.add(panel_este, BorderLayout.EAST);
		
		JPanel panel_central = new JPanel();
		panel_principal.add(panel_central, BorderLayout.CENTER);
		
		JPanel panel_sur = new JPanel();
		panel_principal.add(panel_sur, BorderLayout.SOUTH);
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
