package manejoHilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import archivosDB.Cola;

public class ProcesoLectura extends _HiloMain{
	private Boolean estado;
	private Cola col;
	private  FileWriter fw;
	private List <String> lis;
	private  File archivo;
	private  FileReader fr;
	private  BufferedReader br;
	public ProcesoLectura() {
		this.estado = null;
		this.fw = null;
		this.col = new Cola();
		lis= new ArrayList <String>();
		this.archivo = null;
		this.fr = null;
		this.br = null;
	}
	/** Metodo para crear la ruta del archivo**/
	public void creacionRuta() {
		try {
			this.archivo = new File("..\\javaPOO\\src\\manejoHilos\\lectura.txt");
		} catch (Exception e) {
			System.out.println("ERROR DE CREACION: \n"+e);
		}
	}
	
	/** Metodo para leer el Fichero --Se debe ejecutar primero creacionArchivo**/
	public void lecturaFichero () throws IOException {
		List<String> campos = new ArrayList<String>();
		try {
			fw = new FileWriter("..\\javaPOO\\src\\manejoHilos\\copiado.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				try {
					col.entrarCola(linea);
					campos.add(col.pollCola()); ;
				} catch (ArrayIndexOutOfBoundsException a) {
					System.err.println("NO HAY ESPACIO\nERROR: "+a);
				}catch(StackOverflowError s) {
					System.err.println("COLA DESBORDADA"+s);
				}catch(OutOfMemoryError o) {
					System.err.println("ERROR DE MEMORIA: "+o);
				}
			}
			fw.write(campos.toString());
			fw.close();			
		} catch (IOException e) {
			System.out.println("ERROR: \n" + e);
			fw.close();
			this.estado= false;
		} finally {
			if (null != fr) {
				fr.close();
				this.estado = true;
			}
		}
	}
	
	/**Lee las lineas del fichero y las retorna como lista**/
	public List<String> decifrarArchivo () throws IOException {
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				lis.add(linea);
			}
		} catch (IOException e) {
			System.out.println("ERROR: \n" + e);
		} finally {
			if (null != fr) {
				fr.close();
			}
		}
		return lis;
	}
	
	public Boolean getEstado() {
		return estado;
	}

}
