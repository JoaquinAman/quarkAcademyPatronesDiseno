package quarkAcademyPatronesDiseno.interpreter.abstraction;

import quarkAcademyPatronesDiseno.interpreter.impl.Contexto;

public abstract class abstractExpresion {
	public void interpretar(Contexto contexto) {
		// sale si ya no hay elementos q interpretar
		if (contexto.getExpresion().length() == 0) {
			return;
		}

		// verifica si empieza con 9
		if (contexto.getExpresion().startsWith(nueve())) {
			// se agrega el 9 segun la posicion que ocupa, 1,10,100
			contexto.setValor(contexto.getValor() + (9 * factor()));
			// elimina dos caracteres IX, XC, CM
			contexto.setExpresion(contexto.getExpresion().substring(2));
		}

		// verifica si empieza con 4
		else if (contexto.getExpresion().startsWith(cuatro())) {
			contexto.setValor(contexto.getValor() + (4 * factor()));
			contexto.setExpresion(contexto.getExpresion().substring(2));
		}

		// verifica si empieza con 5
		else if (contexto.getExpresion().startsWith(cinco())) {
			contexto.setValor(contexto.getValor() + (5 * factor()));
			contexto.setExpresion(contexto.getExpresion().substring(1));
		}

		while (contexto.getExpresion().startsWith(unidad())) {
			contexto.setValor(contexto.getValor() + (1 * factor()));
			contexto.setExpresion(contexto.getExpresion().substring(1));
		}

	}

	public abstract String unidad();

	protected abstract String cuatro();

	protected abstract String cinco();

	protected abstract String nueve();

	protected abstract int factor();

}
