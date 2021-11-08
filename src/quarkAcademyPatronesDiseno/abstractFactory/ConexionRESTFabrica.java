package quarkAcademyPatronesDiseno.abstractFactory;

import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IConexionBD;
import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IConexionREST;
import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IFabricaAbstracta;
import quarkAcademyPatronesDiseno.abstractFactory.impl.ConexionRESTCompras;

public class ConexionRESTFabrica implements IFabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConexionREST getREST(String area) {
		// TODO Auto-generated method stub
		if (area.equals("COMPRAS")) {
			return new ConexionRESTCompras();
		}
		return null;
	}

}
