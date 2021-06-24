package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JTextField;
import java.awt.SystemColor;

//Importa Packete Controlador
import controlador.*;

public class Gui_User {
	//Variables Globales para Vista de Usuario.
	private JFrame frame;
	private JButton boton_borrarcache;
	private JTextArea txtarea_regis;
	private JTextField txtderechos;

	//Metodo Constructor
	public Gui_User() {
		boton_borrarcache = new JButton();
		ConstruirGui();
		ConstruirActionBoton();
	}
	
	//Constructor de la GUI
	private void ConstruirGui(){
		//Frame Principal
		frame = new JFrame();
		frame.setResizable(false);
		File ruta_icono = new File("recursos\\icono_clean.png");
		System.out.println(ruta_icono.getAbsolutePath());
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ruta_icono.getAbsolutePath()));
		frame.setBounds(100, 100, 450, 230);
		frame.setTitle("Limpieza del Sistema");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Frame Contenedor
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		//Boton Borrar Cache
		boton_borrarcache.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		boton_borrarcache.setText("BORRAR CACHE DEL SISTEMA");
		boton_borrarcache.setFocusable(false);
		boton_borrarcache.setForeground(new Color(255, 240, 245));
		boton_borrarcache.setBackground(new Color(112, 128, 144));;
		panel.add(boton_borrarcache);
		
		//Area de Texto 
		txtarea_regis = new JTextArea();
		txtarea_regis.setFont(new Font("Footlight MT Light", Font.PLAIN, 18));
		txtarea_regis.setText("\n    ESTE PROGRAMA LIMPIARA LA CACHE DEL SISTEMA"
				+ "\n                  Presione el Boton para Empezar.");
		txtarea_regis.setEditable(false);
		panel.add(txtarea_regis);
		
		//Scroll para Area de Texto
		JScrollPane scroll = new JScrollPane(txtarea_regis);
		panel.add(scroll);
		
		//Jtext Derechos Reservados AndresR.Dev
		txtderechos = new JTextField();
		txtderechos.setForeground(SystemColor.textInactiveText);
		txtderechos.setText("                Software Libre para Todos. AndresR_Dev .2021           Release 3.0");
		txtderechos.setEditable(false);
		txtderechos.setColumns(10);
	    frame.getContentPane().add(txtderechos,BorderLayout.SOUTH);
	}

	//Constructor Action Boton
	private void ConstruirActionBoton() {
		boton_borrarcache.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtarea_regis.setText("\n\n\t            Espere...");
				new Thread() {
					public void run() {
						Peticiones rescate_usuario = new Peticiones();
						String confirmacion = rescate_usuario.limpiarCache();
						txtarea_regis.setText(confirmacion);
						frame.setAlwaysOnTop(true);
						frame.setAlwaysOnTop(false);
					}
				}.start();
			}
		});
	}
	
	//Metodo Main para llamar la Vista de la GUI creando el primer proceso.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_User window = new Gui_User();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
