package modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**Esta Clase Construye el Batch para Borrar temporales del Equipo**/
public class Construccion_Batch {
	//Variables Globales de la Clase
	private File cmd_batch;
	
	
	public void creacion_Archivo(String nombre_batch) {
		try {
			File ruta_absoluta = new File("recursos\\"+nombre_batch);
			this.cmd_batch = new File(ruta_absoluta.getAbsolutePath());
		} catch (Exception e) {
			System.out.println("Error Inesperado: "+e);
		}
	}
	
	public void escritura_Archivo(String ruta_usuario) {
		try {
			FileWriter fr = new FileWriter(cmd_batch);
			String orden = "@echo off"+"\r\n"+"cd "+ruta_usuario+"\\AppData\\Local\\Temp"+"\r\n"+"RMDIR /S /Q "+ruta_usuario
					+"\\AppData\\Local\\Temp";
			fr.write(orden);
			fr.flush();
			fr.close();
		} catch (IOException e) {
			System.out.println("Error al escribir batch: "+e);
		}
	}
	
	public void escritura_Archivo2(String ruta_usuario) {
		try {
			FileWriter fr = new FileWriter(cmd_batch);
			String orden = "@echo off"+"\r\n"+"cd "+ruta_usuario+"\\AppData\\Local\\Microsoft\\Windows\\INetCache"+"\r\n"+"RMDIR /S /Q "+ruta_usuario
					+"\\AppData\\Local\\Microsoft\\Windows\\INetCache";
			fr.write(orden);
			fr.flush();
			fr.close();
		} catch (IOException e) {
			System.out.println("Error al escribir batch: "+e);
		}
	}
	
	public void escritura_Archivo3(String ruta_usuario) {
		try {
			FileWriter fr = new FileWriter(cmd_batch);
			String orden = "@echo off"+"\r\n"+"cd \""+ruta_usuario+"\\AppData\\Local\\Microsoft\\Windows\\Temporary Internet Files\""
			+"\r\n"+"RMDIR /S /Q \""+ruta_usuario+"\\AppData\\Local\\Microsoft\\Windows\\Temporary Internet Files\"";
			fr.write(orden);
			fr.flush();
			fr.close();
		} catch (IOException e) {
			System.out.println("Error al escribir batch: "+e);
		}
	}
}
