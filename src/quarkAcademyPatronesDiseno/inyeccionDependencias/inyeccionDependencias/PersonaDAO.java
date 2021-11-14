package quarkAcademyPatronesDiseno.inyeccionDependencias.inyeccionDependencias;

import java.util.List;

import quarkAcademyPatronesDiseno.inyeccionDependencias.model.Persona;

public interface PersonaDAO {
	List<Persona> listarTodos();

	Persona leerPorId(int id);

	void registrar(Persona persona);

	void actualizar(Persona persona);

	void eliminar(int id);

	void mostrarNombre(Persona persona);
}
