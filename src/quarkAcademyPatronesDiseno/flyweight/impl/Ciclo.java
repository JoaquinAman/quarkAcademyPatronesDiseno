package quarkAcademyPatronesDiseno.flyweight.impl;

import quarkAcademyPatronesDiseno.flyweight.abstraction.IVehiculo;

public class Ciclo implements IVehiculo {

	private final String maxVelocidad; // propiedad intrinseca
	private String color; // propiedad extrensica

	Ciclo() {
		maxVelocidad = "15 km/h";
	}

	@Override
	public void asignarColor(String color) {
		this.color = color;
	}

	@Override
	public void encenderMotor() {
		System.out.println("Ciclo con color " + color + " tiene maxima velocidad de " + maxVelocidad);
	}

}
