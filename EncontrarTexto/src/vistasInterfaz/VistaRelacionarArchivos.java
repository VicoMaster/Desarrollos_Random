package vistasInterfaz;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;

import controladorHilos.ControlHilos;


@SuppressWarnings("serial")
public class VistaRelacionarArchivos extends JDialog {
	
	private String contenido,salida;
	private JTextField txtIngrese;
	private JTextField txtnombreruta1;
	private JTextField txtruta1;
	private JTextField txtnombreruta2;
	private JTextField txtruta2;
	private JTextArea arearesultado;
	private JTextField txtmensaje;
	private JScrollPane scroll;
	private ControlHilos control;
	private ControlHilos repetidoinit;
	private JButton btrepetido;
	private JTextField txtconsejos;
	private Boolean estado;
	private File rutalogo;
	
	public VistaRelacionarArchivos(javax.swing.JFrame principal) {
		super(principal,"Relacion de Archivos",JDialog.DEFAULT_MODALITY_TYPE);
		setTitle("Relacion de Archivos - Faltantes / Repetidos");
		initialize();
	}

	private void initialize() {
		contenido = "";
		salida = "";
		estado = null;
		rutalogo = new File("logo1.png");
		
		FlowLayout flowLayout = new FlowLayout();
		getContentPane().setLayout(flowLayout);
		repetidoinit = new ControlHilos();
		control = new ControlHilos();
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(rutalogo.getAbsoluteFile().toString()));
		setBounds(100, 100, 750, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		//PanelNorte
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		txtIngrese = new JTextField();
		txtIngrese.setFont(new Font("Segoe UI Semilight", Font.BOLD, 11));
		txtIngrese.setEditable(false);
		txtIngrese.setText("INGRESE LAS RUTAS A COMPARAR - \"agregue  .txt\"");
		txtIngrese.setBorder(null);
		panel.add(txtIngrese);
		txtIngrese.setColumns(30);
		
		//PanelContenedor
		JPanel panelinterior = new JPanel();
		panelinterior.setLayout(new BorderLayout());
		getContentPane().add(panelinterior,BorderLayout.CENTER);
		
		//PanelCentral
		JPanel panelrutas = new JPanel();
		panelrutas.setLayout(new FlowLayout());
		txtnombreruta1 = new JTextField();
		txtnombreruta1.setEditable(false);
		txtnombreruta1.setText("Original - Ruta 1 :");
		txtnombreruta1.setColumns(11);
		txtruta1 = new JTextField();
		txtruta1.setColumns(20);
		txtruta1.setText("C:\\");
		txtnombreruta2 = new JTextField();
		txtnombreruta2.setEditable(false);
		txtnombreruta2.setText("Copia - Ruta 2: ");
		txtnombreruta2.setColumns(10);
		txtruta2 = new JTextField();
		txtruta2.setText("C:\\");
		txtruta2.setColumns(20);
		txtnombreruta1.setBorder(null);
		txtnombreruta2.setBorder(null);
		panelrutas.add(txtnombreruta1);
		panelrutas.add(txtruta1);
		panelrutas.add(txtnombreruta2);
		panelrutas.add(txtruta2);
		panelinterior.add(panelrutas,BorderLayout.NORTH);
		
		
		//PanelCentralDOS
		JPanel panelresultado = new JPanel();
		FlowLayout fl_panelresultado = new FlowLayout();
		fl_panelresultado.setAlignment(FlowLayout.LEFT);
		panelresultado.setLayout(fl_panelresultado);
		arearesultado = new JTextArea();
		arearesultado.setBackground(SystemColor.menu);
		arearesultado.setEditable(false);
		arearesultado.setRows(9);
		arearesultado.setColumns(65);
		arearesultado.setVisible(true);
		scroll = new JScrollPane();
		scroll.setViewportView(arearesultado);
		panelresultado.add(scroll);
		panelinterior.add(panelresultado,BorderLayout.CENTER);
		
		
		
		//panelSur
		JPanel panelsur = new JPanel();
		FlowLayout fl_panelsur = new FlowLayout();
		fl_panelsur.setAlignment(FlowLayout.RIGHT);
		panelsur.setLayout(fl_panelsur);
		txtmensaje = new JTextField();
		txtmensaje.setForeground(SystemColor.textInactiveText);
		txtmensaje.setText("Presione ENTER para iniciar");
		txtmensaje.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		txtmensaje.setEditable(false);
		txtmensaje.setBorder(null);
		txtmensaje.setColumns(20);
		btrepetido = new JButton("REPETIDOS");
		txtconsejos = new JTextField();
		txtconsejos.setEditable(false);
		txtconsejos.setBackground(SystemColor.menu);
		txtconsejos.setForeground(SystemColor.textInactiveText);
		txtconsejos.setText("UTILIDAD:  Presione \u2193 en rutas");
		txtconsejos.setColumns(30);
		txtconsejos.setBorder(null);
		panelsur.add(txtconsejos);
		panelsur.add(txtmensaje);
		panelsur.add(btrepetido);
		getContentPane().add(panelsur,BorderLayout.SOUTH);
		
		
		//Acciones
		
		//Clicks		
		txtruta1.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				eventosClick(1);
			}
		});
		txtruta2.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				eventosClick(2);
			}
		});
		
		btrepetido.addMouseListener(new java.awt.event.MouseAdapter() {
			String error = "";

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				if (e.getClickCount() >= 2 && !e.isConsumed()) {
					e.consume();
					error = "MULTI CLICK";
					arearesultado.setText("Error: #Click: " + e.getClickCount());
				} else if (e.getClickCount() == 1 && !e.isConsumed()) {
					crearContenido(2);
				} else {
					arearesultado.setText("Error: " + error);
				}
			}
		});
		
		//Keys
		
		
		addWindowListener(new WindowAdapter() {  // Validacion boton Cerrar
			public void windowClosing(WindowEvent e) {
			}
		});
		
		arearesultado.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent s){
				if(s.getKeyCode() == KeyEvent.VK_ENTER) {
					llamadoINIT();
				}
		}
		});
		
		txtruta1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					txtruta1.setText("C:\\mio\\comparar\\cmd.txt");
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					llamadoINIT();
				}
			}
		});

		txtruta2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					eventosClick(2);
				}
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					llamadoINIT();
				}
			}
		});

	}
	
	//Crea el contenido faltante(1) y repetido(2)
	public void crearContenido(int opc) {
		contenido = "";
		if(opc == 1) {
			for (int i = 0; i < control.getContenido().size(); i++) {
				contenido += control.getContenido().get(i)+"\n";
			}
		}
		
		if(opc == 2) {
			if(!control.getListado().isEmpty()) {
				System.out.println("Procesando Repetidos...");
				estado = false;
				popCargar();
				Thread proceso = new Thread() {
					public void run() {
						salida = repetidoinit.iniciarBusqueda(control.getListado());	
						arearesultado.setText(salida);
						scroll.getVerticalScrollBar().setValue(scroll.getVerticalScrollBar()
								.getMinimum());
						salida = "";
						try {Thread.sleep(400);}catch(Exception e) {}
						estado = true;
					}
				};
				proceso.start();
			}else {
				arearesultado.setForeground(Color.RED);
				arearesultado.setText("SIN CONTENIDO A COMPARAR");
			}
		}
	}
	
	public void crearProceso() {
		String error = "";
		arearesultado.setText(null);
		arearesultado.setForeground(Color.BLACK);
		try {
			if (txtruta1.getText().equals("") | txtruta2.getText().equals("") | !txtruta1.getText().contains(".txt")
					| !txtruta2.getText().contains(".txt")) {
				arearesultado.setForeground(Color.RED);
				arearesultado.setText("INGRESE RUTAS VALIDAS"
						+ "\n*Compruebe que la ruta contenga .txt");
			} else {
				control.nombreFichero(txtruta1.getText());
				error = control.lecturaFicheros(1);
				control.nombreFichero(txtruta2.getText());
				error = control.lecturaFicheros(2);
				control.compararFicheros();
				crearContenido(1);
				if(!contenido.contains("Exception") | !contenido.contains("Error")) {
					arearesultado.setText(contenido + "\nFALTAN:" + control.getContenido().size());	
				}else {
					arearesultado.setText(contenido.substring((contenido.indexOf(":\\")-1)
							,contenido.indexOf(")"))+")");
				}
			}
		} catch (Exception e) {
			arearesultado.setText(error+" " + e);
			e.printStackTrace();
		}

	}
	

	
	public void eventosClick(int posicion) {
		switch (posicion) {
		case 1:
			if(txtruta2.getText().equals("C:\\")&&txtruta1.getText().equals("C:\\")) {
			txtruta1.setText("C:\\");
			}else {
				txtruta1.setText(txtruta2.getText());
			}
			break;
		case 2:
			if(txtruta1.getText().equals("C:\\")&&txtruta2.getText().equals("C:\\")) {
			txtruta2.setText("C:\\");
			}else {
				txtruta2.setText(txtruta1.getText());
			}
			break;
		default:
			break;
		}
	}
	
	public void llamadoINIT() {
		control.reiniciarListas();
		crearProceso();		
	}
	
	public void popCargar() {
		arearesultado.setText("");
		ModalCarga modal = new ModalCarga(this);
		Thread initmodal = new Thread() {
			public void run() {
				modal.visibilidadCarga(true);
			}
		};
		initmodal.start();
		Thread procesocarga = new Thread() {
			public void run() {
				while(estado == false) {
					try {Thread.sleep(1000);}catch(Exception e) {}
					System.out.println("CARGANDO: "+estado);
				}
				modal.visibilidadCarga(false);
			}
		};
		procesocarga.start();
	}		
	
	//Metodo Run para ControlHilos
	public void iniciarVentanaRelacion(javax.swing.JFrame principal) {
		try {
			VistaRelacionarArchivos window = new VistaRelacionarArchivos(principal);
			window.setVisible(true);
		} catch (Exception e) {
			System.err.println("ERROR -> "+e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args) {
		VistaRelacionarArchivos window = new VistaRelacionarArchivos(null);
		window.txtruta1.setText("C:\\mio\\comparar\\cmd.txt");
		window.txtruta2.setText("C:\\mio\\comparar\\excel.txt");
		window.setVisible(true);
	}
}
