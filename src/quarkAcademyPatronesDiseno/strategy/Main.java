package quarkAcademyPatronesDiseno.strategy;

import quarkAcademyPatronesDiseno.strategy.strategy.AntivirusAvanzado;
import quarkAcademyPatronesDiseno.strategy.strategy.Contexto;

public class Main {

	public static void main(String[] args) {
//		Contexto contexto = new Contexto(new AntivirusSimple());
//		contexto.ejecutar();
		Contexto contexto1 = new Contexto(new AntivirusAvanzado());
		contexto1.ejecutar();
	}

}
