package archivosDB;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 * 
 **/
public class FechaHora {
	Date date;
	DateFormat hourformat = new SimpleDateFormat("HH:mm:ss");
	DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
	public FechaHora() {
		date = new Date();
	}
	public String DHora() {
		return hourformat.format(date);
	}
	public String DMinutos() {
		return "";
	}
	public String DSegundos() {
		return "";
	}
	public String DDia() {
		return "";
	}

	public String DMes() {
		return dateformat.format(date);
	}
	public void DFecha() {
		System.out.println("FINALIZO: "+DHora()+"\t"+DMes());
	}
}
