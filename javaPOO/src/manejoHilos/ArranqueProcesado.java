package manejoHilos;
import java.io.IOException;

/**Llama el metodo que contiene la orden de los procesos para el HiloPrincipal**/
public class ArranqueProcesado extends Thread {
	ProcesosOrden po = new ProcesosOrden();
	public void run() {
		try {
			po.Procesado();
		} catch (IOException e) {
			System.out.println("SIN PROCESAMIENTO\n"+e);
		}
	}
}
