package quarkAcademyPatronesDiseno.abstractFactory.impl;

import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IConexionREST;

public class ConexionRESTCompras implements IConexionREST {

	@Override
	public void leerURL(String url) {
		System.out.println("Conectandose a: " + url);
	}
}
