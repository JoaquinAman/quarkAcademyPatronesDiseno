package quarkAcademyPatronesDiseno.adapter.adapter;

import quarkAcademyPatronesDiseno.adapter.abstraction.Riel;
import quarkAcademyPatronesDiseno.adapter.abstraction.Vehiculo;
import quarkAcademyPatronesDiseno.adapter.model.Auto;
import quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte;

public class Adapter implements Vehiculo, Riel {

	Auto auto = new Auto("auto", "ruedas de auto");

	MetodoTransporte metodoTransporte = new MetodoTransporte();

	private String nombre;

	@Override
	public boolean usaRuedasParaRieles(MetodoTransporte metodoTransporte) {
		if (metodoTransporte.equals("ruedas para rieles")) {
			return true;
		}
		return false;
	}

	@Override
	public MetodoTransporte getMetodoTransporte(String metodoTransporte) {
		return this.getMetodoTransporte(metodoTransporte);
	}

	public MetodoTransporte getMetodoTransporte() {
		return metodoTransporte;
	}

	@Override
	public String getNombreVehiculo() {
		return this.getNombre();
	}

	@Override
	public void setMetodoTransporte(String metodoTransporte1) {
		metodoTransporte.setMetodoTransporte(metodoTransporte1);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
