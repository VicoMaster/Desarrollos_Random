package ejemploHerencia_Pol_abs_interf;

public class HijoMenor extends Padre{
	private String estado,devuelve;
	public HijoMenor() {
		super();
	}

	@Override
	protected void setS() {
		this.s ="Soltero";
	}
	
	@Override
	protected void setM() {
		this.m ="Casado";
	}
	public String presentacion(String nombre,String  apellido,int edad,Boolean casado) {
		setS();
		setM();
		this.estado="";
		Presentacion(nombre, apellido, edad, casado);
		saludo();
		this.devuelve = "Me llamo "+getNombre()+" "+getApellido()+" Tengo "+String.valueOf(getEdad())+" años y soy ";
		estado = (getCasado()==true) ? s:m;
		UsanAuto(false);
		this.devuelve += estado+"\nSalgo de mi casa a las "+HoraSalida().replace("7:00am","7:30am")+" Y llego a las "
		+HoraLlegada().replace("7:00pm", "8:30pm");
		return devuelve;
	}
	@Override
	protected void saludo() {
		System.out.println("Hala!, ");
		
	}
}