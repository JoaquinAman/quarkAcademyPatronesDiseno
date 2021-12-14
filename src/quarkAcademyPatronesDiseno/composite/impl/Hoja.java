package quarkAcademyPatronesDiseno.composite.impl;

import quarkAcademyPatronesDiseno.composite.abstraction.IEmpleado;

public class Hoja implements IEmpleado {

	private String nombre;
	private double salario;

	public Hoja(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public void add(IEmpleado empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		System.out.println("------------");
		System.out.println("Nombre: " + getNombre() + " qaaa");
		System.out.println("Salario: " + getSalario());
		System.out.println("------------");
	}

}
