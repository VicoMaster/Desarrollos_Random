package manejoHilos;
import java.io.IOException;

/**METODO PRINCIPAL -inicia el primer Hilo**/
public class _HiloMain extends Thread {
	
	/**Metodo Inicial**/
	public static void main(String[]args) throws IOException {
		Thread hiloA = new Thread(new ArranqueProcesado(), "hiloA");
		try {
			Thread.sleep( 500 );
            Thread.currentThread();
        }catch( InterruptedException e ){System.out.println("Error en Proceso: "+e);}
		hiloA.start();
	}
}
