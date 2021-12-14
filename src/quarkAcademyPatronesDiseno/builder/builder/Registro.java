package quarkAcademyPatronesDiseno.builder.builder;

import java.util.ArrayList;
import java.util.List;

import quarkAcademyPatronesDiseno.builder.DTO.PersonaDTO;

public class Registro {
	private List<PersonaDTO> personasDTO = new ArrayList();

	public Registro() {
	}

	public void registro(PersonaDTO personaDTO) {
		personasDTO.add(personaDTO);
	}

	public List<PersonaDTO> getPersonasDTO() {
		return personasDTO;
	}

	public Registro(List<PersonaDTO> personasDTO) {
		super();
		this.personasDTO = personasDTO;
	}

	public void setPersonasDTO(List<PersonaDTO> personasDTO) {
		this.personasDTO = personasDTO;
	}

	@Override
	public String toString() {
		return "Registro [personasDTO=" + personasDTO + "]";
	}
}
