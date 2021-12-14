package quarkAcademyPatronesDiseno.flyweight;

import quarkAcademyPatronesDiseno.flyweight.abstraction.IVehiculo;
import quarkAcademyPatronesDiseno.flyweight.impl.VehiculoFactory;

public class Main {

	public static void main(String[] args) {

		IVehiculo ciclo = VehiculoFactory.getVehiculo("Ciclo");
		ciclo.asignarColor("azuL");
		ciclo.encenderMotor();
		ciclo.asignarColor("negro");
		ciclo.encenderMotor();

		IVehiculo camion = VehiculoFactory.getVehiculo("Camion");
		// camion.asignarColor("verde");
		camion.encenderMotor();
		IVehiculo camion2 = VehiculoFactory.getVehiculo("Camion");
		// IVehiculo camion3 = VehiculoFactory.getVehiculo("Camions");
		IVehiculo camion4 = VehiculoFactory.getVehiculo("Camion");
		camion.asignarColor("marron");
		camion.encenderMotor();
	}

}
