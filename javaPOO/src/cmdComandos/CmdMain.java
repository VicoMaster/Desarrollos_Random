package cmdComandos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class CmdMain {
	public static void main(String[] args) throws IOException {
		String contenido = "";
		int con = 5;
		String orden = "C:\\ProgramasEscritos\\Proyectos Eclipse\\javaPOO\\src\\"
				+ "cmdComandos\\prueba Movimiento\\remplazo.bat";
		String line = null;
		JOptionPane.showMessageDialog(null, "CMD", "ACTUALIZACION", 1);
		try {
			Process proceso = Runtime.getRuntime().exec(orden);
			BufferedReader in = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
			while ((line = in.readLine()) != null) {
				contenido += "\n"+line.toString();
			}
			System.out.println("PROCESOS TERMINADOS");
			System.err.println("Cierre automatico en: ");
			Thread.sleep(200);
			while (con > 0) {
				System.out.println(con);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.err.println("error: " + e);
				}
				con -= 1;
			}
		} catch (Exception e) {
			System.out.println("Error: \n" + e);
		}finally {
			System.out.println(contenido);
		}
	}
}