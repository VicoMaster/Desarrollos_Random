package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;


@SuppressWarnings("serial")
public class Pantalla_Inicial extends JFrame {

	private JPanel panel_principal;
	private JPanel panel_norte = new JPanel();
	private JPanel panel_oeste = new JPanel();
	private JPanel panel_este = new JPanel();
	private JPanel panel_central = new JPanel();
	private JPanel pn_cen1 = new JPanel();
	private JPanel pn_cen2 = new JPanel();
	private JPanel pn_cen3 = new JPanel();
	private JPanel panel_sur = new JPanel();
	private JButton btn_crear = new JButton();
	private JButton btn_check = new JButton();
	private JButton btn_deneg = new JButton();
	private JTextArea area_passrandom = new JTextArea();
	private JTextField [] caja_textos = new JTextField[7];
	
	//Constructor
	public Pantalla_Inicial() {
		File ruta_icono = new File("recursos//kiwi_icono.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ruta_icono.getAbsolutePath()));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		panel_principal = new JPanel();
		panel_principal.setBorder(new EmptyBorder(3, 3, 3, 3));
		panel_principal.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		setResizable(false);
		setContentPane(panel_principal);
		creacion_Paneles();
	}
	
	//Disenno de Paneles
	public void creacion_Paneles() {
		//Panel Norte
		panel_norte.setBackground(new Color(100, 149, 237));
		panel_principal.add(panel_norte, BorderLayout.NORTH);
		boton_CrearPass();
		area_PassRandom();
		boton_Check();
		boton_Denegado();

		//Panel Oeste
		panel_principal.add(panel_oeste, BorderLayout.WEST);
		
		//Panel Este
		panel_principal.add(panel_este, BorderLayout.EAST);
		
		//Panel Central
		panel_central.setLayout(new GridLayout(1,3));
		panel_central.add(pn_cen1);
		panel_central.add(pn_cen2);
		panel_central.add(pn_cen3);
		crear_JTextos();
		panel_principal.add(panel_central, BorderLayout.CENTER);
		
		//Panel Sur
		panel_principal.add(panel_sur, BorderLayout.SOUTH);
	}
	
	//Disenno JTextField
	public void crear_JTextos() {
		//Declaracion cada componente
		for (int i = 0; i < caja_textos.length; i++) {
			caja_textos[i] = new JTextField();
		}
		//Uso cada componente
		for (int i = 0; i < caja_textos.length; i++) {
			caja_textos[i].setText("Contraseña Aleatoria: "+(i+1));
			caja_textos[i].setEditable(false);
			pn_cen1.add(caja_textos[i]);
		}
	}
	
	//Disenno de Botones
	public void boton_CrearPass() {
		File ruta_boton = new File("recursos//boton_azul_alpha.png");
		ImageIcon fondo_btn = new ImageIcon(ruta_boton.getAbsolutePath());
		btn_crear.setIcon(fondo_btn);
		btn_crear.setBackground(new Color(100, 149, 237));
		btn_crear.setFocusable(true);
		btn_crear.setBorder(null);
		panel_norte.add(btn_crear);
	}
	public void boton_Check() {
		File ruta_boton = new File("recursos//check_low.png");
		ImageIcon fondo_btn = new ImageIcon(ruta_boton.getAbsolutePath());
		btn_check.setIcon(fondo_btn);
		btn_check.setBackground(Color.white);
		btn_check.setFocusable(true);
		btn_check.setBorder(null);
		panel_norte.add(btn_check);
	}
	public void boton_Denegado() {
		File ruta_boton = new File("recursos//denegado_low.png");
		ImageIcon fondo_btn = new ImageIcon(ruta_boton.getAbsolutePath());
		btn_deneg.setIcon(fondo_btn);
		btn_deneg.setBackground(Color.white);
		btn_deneg.setFocusable(true);
		btn_deneg.setBorder(null);
		panel_norte.add(btn_deneg);
	}
	
	//Disenno de AreaText
	public void area_PassRandom() {
		area_passrandom.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		area_passrandom.setText("\n        AQUI SE CREARA LA CONTRASEÑA");
		area_passrandom.setBorder(new LineBorder(new Color(51, 102, 255)));
		area_passrandom.setPreferredSize(new Dimension(350,63));
		area_passrandom.setEditable(false);
		panel_norte.add(area_passrandom);
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
