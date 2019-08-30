package mejoraObjetos;

public class Elmain {
	public Elmain() {
		
	}
	public static void main(String[] args) {
		PersonajeBase base = new PersonajeBase();
		PersonajeBase guerrero = new PersonajeBase();
		guerrero.nivel = 20;
		guerrero.clase = "Guerrero";
		guerrero.raza = "Gnomo";
		System.out.println("Haz creado un "+guerrero.clase+" del nivel "+guerrero.nivel+" de la Raza "+guerrero.raza);
		System.out.println("PERSONAJE BASE: "+base.clase+" del nivel: "+base.nivel+" de la raza: "+base.raza);
	}
}
