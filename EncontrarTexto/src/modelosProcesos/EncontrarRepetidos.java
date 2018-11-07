package modelosProcesos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EncontrarRepetidos {

	private List<String> lexaminar = new ArrayList<String>();
	private LinkedList<String> cola = new LinkedList<String>();
	private String repetidos,salida;
	private int cont, posicion;

	public EncontrarRepetidos() {
		repetidos = "";
		salida = "";
		cont = 0;
		posicion = 0;
	}
	

	/** Metodo para llenar la lista a Examinar **/
	public void llenarListas(List<String> lista) {
		for (int i = 0; i < lista.size(); i++) {
			lexaminar.add(lista.get(i));
		}
	}

	/** Metodo para llenar la Cola con la lista a examinar **/
	public void llenarCola() {
		for (int i = 0; i < lexaminar.size(); i++) {
			cola.offer(lexaminar.get(i));
		}
	}

	/**
	 * Metodo para Encontrar los repetidos de una lista, compara la cabeza de la
	 * cola y la borra con cada elemento de la lista.
	 **/
	public void compararRepetidos() {
		while (!cola.isEmpty()) {
			String temporal = cola.remove();
			for (int i = 0; i < lexaminar.size(); i++) {
				if (lexaminar.get(i).contains(temporal)) {
					lexaminar.set(i, "");
					posicion = i;
					for (int j = 0; j < cola.size(); j++) {
						if (cola.get(j).contains(temporal)) {
							cont += 1;
							repetidos += "\n" + temporal + "[" + (posicion + 1) + "]<- linea";
						}
					}
				}
			}
		}
	}

	/** Metodo para formatear el Texto de Salida **/
	public String formatoSalida() {
		cont = cont / 2;
		salida = ("\nSE ENCONTRO " + cont + " REPETIDOS:" + repetidos);
		System.out.println("Repetidos: "+cont);
		return salida;
	}
	
	/**Reiniciar listas Clase: Encontrar Repetidos**/
	public void reiniciarListas() {
		cola.clear();
		lexaminar.clear();
		repetidos = null;
		salida = null;
		posicion = 0;
		cont = 0;
	}
	
	public String  iniciarBusqueda(List<String> lista) {
		String fsalida = "";
		EncontrarRepetidos encontrar = new EncontrarRepetidos();
		try {
			encontrar.llenarListas(lista);
			encontrar.llenarCola();
			encontrar.compararRepetidos();
			fsalida = encontrar.formatoSalida();	
		} catch (Exception e) {
			salida = "ERROR AL PROCESAR: "+e;
			System.out.println(salida);
		}
		return fsalida;
	}
}
