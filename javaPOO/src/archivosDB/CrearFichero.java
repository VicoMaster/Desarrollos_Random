package archivosDB;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/** MANIPULACION DE ARCHIVOS
 * -File: Clase File reconoce principalmente la ruta del fichero especificado y aporta metodos especiales para este.
 * -FileReader: Clase que abre y lee el archivo especificado
 * -FileWriter: Clase usada para escribir un fichero
 * -BufferedReader: Objeto que permite manipular las lecturas con metodos utiles
 * -readLine(): Metodo que lee linea a linea retorna un NULL al finalizar la secuencia
 * -close(): Importante metodo para cerrar los objetos abiertos o en "Stream" con el exterior y vacia los buffers.
 * -throws IOException: Importante el manejo del error.
 * -flush(): Metodo que vacia los buffers de salida y asegura que todos los datos sean enviados.
 **/
public class CrearFichero {
	List <String> lis;
	private  File archivo;
	private  FileReader fr;
	private  BufferedReader br;
	//private  BufferedWriter bw;
	private  FileWriter fw;
	public CrearFichero() {
		lis= new ArrayList <String>();
		archivo = null;
		fr = null;
		br = null;
		fw = null;
	}
	
	/** Metodo para crear la ruta del archivo**/
	public void creacionRuta() {
		try {
			this.archivo = new File("..\\movimientos.txt");
		} catch (Exception e) {
			System.out.println("ERROR DE CREACION: \n"+e);
		}
	}
	/** Metodo para leer el Fichero --Se debe ejecutar primero creacionArchivo**/
	public void lecturaFichero () throws IOException {
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea+"\r\n");
			}
		} catch (IOException e) {
			System.out.println("ERROR: \n" + e);
		} finally {
			if (null != fr) {
				fr.close();
			}
		}
	}
	
	/** Metodo para escribir dentro del archivo **/
	public void escrituraFichero(ArrayList<String> historico) throws IOException {
		short estado = 0;
		try {
			estado= 1;
			if (archivo.exists() == false) { // El archivo no existe, lo crea y lo escribe
				fw = new FileWriter(archivo);
				fw.write(historico.toString());
				System.out.println("MOVIMIENTO REALIZADO");
				fw.close();
				estado += 1;
			}
			if (estado != 2 & archivo.canRead() & archivo.exists()) { // El archivo existe, se puede leer y agrega mas historico
				fw = new FileWriter(archivo, true);
				System.out.println("HISTORICO ACTUALIZADO");
				fw.write("\n"+historico.toString());
				fw.close();
			}
		} catch (Exception e) {
			System.out.println("ERROR EN ESCRITURA: \n" + e);
		}
	}
	
	/**Elimina el archivo en la ruta especificada**/
	public void deleteArchivo() {
		try {
			if (archivo.exists()) {
				System.out.println("HISTORICO DE MOVIMIENTOS: ");
				lecturaFichero();
				archivo.delete();
			}
		} catch (Exception e) {
			System.err.println("ERROR ON DELETE: "+e);
		}
	}
	
	/**Cierra los Streams Empleados**/
	public void cerrarStreams() throws IOException {
		try {
			fw.close();
		} catch (Exception e) {
			System.out.println("ERROR DE CIERRE: \n"+e);
		}

	}
	
	/**COMPRUEBA SI EL FICHERO ESTA CREADO**/
	public Boolean comprobacionFichero() {
		Boolean estado = null;
		try {
			if (archivo.exists()) {
				estado = true;
			}else {
				estado = false;
			}
		} catch (Exception e) {
			System.out.println("FICHERO NO EXISTE\nerror: "+e);
			estado = false;
		}
		return estado;
	}
	
	public File getRuta() {
		return archivo;
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
	
	/**Retorna lista de Indices con la ubicacion de los nombres**/
	public List<Integer> decifrarIndex(){
		List<Integer> indexos=new ArrayList<Integer>();
		for (int i = 0; i < lis.size(); i++) {
			indexos.add(lis.get(i).indexOf(","));
		}
		return indexos;
	}
	
	public List<String> getLista(){
		return lis;
	}
}
