package quarkAcademyPatronesDiseno.facade.facade;

import quarkAcademyPatronesDiseno.facade.api.AvionAPI;
import quarkAcademyPatronesDiseno.facade.api.HotelAPI;

public class CheckFacade {
	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;

	public CheckFacade() {
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
	}

	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}
}
