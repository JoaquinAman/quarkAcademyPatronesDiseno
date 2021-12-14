package quarkAcademyPatronesDiseno.builder;

import java.util.Date;

import quarkAcademyPatronesDiseno.builder.DTO.PersonaDTO;
import quarkAcademyPatronesDiseno.builder.builder.BuilderExample;
import quarkAcademyPatronesDiseno.builder.builder.Registro;
import quarkAcademyPatronesDiseno.builder.model.Persona;

public class Main {

	public static void main(String[] args) {

		Persona persona = new Persona(1, "Nombre", "Apellido", new Date(), "Rojo");
		BuilderExample builder = new BuilderExample();

		PersonaDTO personaDTO = builder.toDTO(persona);

		Registro registro = new Registro();
		registro.registro(personaDTO);
		System.out.println(registro.toString());
	}

}
