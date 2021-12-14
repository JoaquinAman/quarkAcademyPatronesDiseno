package quarkAcademyPatronesDiseno.interpreter.impl;

import quarkAcademyPatronesDiseno.interpreter.abstraction.abstractExpresion;

public class ExpresionUnidad extends abstractExpresion {

	@Override
	public String unidad() {
		// TODO Auto-generated method stub
		return "I";
	}

	@Override
	protected String cuatro() {
		// TODO Auto-generated method stub
		return "IV";
	}

	@Override
	protected String cinco() {
		// TODO Auto-generated method stub
		return "V";
	}

	@Override
	protected String nueve() {
		// TODO Auto-generated method stub
		return "XI";
	}

	@Override
	protected int factor() {
		// TODO Auto-generated method stub
		return 1;
	}

}
