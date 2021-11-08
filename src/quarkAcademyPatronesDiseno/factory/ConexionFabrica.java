package quarkAcademyPatronesDiseno.factory;

import quarkAcademyPatronesDiseno.factory.abstraction.IConexion;
import quarkAcademyPatronesDiseno.factory.impl.ConexionH2;
import quarkAcademyPatronesDiseno.factory.impl.ConexionMySQL;
import quarkAcademyPatronesDiseno.factory.impl.ConexionOracle;

public class ConexionFabrica {
	public IConexion getConexion(String motor) {
		if (motor.equals("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equals("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equals("H2")) {
			return new ConexionH2();
		}
		return null;
	}
}
