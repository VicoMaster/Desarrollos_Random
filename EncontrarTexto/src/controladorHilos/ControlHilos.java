package controladorHilos;

import java.io.IOException;
import java.util.List;


import modelosProcesos.AbrirArchivo;
import modelosProcesos.EncontrarRepetidos;
import modelosProcesos.EncontrarFaltantes;
import vistasInterfaz.VistaBusqueda;
import vistasInterfaz.VistaRelacionarArchivos;

/**
 * Esta Clase se encargara de Instanciar los procesos del aplicativo
 * Aqui se mantendra la memoria de las instancias y contextos 
 * EVITAR generar instanciamientos en otras partes del programa, para evitar conflicto.
 **/
public class ControlHilos {
	private AbrirArchivo abrir;
	private EncontrarRepetidos repetidoinit;
	private EncontrarFaltantes relacion; 
	public ControlHilos() {
		relacion = new EncontrarFaltantes();
		abrir = new AbrirArchivo();
		repetidoinit = new EncontrarRepetidos();
	}
	
	//METODOS PARA ABRIR VISTAS
	//Vista EncontrarFaltantes
	public void verRelacionArchivos(javax.swing.JFrame principal) {
		Thread vistarelacionar = new Thread() {
			public void run() {
				VistaRelacionarArchivos relacionararchivo= new VistaRelacionarArchivos(principal);
				relacionararchivo.setVisible(true);
				relacionararchivo = null;
				System.gc();
			}
		};
		vistarelacionar.start();
	}
	//Vista Busqueda PRINCIPAL
	public static void main(String[] args) {
		Thread vistainicial = new Thread() {
			public void run() {
				VistaBusqueda vistabusqueda = new VistaBusqueda();
				vistabusqueda.run();	
				vistabusqueda = null;
				System.gc();
			}
		};
		vistainicial.start();
		
		
	}
	
	//METODOS DE PROCESOS CLASE AbrirArchivo
	public void nombreFicheros(String nombre) {
		abrir.nombreFichero(nombre);
	}
	
	public String lecturaFicheros() {
		String error = "";
		try {
			abrir.lecturaFichero();
		} catch (IOException e) {
			error = "LecturaFicheros: "+e;
		}
		return error;
	}
	
	public List<String> retornoLista() {
		return abrir.retornoLista();
	}
	/**Clase: AbrirArchivo**/
	public void resetListas() {
		abrir.resetLista();
	}
	
	//METODOS DE PROCESOS CLASE EncontrarFaltantes
	/**Clase: EncontrarFaltantes**/
	public void reiniciarListas() {
		relacion.reiniciarListas();
	}
	
	public void nombreFichero(String nombre) {
		relacion.nombreFichero(nombre);
	}
	
	public String lecturaFicheros(int posicion) {
		String error = "";
		try {
			if(posicion == 1) {
				relacion.lecturaFicheros(1);
			}else {
				relacion.lecturaFicheros(2);
			}	
		} catch (Exception e) {
			error = "Error en Lectura de ficheros: \n"+e;
		}
		return error;
	}
	
	public void compararFicheros() {
		relacion.compararFicheros();
	}
	
	public List<String> getContenido() {
		return relacion.getContenido();
	}
	
	public List<String> getListado(){
		return relacion.getListado();
	}
	
	//METODOS DE PROCESOS CLASE EncontrarRepetidos
	public String iniciarBusqueda(List<String> lista) {
		String repetido = "";
		repetido = repetidoinit.iniciarBusqueda(lista);
		return repetido;
	}
	
	public void reiniciarListasRepetidos() {
		repetidoinit.reiniciarListas();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalizo");
		super.finalize();
	}
}
