package quarkAcademyPatronesDiseno.interpreter.impl;

import quarkAcademyPatronesDiseno.interpreter.abstraction.abstractExpresion;

public class ExpresionCientos extends abstractExpresion {

	@Override
	public String unidad() {
		// TODO Auto-generated method stub
		return "C";
	}

	@Override
	protected String cuatro() {
		// TODO Auto-generated method stub
		return "CD";
	}

	@Override
	protected String cinco() {
		// TODO Auto-generated method stub
		return "D";
	}

	@Override
	protected String nueve() {
		// TODO Auto-generated method stub
		return "CM";
	}

	@Override
	protected int factor() {
		// TODO Auto-generated method stub
		return 100;
	}

}
