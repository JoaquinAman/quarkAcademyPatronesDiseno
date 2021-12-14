package quarkAcademyPatronesDiseno.bridge;

import quarkAcademyPatronesDiseno.bridge.model.Auto;

public class Main {

	public static void main(String[] args) {

		Auto auto = new Auto(4, "verde");
		System.out.println(auto.getCantidadRuedas());
		System.out.println(auto.getCantidadTotalRuedas());
		System.out.println(auto.getColor());
		System.out.println(auto.pintarRojo());
	}

}
