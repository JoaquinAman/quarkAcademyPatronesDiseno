package quarkAcademyPatronesDiseno.abstractFactory.impl;

import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IConexionBD;

public class ConexionMySQL implements IConexionBD {
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "foo12345";
	}

	@Override
	public void pruebaImprime() {
		// TODO Auto-generated method stub
		System.out.println("imprimeMySQL");
	}
}
