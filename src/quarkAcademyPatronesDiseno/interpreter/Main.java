package quarkAcademyPatronesDiseno.interpreter;

import java.util.ArrayList;

import quarkAcademyPatronesDiseno.interpreter.abstraction.abstractExpresion;
import quarkAcademyPatronesDiseno.interpreter.impl.Contexto;
import quarkAcademyPatronesDiseno.interpreter.impl.ExpresionCientos;
import quarkAcademyPatronesDiseno.interpreter.impl.ExpresionDecenas;
import quarkAcademyPatronesDiseno.interpreter.impl.ExpresionMiles;
import quarkAcademyPatronesDiseno.interpreter.impl.ExpresionUnidad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expresionAEvaluar = "MCMXCIX";
		Contexto contexto = new Contexto(expresionAEvaluar);

		ArrayList<abstractExpresion> arbol = new ArrayList<abstractExpresion>();
		arbol.add(new ExpresionMiles());
		arbol.add(new ExpresionCientos());
		arbol.add(new ExpresionDecenas());
		arbol.add(new ExpresionUnidad());

		for (abstractExpresion abstr : arbol) {
			abstr.interpretar(contexto);
		}

		System.out.println("El numero romano: " + expresionAEvaluar + " es: " + contexto.getValor() + " en decimal.");
	}

}
