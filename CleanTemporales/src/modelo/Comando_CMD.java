package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**Esta Clase Busca el Batch indicado y lo ejecuta,
 * Posteriormente retorna el resultado de la ejecucion
 **/
public class Comando_CMD {
	//Variables Globales para la Clase
	
	/**Metodo donde ejecuta el programa BATCH y se recopila el resultado**/
	public String iniciarOrden(String archivo) {
		String contenido = "";
		String linea = null;
		File ruta_absoluta = new File("recursos\\"+archivo);
		String orden_batch = ruta_absoluta.getAbsolutePath();
		System.out.println(orden_batch);
		try {
			Process proceso = Runtime.getRuntime().exec(orden_batch);
			BufferedReader in = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
			while ((linea = in.readLine()) != null) {
				contenido += "\n"+linea.toString();
			}
		} catch (Exception e) {
			contenido += "Error: "+e;
		}
		return contenido;
	}
	
	/**Metodo para separar la ruta absoluta del directorio del contenido del resultado Batch**/
	public String direccion_Ruta(String contenido) {
		String [] partes = contenido.split("C:");
		String usuario = "C:"+partes[1];
		partes = usuario.split("/");
		usuario = partes[0];
		int tamanno_usuario = usuario.length();
		usuario = usuario.substring(0, (tamanno_usuario - 3));
		String[] usuario_rescue = usuario.split("\\\\"); //Escape de caracter \
		usuario = usuario_rescue[0]+"\\"+usuario_rescue[1]+"\\"+usuario_rescue[2];
		return usuario;
	}
}
