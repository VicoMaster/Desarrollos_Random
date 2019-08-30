package ejemploHerencia_Pol_abs_interf;
import java.util.Scanner;
/**
 * TIPOS DE ACCESO Y VISIBILIDAD
_______________________________________________________________________
      VISIBILIDAD       || PUBLIC || PROTECTED || DEFAULT || PRIVATE ||
=====================================================================||
  Desde la Misma        ||    si  ||    si     ||    si   ||    si   ||
     Clase              ||        ||           ||         ||         ||
=====================================================================||
Desde Cualquier clase   ||    si  ||    si     ||    si   ||    no   ||
 del mismo paquete      ||        ||           ||         ||         ||
=====================================================================||
  Desde una SubClase    ||    SI  ||    Si     ||    si   ||    no   ||
  del Mismo paquete     ||        ||           ||         ||         ||
=====================================================================||
 Desde una Subclase     ||    SI  ||    Si,    ||    no   ||    no   ||
Fuera del mismo package ||        ||  Herencia ||         ||         ||
=====================================================================||
  Desde cualquier clase ||    SI  ||    No     ||    no   ||    no   ||
  Fuera del package     ||        ||           ||         ||         ||
=====================================================================||    
 **/

/** POLIMORFISMO
 Capacidad de cambiar dependiendo de lo que se pida
 * SobreCarga y SobreEscritura
 * -Override: La Sobreescritura es la forma por la cual una clase que hereda puede re-definir los métodos de su clase Padre, 
 * de esta manera puede crear nuevos métodos con el mismo nombre de su superClase con las reglas de que sean del mismo nivel de acceso y parametros
 * -Overloading: SobreCarga de metodo el cual crea metodos con mismo nombre pero diferentes parametros de entrada
 * -Firma de Metodo: Que reciban diferentes parametros 
 * CLASE PADRE o SuperClase
 * - extends: Esta palabra reservada, indica a la clase hija cual va a ser su clase padre
 * - super(): sirve para llamar al constructor de la clase padre.
 * **/
public class _EjemploMain {

	public static void main(String[] args) {
		int opc;
		HijoMayor hm = new HijoMayor();
		HijoMedio hmm = new HijoMedio();
		HijoMenor hr = new HijoMenor();
		Scanner sc = new Scanner(System.in);
		System.out.println("QUIEN ERES: \n1.Hijo Mayor\n2.Hijo Medio\n3.Hijo Menor\n4.Padre");
		opc = sc.nextInt();
		switch (opc) {
		case 1:
			System.out.println(hm.presentacion("Sonia", "Rivera", 37, true ));
			break;
		case 2:
			System.out.println(hmm.presentacion("Katherine", "Rivera", 30, false ));
			break;
		case 3:
			System.out.println(hr.presentacion("Andres", "Rivera", 23, true ));
			break;
		case 4:
			System.out.println("Soy "+hm.getNombre());
			break;
		default:
			break;
		}
		sc.close();
	}

}
