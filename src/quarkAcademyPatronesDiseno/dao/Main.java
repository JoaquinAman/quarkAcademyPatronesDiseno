package quarkAcademyPatronesDiseno.dao;

import quarkAcademyPatronesDiseno.dao.dao.PersonaDAO;
import quarkAcademyPatronesDiseno.dao.dao.PersonaDAOImpl;
import quarkAcademyPatronesDiseno.dao.model.Persona;

public class Main {

	public static void main(String[] args) {
		PersonaDAO dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombre()));

		Persona per = new Persona();
		per.setNombre("Joaquin Aman");
		dao.registrar(per);
	}

}
