package archivosDB;
import java.util.LinkedList;
/** CREACION DE COLAS
 * cada tarea tiene 2 metodos el cual devolveran 2 valores, uno sera una exception y el otro un valor null
*Creacion Objeto COLA:
*- LinkedList cola=new LinkedList();
*Para Insertar:
*– add(e) -- añade un elemento y devuelve true, si no un exception
*– offer(e) -- Inserta el elemento especificado en el Queue si hay tamaño suficiente. Devuelve un booleano como add
*
*Para Extraer:
*– remove() -- Recupera y elimina la cabeza del Queue. 
*– poll() -- Recupera y elimina la cabeza del Queue o devuelve null si el Queue está vacío.
*
*Para Consultar el Frente:
*– element() -- Recupera sin borrar la cabeza del Queue.
*– peek() -- Recupera sin borrar la cabeza del Queue o devuelve null si el Queue está vacío.
**/
public class Cola {
	private LinkedList<String> cola;
	public Cola() {
		this.cola = new LinkedList<String>();
	}
	
	public void entrarCola(String valor) {
		cola.offer(valor);
	}
	
	public LinkedList<String> getCola() {
		return cola;
	}
	
	public void resetCola() {
		cola.clear();
	}

	/**Consultar el Frente**/
	public String peekCola() {
		return cola.peek();
	}

	public String pollCola() {
		return cola.poll();
	}
}
