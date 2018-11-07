package busquedaPrima;
import java.util.Scanner;
public class Busqueda {
	public static void main(String[] args) {
		//Metodo Main para ingresar y Digitar un numero entre 1 a 7millones
		//Hara la validacion si es un numero primo
		//Si el numero excede el limite imprimira "no exceder el limite"
		//Si el numumero es primo imprimira el numero y confirmación
		
		int numero_ingreso = 0;
		int numero_limite = 7000000;
		Scanner sc_lectura = new Scanner(System.in); 
		
		System.out.println("*** Bienvenido al Detector de Numeros Primos **");
		do {
			System.out.print("Porfavor Digite un Numero: ");
			try {
				numero_ingreso = sc_lectura.nextInt(); // Solicitamos el numero a ingresar.
			} catch (Exception e) {
				System.out.println("CARACTER NO VALIDO");
				sc_lectura.close();
				sc_lectura = new Scanner(System.in); 
			}
			if(numero_ingreso <= numero_limite && numero_ingreso > 1) {
				if (numero_ingreso % numero_ingreso == 0 && numero_ingreso % 1 == 0 
		 				&& !(numero_ingreso % 2 == 0) || numero_ingreso == 2) {
					System.out.println("El numero: "+numero_ingreso+" es Primo");
				}else {System.out.println("El numero: "+numero_ingreso+" NO es Primo");}
			}else {
				System.out.println("El numero digitado debe ser mayor a 1 "
						+ "\ny no debe exceder los 7.000.000");
				numero_ingreso = -1;
			}
		}while(numero_ingreso != -1 );
		sc_lectura.close(); // Cerramos el objeto para limpiar buffer.
	}
}
