package archivoSecreto;
import ingresosMain.Mensajes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import archivosDB.CrearFichero;

public class SecretoMain {

	public static void main(String[] args) throws IOException {
		String parseo;
		Mensajes mj = new Mensajes();
		TablaHash th = new TablaHash();
		CrearFichero cf = new CrearFichero();
		List<String> datos = new ArrayList<String>();
		mj.saltoLinea();
		mj.menuSecreto();
		cf.creacionRuta();
		if (cf.comprobacionFichero()==true) {
			try {
				cf.creacionRuta();
				cf.decifrarArchivo();// Se cargan los datos del archivo en la lista
				for (int i = 0; i < cf.getLista().size(); i++) {
					datos.add(cf.getLista().get(i).toString().substring(1, cf.decifrarIndex().get(i))); //separa los nombres
				}
				for (int n = 0; n < datos.size(); n++) {// Se cargan los Datos al HashTable
					parseo = Integer.toString(n);
					th.insertarHash(parseo, datos.get(n));
				}
				System.out.println("DATOS SECRETOS: " + th.getTablahash());
			} catch (Exception e) {
				System.out.println("ERROR: " + e);
			}
		}else {
			System.err.println("SIN DATOS SECRETOS");
		}
	}

}
