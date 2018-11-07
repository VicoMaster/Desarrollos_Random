package manejoHilos;

/**Proceso del Segundo Hilo -Genera la Pausa**/
public class Espera extends Thread {
	public void run() {
		System.out.print("PROCESANDO ");
		while (true) {
			try {
				Thread.sleep( 300 );
	            System.out.print(".");
	            Thread.sleep( 300 );
	            System.out.print("* ");
	            Thread.sleep( 300 );
	        }catch( InterruptedException e ){}
		}
	}
}
