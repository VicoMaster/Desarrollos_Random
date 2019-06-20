package mejoraObjetos;

public class PersonajeBase {
	public int nivel;
	public String clase;
	public String raza;
	
	public PersonajeBase() {
		this.nivel = 0;
		this.clase = "Ninguna";
		this.raza = "Humana";
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
}
