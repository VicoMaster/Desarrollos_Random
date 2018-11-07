package archivosDB;
import java.util.*;
/** -CrearLista:
 *  List ejemploLista = new ArrayList();
 * 	-DeclararTipoDato:
 *  List<String> ejemploLista = new ArrayList<String>();
 *	-AgregarElement:
 *  ejemploLista.add("Peter");
 *  -CantidadElementos:
 *  ejemploLista.size();
 *  -ConsultarLista:
 *  ejemploLista.get(0);
 *  -EliminarElemento:
 *  ejemploLista.remove(0); and  ejemploLista.remove("Jean");
 *  -ImprimirLista: 
 *  System.out.println(ejemploLista);
 *  for (int i = 0; i <= ejemploLista.size() - 1; i++) {  para imprimir elemento a elemento
            System.out.println(ejemploLista.get(i));
        }
    Iterator i = ejemploLista.iterator();
    while(i.hasNext()){  Con iterador 
        System.out.println(i.next());
    }
 *	-LimpiarLista: "borrarlementos":
 *	ejemploLista.clear();
 *	-COntieneAlgo? False or true:
 *	ejemploLista.isEmpty();
 *	-ContieneParametro:
 *	ejemploLista.contains("José");
 *	-CambiarParametroporIndice:
 *	ejemploLista.set(1, "Félix")
 *	-Imprimir Indices:
 *	ejemploLista.subList(0, 2)
 *
 */

public class Lista {
	private List<String> listuno;
	public Lista() {
		listuno = new ArrayList<String>();
	}
	
	public List<String> getLista() {
		return listuno;
	}
	
	public void addLista(String valor) {
		listuno.add(valor);
	}
	
	public void clearLista() {
		listuno.clear();
	}
	
}
