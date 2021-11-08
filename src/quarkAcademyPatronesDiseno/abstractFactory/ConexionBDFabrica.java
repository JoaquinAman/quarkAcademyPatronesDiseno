package quarkAcademyPatronesDiseno.abstractFactory;

import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IConexionBD;
import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IConexionREST;
import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IFabricaAbstracta;
import quarkAcademyPatronesDiseno.abstractFactory.impl.ConexionMySQL;

public class ConexionBDFabrica implements IFabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
		// TODO Auto-generated method stub
		if (motor.equals("MYSQL")) {
			return new ConexionMySQL();
		}
		return null;
	}

	@Override
	public IConexionREST getREST(String area) {
		// TODO Auto-generated method stub
		return null;
	}

}
