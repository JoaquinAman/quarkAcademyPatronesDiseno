package quarkAcademyPatronesDiseno.inyeccionDependencias;

import quarkAcademyPatronesDiseno.inyeccionDependencias.inyeccionDependencias.ConexionMySQL;
import quarkAcademyPatronesDiseno.inyeccionDependencias.inyeccionDependencias.PersonaDAO;
import quarkAcademyPatronesDiseno.inyeccionDependencias.inyeccionDependencias.PersonaDAOImpl;

public class Main {

	public static void main(String[] args) {
		ConexionMySQL cx = new ConexionMySQL("miCodigo", "7482", "localhost");
		PersonaDAO dao = new PersonaDAOImpl(cx);

		ConexionMySQL cx2 = new ConexionMySQL("miCodigo", "7482", "192.168.1.1");
		PersonaDAO dao2 = new PersonaDAOImpl(cx2);

		dao2.listarTodos();
	}

}
