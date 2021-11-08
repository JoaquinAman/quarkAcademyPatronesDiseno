package quarkAcademyPatronesDiseno.factory.impl;

import quarkAcademyPatronesDiseno.factory.abstraction.IConexion;

public class ConexionMySQL implements IConexion {
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
	public void prueba() {
		// TODO Auto-generated method stub
		System.out.println("imprimeMySQL");
	}
}
