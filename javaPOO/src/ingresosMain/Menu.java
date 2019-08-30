package ingresosMain;

public class Menu {
	Mensajes msj;
	Datos lec;
	int opc;
	public Menu() {  // Constructor
		msj = new Mensajes();
		opc = 0;
		lec = new Datos();
	}
	public int menuOpc(){
		msj.menuOpc();
		this.opc = lec.leerInt();
		lec.buferRes();
		return opc;
	}
}
