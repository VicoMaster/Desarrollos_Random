package progressBar;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class InicioBarra extends JFrame {
	int num;
	JPanel panel;
	JTextArea progreso;
	public InicioBarra() {
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 num = 0;
		 panel = new JPanel();
		 panel.setLayout(new FlowLayout());
		 progreso = new JTextArea(2, 20); // Crear un JProgressBar con valores 0-2000
		 progreso.setBackground(Color.BLACK);
		 progreso.setForeground(Color.GREEN); // Mostrar valor numérico del progreso de la barra
		 progreso.setEditable(false);
		 panel.add(progreso);
		 setContentPane(panel);
	}
	public static void main(String[]args) {
		InicioBarra frame = new InicioBarra(); // Crea un objeto Progress (constructor visto antes).
		frame.pack();
		frame.setVisible(true);
		frame.cargaProgreso();
	}
	
	public void cargaProgreso() {
		String carga = "Cargando";
		while (num <= 20) {
			progreso.setText(carga); // Asignar un valor a la barra de progreso.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(num);
			num += 1;
			carga += ". ";
		}System.exit(1);
	}
}
