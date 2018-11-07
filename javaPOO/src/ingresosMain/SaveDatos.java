package ingresosMain;
import java.util.ArrayList;
import archivosDB.*;
/** CLASE PARA SABER SI ES POSIBLE GUARDAR LOS DATOS EN LA ESTRUCTURA
 * Retorna un valor Booleano si es esto posible
 * y escribe un mensaje de confirmacion
 **/

public class SaveDatos extends Core {
	public Lista lis = new Lista();
	public Pila pl = new Pila();
	Mensajes msn = new Mensajes();
	private Boolean bo;
	
	public SaveDatos() {
		this.bo = false;
	}

	/**COMPRUEBA SI UN VECTOR NO ESTA VACIO Y DEVUELVE FALSE or TRUE**/
	public Boolean guardarLista(ArrayList<String> vec) {
		if (vec.isEmpty() == true) {return false;}
		try {
			if (vec.get(3) != "0") {
				this.bo = true;
			}
			if (vec.get(3) != "0") {
				msn.confirList();
			}else {msn.confirListno();}
		} catch (Exception e) {
			System.out.println("Error en guardarLista: " + e);
		}
		return bo;
	}

	public Boolean guardarPila(ArrayList<String> vec) {
		if (vec.isEmpty()== true) {return false;}
		try {
			if ( vec.get(3) != "0") {
				this.bo = true;
			}
			if (vec.get(3) != "0") {
				msn.confirList();
			} else {
				msn.confirListno();
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return bo;
	}
	public Boolean guardarCola(ArrayList<String> vec) {
		if (vec.isEmpty()== true) {return false;}
		try {
			if ( vec.get(3) != "0") {
				this.bo = true;
			}
			if (vec.get(3) != "0") {
				msn.confirList();
			} else {
				msn.confirListno();
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return bo;
	}
}
