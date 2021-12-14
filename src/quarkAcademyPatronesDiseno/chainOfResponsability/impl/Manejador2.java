package quarkAcademyPatronesDiseno.chainOfResponsability.impl;

import java.util.concurrent.ThreadLocalRandom;

import quarkAcademyPatronesDiseno.chainOfResponsability.abstraction.IapruebaResponsabilidad;

public class Manejador2 implements IapruebaResponsabilidad {

	@Override
	public <T> boolean apruebaResponsabilidad(T t) {
		int min = 0;
		int max = 1;

		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

		if (randomNum == 1) {
			System.out.println("Manejador2 aprueba responsabilidad");
			pasaLaSolicitud(1);
		}

		System.out.println("m2 no aprueba responsabilidad");
		return false;
	}

	@Override
	public <T> boolean pasaLaSolicitud(T t) {
		int min = 0;
		int max = 1;
		Manejador1 m1 = new Manejador1();

		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

		if (randomNum == 1) {
			System.out.println("Manejador2 pasa la solicitud");
			m1.apruebaResponsabilidad(1);
		}

		System.out.println("m2 no pasa la solicitud");
		return false;
	}

}
