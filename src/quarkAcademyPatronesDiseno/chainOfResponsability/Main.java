package quarkAcademyPatronesDiseno.chainOfResponsability;

import java.util.concurrent.ThreadLocalRandom;

import quarkAcademyPatronesDiseno.chainOfResponsability.impl.Manejador1;
import quarkAcademyPatronesDiseno.chainOfResponsability.impl.Manejador2;

public class Main {

	public static void main(String[] args) {

		int min = 1;
		int max = 2;
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

		Manejador1 m1 = new Manejador1();
		Manejador2 m2 = new Manejador2();

		for (int i = 0; i < 10; i++) {

			if (randomNum == 1) {
				m1.apruebaResponsabilidad(1);
			} else {
				m2.apruebaResponsabilidad(1);
			}
		}

	}
}
