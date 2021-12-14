package quarkAcademyPatronesDiseno.builder.builder;

import quarkAcademyPatronesDiseno.builder.DTO.PersonaDTO;
import quarkAcademyPatronesDiseno.builder.model.Persona;

public class BuilderExample {
	public PersonaDTO toDTO(Persona persona) {
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setId(persona.getId());
		personaDTO.setNombre(persona.getNombre());
		personaDTO.setApellido(persona.getApellido());
		personaDTO.setFechaNacimiento(persona.getFechaNacimiento());
		return personaDTO;
	}
}
