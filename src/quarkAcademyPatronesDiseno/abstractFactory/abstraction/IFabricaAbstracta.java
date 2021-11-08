package quarkAcademyPatronesDiseno.abstractFactory.abstraction;

public interface IFabricaAbstracta {
	IConexionBD getBD(String motor);

	IConexionREST getREST(String area);
}
