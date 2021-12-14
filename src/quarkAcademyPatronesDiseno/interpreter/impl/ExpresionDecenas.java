package quarkAcademyPatronesDiseno.interpreter.impl;

import quarkAcademyPatronesDiseno.interpreter.abstraction.abstractExpresion;

public class ExpresionDecenas extends abstractExpresion {

	@Override
	public String unidad() {
		// TODO Auto-generated method stub
		return "X";
	}

	@Override
	protected String cuatro() {
		// TODO Auto-generated method stub
		return "XL";
	}

	@Override
	protected String cinco() {
		// TODO Auto-generated method stub
		return "L";
	}

	@Override
	protected String nueve() {
		// TODO Auto-generated method stub
		return "XC";
	}

	@Override
	protected int factor() {
		// TODO Auto-generated method stub
		return 10;
	}

}
