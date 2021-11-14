package quarkAcademyPatronesDiseno.inyeccionDependencias.inyeccionDependencias;

import java.util.List;

import quarkAcademyPatronesDiseno.inyeccionDependencias.model.Persona;

public class PersonaDAOImpl implements PersonaDAO {

	private IConexion conexion;

	public PersonaDAOImpl(IConexion conexion) {
		this.conexion = conexion;
	}

	@Override
	public List<Persona> listarTodos() {
		System.out.println("Listando...");
		return null;
	}

	@Override
	public Persona leerPorId(int id) {
		return null;
	}

	@Override
	public void registrar(Persona persona) {
		System.out.println("Persona: " + persona.getNombre() + " registrada");
	}

	@Override
	public void actualizar(Persona persona) {
		System.out.println("Persona: " + persona.getNombre() + " actualizada");
	}

	@Override
	public void eliminar(int id) {
		System.out.println("id: " + id + " eliminado");
	}

	@Override
	public void mostrarNombre(Persona persona) {
		System.out.println("Nombre: " + persona.getNombre());
	}
}
