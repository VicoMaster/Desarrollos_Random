package vistasInterfaz;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import controladorHilos.ControlHilos;

import javax.swing.JTextArea;
import java.awt.Toolkit;

import javax.swing.DefaultFocusManager;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.KeyboardFocusManager;
import java.awt.SystemColor;


public class VistaBusqueda  {
	
	private int click = 0;
	private String palabra;
	private static JFrame frameprincipal;
	private static JTextField textarchivo;
	
	public VistaBusqueda() {
		initialize();
	}

	private void initialize() {
		
		JScrollPane scroll;
		ControlHilos controlhilo = new ControlHilos();
		JTextField campourl;
		JTextField txtextension;
		JTextField txtpalabra;
		JTextField txtinfo1;
		JTextField txtinfo2;
		JTextField txtinfo3;
		File rutalogo;
		
		// Declaracion
		palabra = "";
		rutalogo = new File("busqueda.png");
		
		frameprincipal = new JFrame();
		frameprincipal.setIconImage(Toolkit.getDefaultToolkit().getImage(rutalogo.getAbsoluteFile().toString()));
		frameprincipal.setTitle("Busqueda");
		frameprincipal.setResizable(false);
		frameprincipal.setBounds(100, 100, 720, 100);
		frameprincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameprincipal.setLocationRelativeTo(null);
		
		//PanelNorte
		JPanel panelnorte = new JPanel();
		textarchivo = new JTextField();
		textarchivo.setColumns(12);
		campourl = new JTextField();
		campourl.setEditable(false);
		campourl.setText("C:\\mio");
		campourl.setColumns(23);
		txtextension = new JTextField();
		txtextension.setText(".a2m");
		txtextension.setEditable(false);
		txtextension.setColumns(6);
		txtpalabra = new JTextField();
		txtpalabra.setEditable(false);
		txtpalabra.setText("Script");
		panelnorte.add(campourl);
		panelnorte.add(textarchivo);
		panelnorte.add(txtextension);
		panelnorte.add(txtpalabra);
		txtpalabra.setColumns(10);
		JButton btnResultados = new JButton("Resultados");
		btnResultados.setFocusable(false);
		panelnorte.add(btnResultados);
		frameprincipal.getContentPane().add(panelnorte, BorderLayout.NORTH);
		
		//PanelCentral
		JPanel panelcentral = new JPanel();
		JTextArea arealeida = new JTextArea();
		panelcentral.setFocusable(false);
		scroll = new JScrollPane(); 
		arealeida.setEditable(false);
		arealeida.setRows(20);
		arealeida.setColumns(60);
		scroll.setViewportView(arealeida);
		panelcentral.add(scroll);
		panelcentral.setFocusable(false);
		frameprincipal.getContentPane().add(panelcentral, BorderLayout.CENTER);
		
		//PanelSur
		JPanel panelsur = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelsur.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		txtinfo1 = new JTextField();
		txtinfo1.setForeground(SystemColor.textInactiveText);
		txtinfo1.setEditable(false);
		txtinfo1.setText("  ENTER para buscar  -");
		txtinfo1.setColumns(12);
		txtinfo1.setBorder(null);
		txtinfo1.setFocusable(false);
		txtinfo2 = new JTextField();
		txtinfo2.setText("Ruta / Archivo / Extensi\u00F3n /  Palabra(buscar)  -");
		txtinfo2.setEditable(false);
		txtinfo2.setForeground(SystemColor.textInactiveText);
		txtinfo2.setColumns(23);
		txtinfo2.setBorder(null);
		txtinfo2.setFocusable(false);
		txtinfo3 = new JTextField();
		txtinfo3.setFocusable(false);
		txtinfo3.setForeground(SystemColor.textInactiveText);
		txtinfo3.setEditable(false);
		txtinfo3.setText("Doble Click para editar");
		txtinfo3.setColumns(14);
		txtinfo3.setBorder(null);
		JButton btrelacion = new JButton("Repetidos/Faltantes");
		btrelacion.setFocusable(false);
		panelsur.add(txtinfo1);
		panelsur.add(txtinfo2);
		panelsur.add(txtinfo3);
		panelsur.add(btrelacion);
		panelsur.setFocusable(false);
		frameprincipal.getContentPane().add(panelsur, BorderLayout.SOUTH);
		
		//Acciones
		
		//ESCUCHA DE TECLAS : TAB ESCUCHA - Control de TAB's
		
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(
				new DefaultFocusManager() {
					@Override
					public boolean dispatchKeyEvent(KeyEvent e) {
						//CONDICIONAL ACCION PANTALLA FRAME0
						if(KeyboardFocusManager
								.getCurrentKeyboardFocusManager().
								getActiveWindow().getName().contains("frame0")) {

							//isEditable Other Campos?
							boolean editable = false;
							if(txtextension.isEditable()) {editable=true;txtextension.setFocusable(true);}
							else {txtextension.setFocusable(false);}
							if(campourl.isEditable()) {editable=true;campourl.setFocusable(true);}
							else {campourl.setFocusable(false);}
							if(txtpalabra.isEditable()) {editable = true;txtpalabra.setFocusable(true);}
							else {txtpalabra.setFocusable(false);}
							
							//TECLA TAB
							//Eventos:KEY_PRESSED,KEY_TYPED,KEY_RELEASED
							//mantenido,presionado,suelto
			                 if (KeyEvent.KEY_PRESSED == e.getID() 
			                		 && e.getKeyCode() == KeyEvent.VK_TAB) {
			                	 textarchivo.grabFocus();
			                 }else if(KeyEvent.KEY_RELEASED == e.getID() 
			                		 &&e.getKeyCode() == KeyEvent.VK_TAB
			                		 && !editable) {
			                	 textarchivo.grabFocus();
			                 }
			                 
			                 //ESCUCHA TECLA ENTER
							String contenido = "";
							String error = "";
							palabra = txtpalabra.getText().replace(" ", "");
			                 if(KeyEvent.KEY_RELEASED == e.getID()
			                		 && e.getKeyCode() == KeyEvent.VK_ENTER) {
				                 if(txtextension.isEditable()) {
				                	 txtextension.setEditable(false);
				                 }
				                 if(campourl.isEditable()) {
				                	 campourl.setEditable(false);
				                 }
				                 if(txtpalabra.isEditable()) {
				                	 txtpalabra.setEditable(false);
				                 }
				                 
			 					controlhilo.nombreFicheros(campourl.getText() + "\\" + textarchivo.getText().replace(" ", "")
										+txtextension.getText().replace(" ", ""));
								error = controlhilo.lecturaFicheros();
								for (int i = 0; i < controlhilo.retornoLista().size(); i++) {
									if (controlhilo.retornoLista().get(i).contains(palabra)) {
										contenido += controlhilo.retornoLista().get(i)
												.substring(controlhilo.retornoLista().get(i).indexOf(palabra)) + "\n";
									} else {
										contenido += controlhilo.retornoLista().get(i) + "\n";
									}
								}
								if(click == 0) {
									click = 1;
									frameprincipal.setSize(720, 465);
									frameprincipal.setLocationRelativeTo(null);
								}
								if(error == "") {
									arealeida.setText(contenido);
									controlhilo.resetListas();	
									textarchivo.grabFocus();
								}else {
									arealeida.setText(error);
								}
			                 }
			                 
						}
						return super.dispatchKeyEvent(e);
					}
				});
		
		//Campo EXTENSION
		txtextension.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				if (e.getClickCount() >= 2 && !e.isConsumed()) {
					e.consume();
					if(txtextension.isEditable()) {
						txtextension.setEditable(false);
						textarchivo.grabFocus();
					}else {
						txtextension.setEditable(true);
						textarchivo.grabFocus();
					}
				}
			}
		});
		
		//Campo PALABRA
		txtpalabra.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				if (e.getClickCount() >= 2 && !e.isConsumed()) {
					e.consume();
					arealeida.setText("OPCION DESHABILITADA");
				}
			}
		});
		
		//Campo URL
		campourl.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				if (e.getClickCount() >= 2 && !e.isConsumed()) {
					e.consume();
					if(campourl.isEditable()) {
						campourl.setEditable(false);
						textarchivo.grabFocus();
					}else {
						campourl.setEditable(true);	
						textarchivo.grabFocus();
					}
				}
			}
		});
	
		
		
		//BOTONES
		
		
		//Boton Resultados
		btnResultados.addMouseListener(new java.awt.event.MouseAdapter() {
			String error = "";
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				if (e.getClickCount() >= 2 && !e.isConsumed()) {
					e.consume();
					error = "MULTI CLICK";
					arealeida.setText("Error: #Click: " + e.getClickCount());
				} else if (e.getClickCount() == 1 && !e.isConsumed()) {
					if(click == 0) {
						click = 1;
						frameprincipal.setSize(720, 465);
						frameprincipal.setLocationRelativeTo(null);
						textarchivo.grabFocus();
					}else {
						click = 0;
						frameprincipal.setSize(720, 100);
						frameprincipal.setLocationRelativeTo(null);
						textarchivo.grabFocus();
					}
				} else {
					arealeida.setText("Error: " + error);
				}
			}
		});
		
		//Boton Relacion
		btrelacion.addMouseListener(new java.awt.event.MouseAdapter() {
			String error = "";

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				if (e.getClickCount() >= 2 && !e.isConsumed()) {
					e.consume();
					error = "MULTI CLICK";
					arealeida.setText("Error: #Click: " + e.getClickCount());
				} else if (e.getClickCount() == 1 && !e.isConsumed()) {
					palabra = "";
					arealeida.setText("");
					textarchivo.grabFocus();
					controlhilo.verRelacionArchivos(frameprincipal);
				} else {
					arealeida.setText("Error: " + error);
				}
			}
		});
	}
	
	//Metodo Run para ControlHilos
	public void run() {
		try {
			frameprincipal.setVisible(true);
			textarchivo.grabFocus();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
