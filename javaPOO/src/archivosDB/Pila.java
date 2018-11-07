package archivosDB;
import java.util.*;
/**-CREAR PILA:
 * Stack<String> pila = new Stack<String>();
 * -INSERTAR ELEMENTOS:
 * pila.push("valor");
 * for (int x=1;x<=10;x++)
   	pila.push(Integer.toString(x));
 * -ELIMINAR DATOS DE PILA
 * while (!pila.empty())
  	System.out.println(pila.pop());
  pila.pop();  // Retira elemento de la cima
 * -CONSULTAR ELEMENTO
 * pila.peek();  // DEvuelvo el elemento de la cima
 * -CONSULTA VACIA?
 * pila.empty();  // Retorna true si la pila esta vacia
 */
public class Pila {
	private Stack<String> pilaUno;
	public Pila() {
		pilaUno = new Stack<String>();
	}
	
	public Stack<String> getPila() {
		return pilaUno;
	}
	
	public void apilarPila(String valor) {
		this.pilaUno.push(valor);
	}
	
	public void resetPila() {
		while (!pilaUno.empty()) {
			pilaUno.pop();
		}
	}
}
