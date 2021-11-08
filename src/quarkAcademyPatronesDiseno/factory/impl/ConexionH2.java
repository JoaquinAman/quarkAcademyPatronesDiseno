package quarkAcademyPatronesDiseno.factory.impl;

import quarkAcademyPatronesDiseno.factory.abstraction.IConexion;

public class ConexionH2 implements IConexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionH2() {
		this.host = "localhost";
		this.puerto = "1452";
		this.usuario = "root";
		this.contrasena = "foo12345";
	}

	@Override
	public void prueba() {
		// TODO Auto-generated method stub
		System.out.println("imprimeH2");
	}

}
