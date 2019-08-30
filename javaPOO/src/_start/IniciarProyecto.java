package _start;
import java.io.IOException;
import ingresosMain.Core;

public class IniciarProyecto {

	public static void main(String[] args) throws IOException {
		try {
			Core.main(null);
		} catch (Exception e) {
			System.out.println("ERROR DE EJECUCION: \n"+e);
		}
	}

}
