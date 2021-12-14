package quarkAcademyPatronesDiseno.chainOfResponsability.impl;

import java.util.concurrent.ThreadLocalRandom;

import quarkAcademyPatronesDiseno.chainOfResponsability.abstraction.IapruebaResponsabilidad;

public class Manejador1 implements IapruebaResponsabilidad {

	@Override
	public <T> boolean apruebaResponsabilidad(T t) {
		int min = 0;
		int max = 1;

		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

		if (randomNum == 1) {
			System.out.println("Manejador1 aprueba responsabilidad");
			pasaLaSolicitud(1);
		}

		System.out.println("m1 no aprueba responsabilidad");
		return false;
	}

	@Override
	public <T> boolean pasaLaSolicitud(T t) {
		int min = 0;
		int max = 1;
		Manejador2 m2 = new Manejador2();

		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

		if (randomNum == 1) {
			System.out.println("Manejador1 pasa la solicitud");
			m2.apruebaResponsabilidad(1);
		}

		System.out.println("m1 no pasa la solicitud");
		return false;
	}

}
