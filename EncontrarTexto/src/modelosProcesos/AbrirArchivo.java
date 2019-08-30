package modelosProcesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AbrirArchivo {
	private List <String> lista;
	private File archivo;
	private FileReader fr;
	private BufferedReader br;
	
	public AbrirArchivo() {
		fr = null;
		br = null;
		lista = new ArrayList<String>();
	}
	
	//Nombre del Fichero
	public void nombreFichero(String nombre) {
		archivo = new File(nombre);
	}
	
	//Hace la lectura y graba en lista
	public void lecturaFichero () throws IOException {
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				if (linea.contains(".scl")) {
					String[] separador1 = linea.split("scl");
					for (int i = 0; i < separador1.length; i++) {
						lista.add(separador1[i]+"scl");
					}
				}
			}
		} catch (IOException e) {
			lista.add("Error -> "+e);
		} finally {
			if (null != fr) {
				fr.close();
			}
		}
	}
	
	//Retorna Lista con los Scripts
	public List<String > retornoLista() {
		return lista;
	}
	
	/**Reset Listas Clase: AbrirArchivo**/
	public void resetLista() {
		lista.clear();
	}

}
