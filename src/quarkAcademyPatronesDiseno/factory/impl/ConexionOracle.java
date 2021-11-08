package quarkAcademyPatronesDiseno.factory.impl;

import quarkAcademyPatronesDiseno.factory.abstraction.IConexion;

public class ConexionOracle implements IConexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1561";
		this.usuario = "admin";
		this.contrasena = "foo12345";
	}

	@Override
	public void prueba() {
		// TODO Auto-generated method stub
		System.out.println("imprimeORACLE");
	}
}
