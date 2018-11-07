package ingresosMain;

public class Mensajes {
	
	public void Welcome() {
		System.out.println("Bienvenido");
	}
	
	public void Digite_Datos() {
		System.out.println("Ingrese los siguientes datos:\n");
	}
	
	public void Nombre() {
		System.out.print("Nombre: ");
	}
	public void Apellido() {
		System.out.print("Apellido: ");
	}
	
	public void Cedula() {
		System.out.print("Cedula: ");
	}
	
	public void Id() {
		System.out.print("Id: ");
	}
	
	public void menuOpc() {
		System.out.print("1.Ingresar Usuario\n2.Consultar Usuario\n3.Actualizar Usuario\n4.Eliminar Usuario\n5.Almacenar"
				+ "\n6.Salir\n7.COLECCION\n8.Borrar DB\n... ");
	}
	
	public void confirList() {
		System.out.println("SE GUARDARON LOS DATOS");
	}
	
	public void confirListno() {
		System.out.println("NO SE GUARDO DATOS");
	}
	
	public void datClear() {
		System.out.println("USUARIO ELIMINADO");
	}
	
	public void errorInsert() {
		System.out.println("ELIMINE LOS DATOS PRIMERO");
	}
	
	public void confirmBorrado() {
		System.out.println("DATOS BORRADOS");
	}
	
	public void noDatos() {
		System.out.println("SIN DATOS");
	}
	
	public void saltoLinea() {
		for (int i = 0; i < 10; i++) {
			System.out.println("\n");
		}
		
	}
	
	public void menuSecreto() {
		System.out.println("***\t\t\t\t***");
		System.out.println("*** ESTE ES EL MENU SECRETO ***");
	}
}
