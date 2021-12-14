package quarkAcademyPatronesDiseno.composite.abstraction;

public interface IEmpleado {
	public void add(IEmpleado empleado);

	public String getNombre();

	public double getSalario();

	public void print();

}
