package archivoSecreto;
import java.util.Hashtable;
/**CREACION DE HASHTABLE:
 * -Declaracion:
 * Hashtable<String,String> contenedor=new Hashtable<String,String>();
 * -Insertar Elementos:
 * nuevahash.put("101","Harry");
 * -Obtener valor:
 * System.out.println(nuevohash.get("101")); 
 * -Recorrer contenido usando una Enumeration<>:
 * Enumeration<String> enumeration = contenedor.elements();
        while (enumeration.hasMoreElements()) {
           System.out.println(""+"hashtable valores: " + enumeration.nextElement());
        }
 * -Mostrar Claves:
 * System.out.println("Claves: " +contenedor.keys());
 **/
public class TablaHash {
	private Hashtable <String,String> hast;
	public TablaHash(){
		hast = new Hashtable<String,String>();
	}
	
	/**Retorna la HashTable**/
	public Hashtable<String,String> getTablahash() {
		return hast;	
	}
	
	/**Inserta Clave/Valor Strings en la Hashtable*/
	public void insertarHash(String uno, String dos) {
		this.hast.put(uno,dos);
	}
}
