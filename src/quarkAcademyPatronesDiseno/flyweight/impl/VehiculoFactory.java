package quarkAcademyPatronesDiseno.flyweight.impl;

import java.util.HashMap;

import quarkAcademyPatronesDiseno.flyweight.abstraction.IVehiculo;

public class VehiculoFactory {
	private static HashMap<String, IVehiculo> hashMap = new HashMap();

	public static IVehiculo getVehiculo(String tipo) {
		IVehiculo vehiculo = null;
		if (hashMap.containsKey(tipo)) {
			vehiculo = hashMap.get(tipo);
		} else {
			switch (tipo) {
			case "Ciclo":
				System.out.println("Ciclo esta creado.");
				vehiculo = new Ciclo();
				break;
			case "Camion":
				System.out.println("Camion esta creado.");
				vehiculo = new Camion();
				break;
			default:
				throw new IllegalArgumentException("Tipo de vehiculo no existe.");
			}
			hashMap.put(tipo, vehiculo);
		}
		return vehiculo;
	}
}
