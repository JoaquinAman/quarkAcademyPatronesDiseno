package quarkAcademyPatronesDiseno.visitor.impl;

import quarkAcademyPatronesDiseno.visitor.abstraction.IVisitor;

public class Descuento implements IVisitor {

	private final double sinDescuento = 0.833333;
	private final double conDescuento = 0.333333;

	@Override
	public double visit(TarjetaNormal normal) {
		// TODO Auto-generated method stub
		return normal.getPrecio() * sinDescuento;
	}

	@Override
	public double visit(TarjetaConDescuento descuento) {
		// TODO Auto-generated method stub
		return descuento.getPrecio() * conDescuento;
	}
}
