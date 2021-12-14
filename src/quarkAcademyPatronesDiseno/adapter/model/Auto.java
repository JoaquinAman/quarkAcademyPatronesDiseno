package quarkAcademyPatronesDiseno.adapter.model;

import quarkAcademyPatronesDiseno.adapter.abstraction.Vehiculo;

public class Auto implements Vehiculo {
	private String nombreVehiculo;
	private String metodoTransporte;

	@Override
	public quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte getMetodoTransporte(String metodoTransporte) {
		quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte metodoTransporteAuto = new quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte();
		metodoTransporteAuto.setMetodoTransporte(metodoTransporte);
		return metodoTransporteAuto;
	}

	@Override
	public String getNombreVehiculo() {

		return this.nombreVehiculo;
	}

	public Auto() {
	}

	public Auto(String nombreVehiculo, String metodoTransporte) {
		super();
		this.nombreVehiculo = nombreVehiculo;
		this.metodoTransporte = metodoTransporte;
	}

	@Override
	public void setMetodoTransporte(String metodoTransporte) {
		quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte metodoTransporteAuto = new quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte();
		metodoTransporteAuto.setMetodoTransporte(metodoTransporte);
	}
}
