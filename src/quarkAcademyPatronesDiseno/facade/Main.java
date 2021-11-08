package quarkAcademyPatronesDiseno.facade;

import quarkAcademyPatronesDiseno.facade.facade.CheckFacade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2021", "04/07/2021", "Cordoba", "Posadas");

		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("03/07/2021", "07/07/2021", "San Luis", "Cordoba");
	}
}
