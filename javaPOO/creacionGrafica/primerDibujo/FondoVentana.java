package primerDibujo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
@SuppressWarnings("serial") // Se suprime implementacion Serializable de Frame
public class FondoVentana extends JFrame{
	private int estadovisible;
	private Button b1,b2,b3,b4;
	private JTextArea campolog;
	private JScrollPane scroll;
	private JPanel panel,panelbotones,panelog;
	public FondoVentana() {
		super("Ventana Ejemplo Grafico");
		setSize(400,400);
		setLocationRelativeTo(null); // Centra los componentes al centro por defecto
		setResizable(false);// Sin ajuste de ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se declara la accion del boton de cerrado
		scroll = new JScrollPane(); // Scroll contenedor del JTextArea
		panel  = new JPanel(); // Panel Base
		panel.setLayout(new BorderLayout());
		panelbotones = new JPanel();
		panelbotones.setLayout(new GridLayout(2, 2));
		panelog = new JPanel();
		panelog.setLayout(new FlowLayout());
		
		this.estadovisible = 1;
		b1 = new Button("USB");
		b1.addKeyListener(new KeyAdapter() {  // Evento Teclado Enter
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					CampoUsb("ACTUALIZAR USB 'desde teclado'");
				}
			}
		});

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CampoUsb("ACTUALIZAR USB");
			}
		});
		panelbotones.add(b1);
		b2 = new Button("LOCAL");
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CampoLocal("ACTUALIZAR LOCAL");
			}
		});
		panelbotones.add(b2);
		b3 = new Button("DESHACER");
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CampoDeshacer("EN CONSTRUCCION");
			}
		});
		panelbotones.add(b3);
		b4 = new Button("LOG");
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CampoLog(estadovisible);
			}
		});
		panelbotones.add(b4);
		campolog = new JTextArea(10,34);
		campolog.setBackground(Color.BLACK);  // Color de Fondo
		campolog.setForeground(Color.white);  // Color de letras
		campolog.setEditable(false);
		scroll.setViewportView(campolog);  // se agrega el jtextarea al scroll
		scroll.setBackground(Color.black);  // color de fondo del scroll
		panelog.add(scroll);
		add(panel);
		panel.add(panelog,"South");
		panel.add("Center",panelbotones);
		setVisible(false);
	}
	public static void main(String[] args) {
		FondoVentana fondo = new FondoVentana();
		fondo.setVisible(true);
	}

	public void CampoLog(int estado) {
		System.out.println("BotonLOG: "+estado);
		if(estado == 1) {
			panelog.setVisible(false);
			this.estadovisible = 0;
		}
		if(estado == 0) {
			panelog.setVisible(true);
			this.estadovisible = 1;
		}
	}
	
	public void CampoLocal(String log) {
		campolog.setText(log);
	}
	public void CampoDeshacer(String log) {
		campolog.setText(log);
	}
	public void CampoUsb(String log) {
		campolog.setText(log);
	}
}