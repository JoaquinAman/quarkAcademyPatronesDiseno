package quarkAcademyPatronesDiseno.MVC.controlador;

import quarkAcademyPatronesDiseno.MVC.modelo.Persona;

public class PersonaNombreController {
	public String obtenerNombrePersona(Persona persona) {
		return persona.getNombre();
	}
}
