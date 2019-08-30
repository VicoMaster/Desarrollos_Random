package controlador;
import modelo.*;
public class Peticiones {
	//Variables Globales para la clase
	private String usuario_rescatado;
	
	/**Metodo que solicita el rescate del usuario del batch ruta_directorio**/
	public void rescatar_Usuario() {
		Comando_CMD comando_cmd = new Comando_CMD();
		String resultado = comando_cmd.iniciarOrden("base.bat");
		this.usuario_rescatado = comando_cmd.direccion_Ruta(resultado);
	}
	
	/**Metodo que ejecuta el batch para la limpiaza de Cache**/
	public void ejecutar_BorrarTEMP(String batch) {
		Comando_CMD comando_cmd = new Comando_CMD();
		comando_cmd.iniciarOrden(batch);
	}
	
	/**Metodo que solicita la creacion del archivo batch**/
	public void construirBatch() {
		Construccion_Batch construir_batch = new Construccion_Batch();
		construir_batch.creacion_Archivo("borrar_temporales.bat");
		construir_batch.escritura_Archivo(usuario_rescatado);
	}
	
	public void construirBatch2() {
		Construccion_Batch construir_batch = new Construccion_Batch();
		construir_batch.creacion_Archivo("borrar_temp_internetexpl.bat");
		construir_batch.escritura_Archivo2(usuario_rescatado);
	}
	
	public void construirBatch3() {
		Construccion_Batch construir_batch = new Construccion_Batch();
		construir_batch.creacion_Archivo("borrar_objetos_ie_ruta2.bat");
		construir_batch.escritura_Archivo3(usuario_rescatado);
	}
	
	/**Metodo Madre que mezcla todos los metodos para formar la orden
	 *Retorna la confirmacion 
	 **/
	public String limpiarCache() {
		rescatar_Usuario();
		construirBatch();
		ejecutar_BorrarTEMP("borrar_temporales.bat");
		construirBatch2();
		ejecutar_BorrarTEMP("borrar_temp_internetexpl.bat");
		ejecutar_BorrarTEMP("base_cookies.bat");
		new Thread() {
			public void run() {
				construirBatch3();
				ejecutar_BorrarTEMP("borrar_objetos_ie_ruta2.bat");
			}
		}.start();
		return "\n\n          ***SE HA COMPLETADO CORRECTAMENTE***    ";
	}
}
