/**
 * 
 */
package ingresosMain;
import archivosDB.*;
import java.io.*;
import archivoSecreto.SecretoMain;
/**
 * @author Developer
 *
 */
public class Core {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FechaHora fh = new FechaHora();
		String nombre, apellido, cedula;
		Boolean l,c,p,proceso;
		int id, opc,op;
		short con = 0;
		SaveDatos sd = new SaveDatos();
		CrearFichero cf= new CrearFichero();
		Cola cola = new Cola();
		Lista lis = new Lista();
		Pila pl = new Pila();
		Menu menu = new Menu();
		Datos datos = new Datos();
		Mensajes msn = new Mensajes();
		//Indica la estructura de datos donde desea guardar los datos.
		l =true;  // Lista
		c =false;  // Cola
		p =false;  // Pila
		do{
			opc = menu.menuOpc();
			switch (opc) {
			case 1: // IngresoNuevoUsuario
				msn.saltoLinea();
				if(datos.getArray().isEmpty() == false) {msn.errorInsert();break;}
				try {
					msn.Welcome();
					msn.Digite_Datos();
					msn.Nombre();
					nombre = datos.leerDato();
					datos.setNombre(nombre);
					msn.Apellido();
					apellido = datos.leerDato();
					datos.setApellido(apellido);
					msn.Cedula();
					cedula = datos.leerDato();
					datos.setCedula(cedula);
					msn.Id();
					id = datos.leerInt();
					datos.setId(id);
				} catch (Exception e) {
					System.out.println("Error: " + e);
					con += 5;
				}
				datos.buferRes();
				break;
			case 2:  // Consultar Datos
				msn.saltoLinea();
				if(datos.getId() == 0 ) {
					System.out.println("SIN REGISTROS");
					break;}
				System.out.println("DATOS EN DB\nNombre: " + datos.getNombre() + "\nApellido: " + datos.getApellido()
						+ "\nCedula: " + datos.getCedula() + "\nID: " + datos.getId());
				System.out.println("CACHE: "+datos.getArray());
				break;
			case 3:  // Actualizar datos
				msn.saltoLinea();
				try {
					if(datos.getId() == 0) {
						msn.noDatos();
						break;}
					datos.getArray().clear();
					msn.Digite_Datos();
					msn.Nombre();
					nombre = datos.leerDato();
					datos.setNombre(nombre);
					msn.Apellido();
					apellido = datos.leerDato();
					datos.setApellido(apellido);
					msn.Cedula();
					cedula = datos.leerDato();
					datos.setCedula(cedula);
					msn.Id();
					id = datos.leerInt();
					datos.setId(id);
				} catch (Exception e) {
					System.out.println("Error: " + e);
					con += 5;
				}
				datos.buferRes();
				break;
			case 4:  // Eliminar Datos
				msn.saltoLinea();
				if(datos.getId() == 0) {
					msn.noDatos();
					break;}
				
				datos.reset();
				if(datos.getId()==0) {msn.datClear();}
				break;
			case 5:  /**ALMACENAMIENTO HACIA LA ESTRUCTURA DE DATOS SELECCIONADA
				Cambie el valor de false a true de la estructura que desea usar.
				l = lista   c = Cola   p = Pila
				**/
				try {
					msn.saltoLinea();
					int v;
					v = datos.validacionBolean(l,c,p);
					proceso = sd.guardarLista(datos.getArray());
					if (datos.getId() != 0) {  //Gestion Archivo Historicos
						try {
							cf.creacionRuta();
							cf.escrituraFichero(datos.getArray());
						} catch (Exception e) {
							System.out.println("ERROR EN HISTORICO: \n"+e);
						}
					}
					if (v == 1) {  // Lista
						if (proceso == true) {
							lis.addLista(datos.getArray().get(0));
							break;
						} else {
							msn.confirListno();
							break;
						}
					}
					if(v == 2) {  // Pila
						if (proceso == true) {
							pl.apilarPila(datos.getArray().get(0));
							break;
						} else {
							msn.confirListno();
							break;
						}
					}
					if(v == 3) {  // Cola
						if (proceso == true) {
							cola.entrarCola(datos.getArray().get(0));
							break;
						} else {
							msn.confirListno();
							break;
						}
					}
					System.out.println("ERROR DE PARAMETRIZACION");
					break;
				} finally {
					datos.reset();
				}
				
			case 6:  // Salir
				con += 5;
				msn.saltoLinea();
				if (cf.getRuta() != null) {
					cf.deleteArchivo();
				}
				fh.DFecha();
				break;
			case 7:  // Consultar DB
				msn.saltoLinea();
				if (datos.validacionBolean(l,c,p) == 1) {
					if(lis.getLista().size() < 1 ) {
						msn.noDatos();
						break;}
					System.out.println(lis.getLista());
					 break;
				}
				if (datos.validacionBolean(l,c,p) == 2) {
					if(pl.getPila().size() < 1 ) {
						msn.noDatos();
						break;}
					System.out.println(pl.getPila());
					 break;
				}
				if (datos.validacionBolean(l,c,p) == 3) {
					if (cola.getCola().size() < 1) {
						msn.noDatos();
						break;
					}
					System.out.println(cola.peekCola());
					break;
				}

			case 8: // Borrar DB
				op = datos.validacionBolean(l, c, p);
				if (op == 1) {
					msn.saltoLinea();
					if (lis.getLista().isEmpty() == true) {
						msn.noDatos();
						break;
					}
					lis.clearLista();
					msn.confirmBorrado();
					break;
				}
				if (op == 2) {
					msn.saltoLinea();
					if (pl.getPila().isEmpty() == true) {
						msn.noDatos();
						break;
					}
					pl.resetPila();
					msn.confirmBorrado();
					break;
				}
				if (op == 3) {
					msn.saltoLinea();
					if (cola.getCola().isEmpty() == true) {
						msn.noDatos();
						break;
					}
					cola.resetCola();
					msn.confirmBorrado();
					break;
				}
				msn.saltoLinea();
				System.out.println("ERROR CASO 8");
				break;
			case 111:
				SecretoMain.main(null);
				break;
			case 99:
				con +=10;
				break;
			default:
				msn.saltoLinea();
				System.out.println("ERROR! Digite otra opcion: ");
				break;
			}  // Cierre Swich Principal
		}while(con < 2);
	}
}
