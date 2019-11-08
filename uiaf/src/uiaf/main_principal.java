package uiaf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Andres F. Rivera / Dev - Conzatec SAS
 * @version 1.0 
 * Date: 08.11.2019 
 * Convierte un archivo ingresado por parametro en la ejecucion a codificacion UTF-8
 * Compatibilidad: Linux y Windows
 **/
public class main_principal {
	public static final String UTF8_BOM = "\uFEFF";
	public static void main(String[] args) throws IOException {
		try {
			//args = new String[1];
			//args[0] = "/home/vicomaster/Escritorio/SALDOS_BANKTRADE_UIAF_ANEXO6_20191107220011.txt";
			main_principal.logginTrace("*** INICIA EJECUCION DE JAR ***");
			main_principal.logginTrace("PARAMETROS EN CURSO: "+args[0]);
            boolean firstLine = true;           
            FileInputStream fis = new FileInputStream(args[0]);
            BufferedReader r = new BufferedReader(new InputStreamReader(fis,"UTF8"));
            String separador = "/";
            String[] ruta_entrada = args[0].split(separador);
            main_principal.logginTrace("TAMANNO PARTITION: "+ruta_entrada.length);
            if(ruta_entrada.length <= 1 ) {
            	separador = "\\\\";
            	ruta_entrada = args[0].split(separador);
            	main_principal.logginTrace("SISTEMA OPERATIVO WINDOWS");
            }else {
            	main_principal.logginTrace("SISTEMA OPERATIVO BASADO EN UNIX");
            }
            String ruta = "";
            for (int i = 0; i < ruta_entrada.length; i++) {
            	if(i < (ruta_entrada.length)-1) {
            		ruta += separador+ruta_entrada[i];	
            	}
			}
            FileOutputStream fos = new FileOutputStream(ruta+separador+"temp_file.txt");
            Writer w = new BufferedWriter(new OutputStreamWriter(fos, "Cp1252"));
            for (String s = ""; (s = r.readLine()) != null;) {
                if (firstLine) {
                    s = main_principal.removeUTF8BOM(s);
                    firstLine = false;
                }
                w.write(s + System.getProperty("line.separator"));
                w.flush();
            }
            w.close();
            r.close();
            main_principal.sobreEscribeArchivo(ruta+separador+"temp_file.txt",
            		ruta+separador+ruta_entrada[(ruta_entrada.length)-1]);
            main_principal.logginTrace("LA EJECUCION FUE CORRECTA - CONVERSION COMPLETA");
            main_principal.logginTrace("*** FINALIZA EJECUCION DE JAR ***");
            System.exit(0);
        }

        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static String removeUTF8BOM(String s) {
        if (s.startsWith(UTF8_BOM)) {
            s = s.substring(1);
        }
        return s;
    }
    
    private static void sobreEscribeArchivo(String ruta_lectura, String ruta_destino) {
    	main_principal.logginTrace("CREADO ARCHIVO TEMPORAL: "+ruta_lectura);
    	File archivo = new File(ruta_lectura);
    	File destino = new File(ruta_destino);
        FileReader fr = null;
    	BufferedReader br = null;
    	FileWriter fw;
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			fw = new FileWriter(destino);
			
			//Lectura del archivo
			String linea;
			while((linea=br.readLine())!=null) {
				fw.write(linea+"\r\n");
				fw.flush();
			}
			fw.close();
		} catch (Exception e) {
			System.out.println("ERROR EN ESCRITURA: \n" + e);
		}
    }
    
    private static void logginTrace(String mensaje) {
    	String trace = "";
    	Calendar fecha = new GregorianCalendar();
		trace = (fecha.get(Calendar.YEAR)
				+"_"+fecha.get(Calendar.MONTH)+"_"
				+fecha.get(Calendar.DAY_OF_MONTH)+"_"
				+fecha.get(Calendar.HOUR_OF_DAY)
				+fecha.get(Calendar.MINUTE)
				+fecha.get(Calendar.SECOND)+": "+mensaje);
		fecha.clear();
        fecha = null;
        System.out.println(trace);
    }
    
}
