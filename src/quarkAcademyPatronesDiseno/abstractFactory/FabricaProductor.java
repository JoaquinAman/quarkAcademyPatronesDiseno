package quarkAcademyPatronesDiseno.abstractFactory;

import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IFabricaAbstracta;

public class FabricaProductor {

	public static IFabricaAbstracta getFactory(String tipoFabrica) {
		if (tipoFabrica.equals("BD")) {
			return new ConexionBDFabrica();
		} else if (tipoFabrica.equals("REST")) {
			return new ConexionRESTFabrica();
		}
		return null;
	}
}
