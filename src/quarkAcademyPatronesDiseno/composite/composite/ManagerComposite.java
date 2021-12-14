package quarkAcademyPatronesDiseno.composite.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import quarkAcademyPatronesDiseno.composite.abstraction.IEmpleado;

public class ManagerComposite implements IEmpleado {

	private String nombre;
	private double salario;

	List<IEmpleado> empleados = new ArrayList();

	public ManagerComposite(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	@Override
	public void add(IEmpleado empleado) {
		empleados.add(empleado);
	}

	@Override
	public String getNombre() {

		return nombre;
	}

	@Override
	public double getSalario() {

		return salario;
	}

	@Override
	public void print() {
		System.out.println("-----------------------------");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Salario: " + getSalario());
		System.out.println("-----------------------------");

		Iterator<IEmpleado> empleadoIterator = empleados.iterator();

		while (empleadoIterator.hasNext()) {
			IEmpleado empleado = empleadoIterator.next();
			empleado.print();
		}
	}

}
