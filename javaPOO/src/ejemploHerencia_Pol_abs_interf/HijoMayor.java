package ejemploHerencia_Pol_abs_interf;

public class HijoMayor extends Padre{
	private String estado,devuelve;
	public HijoMayor() {
		super();
	}
	
	@Override
	protected void setS() {
		this.s ="Soltera";
	}
	
	@Override
	protected void setM() {
		this.m ="Casada";
	}
	public String presentacion(String nombre,String  apellido,int edad,Boolean casado) {
		setS();
		setM();
		this.estado="";
		Presentacion(nombre, apellido, edad, casado);
		saludo();
		this.devuelve = "Me llamo "+getNombre()+" "+getApellido()+" Tengo "+String.valueOf(getEdad())+" años y soy ";
		estado = (getCasado()==true) ? s:m;
		UsanAuto(true);
		this.devuelve += estado+"\nSalgo de mi casa a las "+HoraSalida()+" Y llego a las "+HoraLlegada();
		return devuelve;
	}
	
	@Override
	protected void saludo() {
		System.out.println("Hummmm!");
	}
}
