package quarkAcademyPatronesDiseno.adapter.abstraction;

import quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte;

public interface Vehiculo {
	MetodoTransporte getMetodoTransporte(String metodoTransporte);

	void setMetodoTransporte(String metodoTransporte);

	String getNombreVehiculo();
}
