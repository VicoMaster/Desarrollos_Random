package modelosProcesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EncontrarFaltantes {
	private static String comparacion;
	private static List <String> [] lista;
	private static List<String> reporte;
	private static  File archivo;
	private static  FileReader fr;
	private static  BufferedReader br;
	
	@SuppressWarnings("unchecked")
	public EncontrarFaltantes() {
		comparacion = "";
		try {
		fr = null;
		br = null;
		lista = new List[2];
		reporte = new ArrayList<String>();
		for (int i = 0; i <= 1; i++) {
			lista[i] = new ArrayList<String>();
		}
		}catch(Exception e) {
			System.out.println("Error ->>>"+e);
		}
	}
	
	public void nombreFichero(String nombre) {
		archivo = new File(nombre);
	}
	
	public void lecturaFicheros (int lugar) throws IOException {
		int posicion = 3;
		if(lugar == 1) {
			posicion = 0;
		}else if(lugar == 2){
			posicion = 1;
		}
		if(posicion == 3) {
			System.out.println("Problema en posicion: "+posicion);
		}
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				lista[posicion].add(linea);
			}
			linea = "";
		} catch (IOException e) {
			lista[posicion].add("Error -> "+e);
			reporte.add("Error: "+e);
			System.out.println("Error --> "+e);
		} finally {
			if (null != fr) {
				fr.close();
				System.out.println("Lista"+lugar+": "+lista[posicion].size()+" "+archivo.toString());
			}
		}
	}
	
	//Lista[0] original  - Lista[1] a comparar
	public void compararFicheros() {
		try {
			for (int i = 0; i < lista[1].size(); i++) {
				comparacion += lista[1].get(i)+" ";
			}
			for (int i = 0; i < lista[0].size(); i++) {
				if(!comparacion.contains(lista[0].get(i))) {
					reporte.add(lista[0].get(i));
				}
			}
		} catch (Exception e) {
			reporte.add("ERROR -> "+e);
			System.out.println("Error: "+e);
		}
	}
	
	public List<String> getContenido() {
		if(reporte.isEmpty()) {
			System.out.println("Sin Faltantes!");
		}
		return reporte;
	}
	
	public List<String> getListado(){
		return lista[1];
	}
	
	public void reiniciarListas() {
		System.err.println("Datos Reiniciados!!!");
		comparacion = "";
		reporte.clear();
		lista[0].clear();
		lista[1].clear();
		System.gc();
	}
}
