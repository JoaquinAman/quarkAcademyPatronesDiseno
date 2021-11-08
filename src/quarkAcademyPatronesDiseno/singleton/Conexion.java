package quarkAcademyPatronesDiseno.singleton;

public class Conexion {
	private static Conexion instancia;

	private Conexion() {
	}

	public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}

	public void prueba() {
		System.out.println("imprime");
	}
}
