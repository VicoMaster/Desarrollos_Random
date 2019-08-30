package vistasInterfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class ModalCarga extends JDialog {
	private JTextField campocarga;
	private Boolean estado0;
	
	public ModalCarga(javax.swing.JDialog padre) {
		super(padre,"",JDialog.DEFAULT_MODALITY_TYPE);
		setLocationRelativeTo(padre);
		initComponentes();
	}
	
	public void initComponentes() {
		estado0 = null;
		
		//PANTALLA CARGA
		getContentPane().setLayout(new FlowLayout());
		setSize(200,30);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(0);
		campocarga = new JTextField("...",13);
		campocarga.setForeground(new Color(0, 0, 0));
		campocarga.setBorder(new LineBorder(SystemColor.textHighlight, 2));
		campocarga.setBackground(SystemColor.menu);
		campocarga.setFont(new Font("Colonna MT", Font.PLAIN, 19));
		campocarga.setEditable(false);
		campocarga.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(campocarga);
	}

	public void visibilidadCarga(Boolean estado) {
		estado0 = estado;
		if (estado == true) {
			Thread visible = new Thread() {
				public void run() {
					setVisible(true);
				}
			};
			visible.start();
			Thread carga = new Thread() {
				public void run() {
					while (estado0 == true) {
						String cargando = "Cargando";
						String comodin1 = "" ;
						String comodin2 = "";
						for (int i = 0; i <= 3; i++) {
							campocarga.setText(comodin1+cargando+comodin2);
							try {Thread.sleep(200);} catch (Exception e) {}
							comodin1 +="<";
							comodin2 +=">";
						}
					}
				}
			};
			carga.start();
		}
		if (estado == false) {
			estado0 = false;
			dispose();
		}
	}	
}
