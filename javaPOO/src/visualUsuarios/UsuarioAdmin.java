package visualUsuarios;
/**CREA EL USUARIO ADMINISTRADOR**/
public class UsuarioAdmin extends UsuarioPadre {
	public UsuarioAdmin() {
		super();
	}
	/**Crea un usuarioAdmin parametros entrada nombre,id y pass**/
	public void CreaAdmin(String nombre,String id,String pass) {
		setAdmin(nombre);
		setIdAdmin(id);
		permisosAdmin();
		setPassadmin(pass);
	}

}
