package ejemploHerencia_Pol_abs_interf;
/**
 *Características de las Interfaces:
Todos los métodos de una interfaz son implícitamente public abstract, no es necesario especificarlo en la declaración del mismo.
Todas las variables y atributos de una interfaz son implícitamente constantes (public static final), no es necesario especificarlo en la declaración del misma
Los métodos de una interfaz no pueden ser: static, final, strictfp ni native.
Una interfaz puede heredar (extends) de una o más interfaces.
Una interfaz no puede heredar de otro elemento que no sea una interfaz.
Una interfaz no puede implementar (implements) otra interfaz.
Una interfaz debe ser declarada con la palabra clave interface.
Los tipos de las interfaces pueden ser utilizados polimórficamente.
Una interfaz puede ser public o package (valor por defecto). 
Los métodos toman como ámbito el que contiene la interfaz.
**/
public interface  InterfaceCasa {
	public void UsanAuto(Boolean uso);
	public String HoraLlegada();
	public String HoraSalida();
}
