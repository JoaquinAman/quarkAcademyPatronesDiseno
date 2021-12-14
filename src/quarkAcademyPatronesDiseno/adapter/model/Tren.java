package quarkAcademyPatronesDiseno.adapter.model;

import quarkAcademyPatronesDiseno.adapter.abstraction.Riel;
import quarkAcademyPatronesDiseno.adapter.abstraction.Vehiculo;

public class Tren implements Vehiculo, Riel {
	private String nombreVehiculo;
	private String metodoTransporte;

	@Override
	public quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte getMetodoTransporte(String metodoTranporte) {
		quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte metodoTransporteTren = new quarkAcademyPatronesDiseno.adapter.model.MetodoTransporte();
		metodoTransporteTren.setMetodoTransporte(metodoTranporte);
		return metodoTransporteTren;
	}

	public Tren() {
	}

	public Tren(String nombreVehiculo, String metodoTransporte) {
		super();
		this.nombreVehiculo = nombreVehiculo;
		this.metodoTransporte = metodoTransporte;
	}

	@Override
	public String getNombreVehiculo() {

		return nombreVehiculo;
	}

	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}

	public String getMetodoTransporte() {
		return metodoTransporte;
	}

	public void setMetodoTransporte(String metodoTransporte) {
		this.metodoTransporte = metodoTransporte;
	}

	@Override
	public boolean usaRuedasParaRieles(MetodoTransporte metodoTransporte) {
		if (metodoTransporte.equals("ruedas para rieles")) {
			return true;
		}
		return false;
	}

}
