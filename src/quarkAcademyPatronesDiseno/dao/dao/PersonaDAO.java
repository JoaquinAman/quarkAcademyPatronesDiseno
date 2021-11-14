package quarkAcademyPatronesDiseno.dao.dao;

import java.util.List;

import quarkAcademyPatronesDiseno.dao.model.Persona;

public interface PersonaDAO {
	List<Persona> listarTodos();

	Persona leerPorId(int id);

	void registrar(Persona persona);

	void actualizar(Persona persona);

	void eliminar(int id);
}
