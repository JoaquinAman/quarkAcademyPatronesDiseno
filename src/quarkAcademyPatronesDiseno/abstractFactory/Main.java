package quarkAcademyPatronesDiseno.abstractFactory;

import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IConexionBD;
import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IConexionREST;
import quarkAcademyPatronesDiseno.abstractFactory.abstraction.IFabricaAbstracta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.pruebaImprime();

		IFabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://www.youtube.com/watch?v=QmE-o5R7ZF4&list=PLvimn1Ins-41Uiugt1WbpyFo1XT1WOquL&index=4");
	}

}
