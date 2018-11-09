package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;


@SuppressWarnings("serial")
public class Pantalla_Inicial extends JFrame {

	private JPanel panel_principal;
	private JPanel panel_norte = new JPanel();
	private JPanel panel_oeste = new JPanel();
	private JPanel panel_este = new JPanel();
	private JPanel panel_central = new JPanel();
	private JPanel panel_sur = new JPanel();
	private JButton btn_crear = new JButton();
	
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
		creacion_Botones();
	}
	
	//Dise�o de Paneles
	public void creacion_Paneles() {
		//Panel Norte
		panel_norte.setBackground(new Color(100, 149, 237));
		panel_principal.add(panel_norte, BorderLayout.NORTH);

		//Panel Oeste
		panel_principal.add(panel_oeste, BorderLayout.WEST);
		
		//Panel Este
		panel_principal.add(panel_este, BorderLayout.EAST);
		
		//Panel Central
		panel_principal.add(panel_central, BorderLayout.CENTER);
		
		//Panel Sur
		panel_principal.add(panel_sur, BorderLayout.SOUTH);
	}
	
	//Dise�o de Botones
	public void creacion_Botones() {
		ImageIcon fondo_btn = new ImageIcon("C:\\Users\\Administrador.DEV-CODE1\\Documents\\ProyectosJavaEclipse\\Recuerdame\\recursos\\boton_azul_low.png");
		btn_crear.setIcon(fondo_btn);
		panel_norte.add(btn_crear);
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
