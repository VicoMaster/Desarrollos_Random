package ingresosMain;
import java.util.*;
/** 
 * -CLASE DATOS:
 * Donde se gestionan todos los procesos de los datos para su buen retorno
 **/

public class Datos{
	private String nombre;
	private String apellido;
	private String cedula;
	private String lectura;
	private int id;
	public ArrayList<String> vector;
	Scanner sc;
	
	public Datos() 
	{
		nombre = " ";
		apellido = " ";
		cedula = " ";
		id = 0;
		sc = new Scanner(System.in);
		vector= new ArrayList<String>();
		
	}
	
	public ArrayList<String> getArray() {
		return vector;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		vector.add(nombre);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
		vector.add(apellido);
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
		vector.add(cedula);
	}
	
	public void setId(int id) {
		if(id > 0) {
			this.id = id;
			vector.add(String.valueOf(id));
		}
	}
	
	public int getId() {
		return id;
	}
	
	public int leerInt(){
		try {
			this.id = sc.nextInt();
		} catch (Exception e) {
			Mensajes mj = new Mensajes();
			mj.saltoLinea();
			System.out.println("ERROR DE INGRESO");
			reset();
		}
		return id;
	}
	
	public String leerDato() {
		this.lectura = sc.nextLine();
		return lectura;
	}
	
	public void reset() {
		this.vector.clear();
		this.nombre = " ";
		this.apellido = " ";
		this.cedula = " ";
		this.id = 0;
	}
	
	public void buferRes() {  //Resetear el Buffer para el Scanner despues de la lectura de un Entero
		sc.nextLine();
	}
	
	/**Solamente devuelve un estado '1,2 o 3'**/
	public int validacionBolean(Boolean v1, Boolean v2, Boolean v3) {  // Solo retorna un estado
		int estado;
		estado = 0;
		if (v1 == true) {  // lista
			estado = 1;
		}
		if (v2 == true) {  // cola
			estado = 3;
		}
		if (v3 == true) {  // pila
			estado = 2;
		}
		return estado;
	}
	
}
