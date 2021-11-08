package quarkAcademyPatronesDiseno.factory;

import quarkAcademyPatronesDiseno.factory.abstraction.IConexion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexionFabrica fabrica = new ConexionFabrica();
		IConexion cx1 = fabrica.getConexion("ORACLE");
		cx1.prueba();
		IConexion cx2 = fabrica.getConexion("MYSQL");
		cx2.prueba();
		IConexion cx3 = fabrica.getConexion("H2");
		cx3.prueba();

	}

}
