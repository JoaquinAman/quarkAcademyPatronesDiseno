package quarkAcademyPatronesDiseno.composite;

import quarkAcademyPatronesDiseno.composite.abstraction.IEmpleado;
import quarkAcademyPatronesDiseno.composite.composite.ManagerComposite;
import quarkAcademyPatronesDiseno.composite.impl.Hoja;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEmpleado empleado1 = new Hoja("Joaco", 100000);
		IEmpleado empleado2 = new Hoja("Pepe", 80000);

		IEmpleado gerente1 = new ManagerComposite("Julia", 70000);

		gerente1.add(empleado1);
		gerente1.add(empleado2);

		IEmpleado gerenteGeneral = new ManagerComposite("Alfonsin", 300000);

		gerenteGeneral.add(gerente1);
		gerenteGeneral.print();
	}

}
