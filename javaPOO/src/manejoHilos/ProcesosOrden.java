package manejoHilos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**METODO ORDEN DE PROCESOS -genera el segundo Hilo**/
public class ProcesosOrden extends Thread {
	private Boolean bo = false;
	Thread hiloB = new Thread(new Espera(), "hiloB");

	/**Metodo orden de procedimientos para el PrimerHilo*/
	@SuppressWarnings("deprecation")
	public void Procesado() throws IOException {
		String lec;
		try {
			Scanner sc = new Scanner(System.in);
			List<String> ls = new ArrayList<String>();
			ProcesoLectura pl = new ProcesoLectura();
			System.out.print("Digite una tecla: ");
			lec = sc.nextLine();
			hiloB.start();
			Thread.sleep(3000);
			pl.creacionRuta();
			pl.lecturaFichero();
			ls = pl.decifrarArchivo();
			lec = lec + "";
			sc.close();
			hiloB.stop();
			if (pl.getEstado() == true) {
				System.out.println("\nMOVIMIENTO REALIZADO");
			}else {System.out.println("\nSIN ACCION");}
			System.out.println("\n\nNUMERO DE LINEAS: " + ls.size());
		} catch (OutOfMemoryError e) {
			System.out.println("Ups! Memoria Agotada\n" + e);
		} catch (InterruptedException e) {
			System.out.println("Error de tiempo:\n"+e);}
		System.out.println("ヽ(ヅ)ノ");
	}
	
	public Boolean FinEspera() {
		return bo;
	}
}
