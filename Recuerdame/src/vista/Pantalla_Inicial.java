package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

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
		panel_principal.setBorder(new EmptyBorder(7, 7, 7, 7));
		panel_principal.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		setContentPane(panel_principal);
		creacion_Paneles();
		creacion_Botones();
	}
	
	//Disenno de Paneles
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
	
	//Disenno de Botones
	public void creacion_Botones() {
		File ruta_boton = new File("recursos//boton_azul_alpha.png");
		ImageIcon fondo_btn = new ImageIcon(ruta_boton.getAbsolutePath());
		btn_crear.setIcon(fondo_btn);
		btn_crear.setBackground(new Color(100, 149, 237));
		btn_crear.setFocusable(false);
		btn_crear.setBorder(null);
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
