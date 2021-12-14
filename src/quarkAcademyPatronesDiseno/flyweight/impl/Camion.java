package quarkAcademyPatronesDiseno.flyweight.impl;

import quarkAcademyPatronesDiseno.flyweight.abstraction.IVehiculo;

public class Camion implements IVehiculo {

	private final String maxVelocidad; // propiedad intrinseca
	private String color; // propiedad extrensica

	Camion() {
		maxVelocidad = "120 km/h";
	}

	@Override
	public void asignarColor(String color) {
		this.color = color;
	}

	@Override
	public void encenderMotor() {
		System.out.println("Camion con color " + color + " tiene maxima velocidad de " + maxVelocidad);
	}

}
