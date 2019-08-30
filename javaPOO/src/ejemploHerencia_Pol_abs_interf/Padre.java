package ejemploHerencia_Pol_abs_interf;

public abstract class Padre implements InterfaceCasa{
	protected String nombre,apellido,s,m;
	protected int edad;
	protected Boolean casado;
	protected Padre() {
		s = null;
		m = null;
		nombre = "Pedro";
		apellido = "Rivera";
		edad = 64;
		casado = true;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	protected Boolean getCasado() {
		return casado;
	}
	protected void setCasado(Boolean casado) {
		this.casado = casado;
	}
	protected void Presentacion(String nombre,String  apellido,int edad,Boolean casado) {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
		setCasado(casado);
	}
	protected String getS() {
		return s;
	}
	protected void setS() {
		this.s = "Solter@";
	}
	protected String getM() {
		return m;
	}
	protected void setM() {
		this.m = "Casad@";
	}
	protected abstract void saludo();
	@Override
	public String HoraLlegada() {
		return "7:00pm";
	}
	@Override
	public String HoraSalida() {
		return "7:00am";
	}
	@Override
	public void UsanAuto(Boolean uso) {
		if (uso == true) {
			System.out.println("USO AUTO");
		} else {
			System.out.println("NO USO AUTO");
		}
	}
}
