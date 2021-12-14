package quarkAcademyPatronesDiseno.adapter;

import quarkAcademyPatronesDiseno.adapter.adapter.Adapter;
import quarkAcademyPatronesDiseno.adapter.model.Auto;
import quarkAcademyPatronesDiseno.adapter.model.Tren;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = new Auto("auto", "ruedas de auto");
		Tren tren = new Tren("tren", "ruedas para rieles");
		Adapter adapter = new Adapter();
		adapter.setNombre("auto");

		if (adapter.getNombreVehiculo().equals(auto.getNombreVehiculo())) {
			if (!(adapter.usaRuedasParaRieles(auto.getMetodoTransporte("ruedas de auto")))) {
				adapter.setMetodoTransporte(tren.getMetodoTransporte());
			}

		}

		System.out.println(adapter.getNombre());
		System.out.println(adapter.getMetodoTransporte().getMetodoTransporte());
		// adapter.usaRuedasParaRieles(null)
	}

}
