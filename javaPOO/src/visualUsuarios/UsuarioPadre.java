package visualUsuarios;
import java.util.*;
/**
 **/
public class UsuarioPadre {
	protected String admin,regular,passadmin,passregular,idadmin,idregular;
	protected List<Boolean> padmin,pregular;
	protected UsuarioPadre() {
		admin = null;
		regular = null;
		passadmin = null;
		passregular = null;
		idadmin = null;
		idregular = null;
		padmin= new ArrayList<Boolean>();
		pregular=new ArrayList<Boolean>();
	}

	protected String getAdmin() {
		return admin;
	}

	protected void setAdmin(String admin) {
		this.admin = admin;
	}

	protected String getRegular() {
		return regular;
	}

	protected void setRegular(String regular) {
		this.regular = regular;
	}

	protected String getPassadmin() {
		return passadmin;
	}

	protected void setPassadmin(String passadmin) {
		this.passadmin = passadmin;
	}

	protected String getPassregular() {
		return passregular;
	}

	protected void setPassregular(String passregular) {
		this.passregular = passregular;
	}

	protected String getIdAdmin() {
		return idadmin;
	}
	protected String getIdRegular() {
		return idregular;
	}

	protected void setIdAdmin(String id) {
		this.idadmin = id;
	}
	
	protected void setIdRegular(String id) {
		this.idregular = id;
	}

	protected void permisosAdmin() {
		Boolean a1,a2,a3;
		a1 = true;  // Escritura
		a2 = true;  // Lectura
		a3 = true;  // Delete
		this.padmin.add(a1);
		this.padmin.add(a2);
		this.padmin.add(a3);
	}
	protected void permisosRegular() {
		Boolean a1,a2,a3;
		a1 = false;  // Escritura
		a2 = true;  // Lectura
		a3 = false;  // Delete
		this.pregular.add(a1);
		this.pregular.add(a2);
		this.pregular.add(a3);
	}
	

}
