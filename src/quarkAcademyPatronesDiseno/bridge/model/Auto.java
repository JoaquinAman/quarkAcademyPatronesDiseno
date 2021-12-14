package quarkAcademyPatronesDiseno.bridge.model;

import quarkAcademyPatronesDiseno.bridge.abstraction.Vehiculo;

public class Auto implements Vehiculo {
	private int cantidadRuedas;
	private String color;

	public Auto() {
	}

	public int getCantidadRuedas() {
		return cantidadRuedas;
	}

	public Auto(int cantidadRuedas, String color) {
		super();
		this.cantidadRuedas = cantidadRuedas;
		this.color = color;
	}

	public void setCantidadRuedas(int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int getCantidadTotalRuedas() {
		return getCantidadRuedas() + 1;
	}

	@Override
	public String pintarRojo() {
		setColor("rojo");
		return getColor();
	}
}
