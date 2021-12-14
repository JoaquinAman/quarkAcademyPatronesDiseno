package quarkAcademyPatronesDiseno.visitor.impl;

import quarkAcademyPatronesDiseno.visitor.abstraction.IVisitable;
import quarkAcademyPatronesDiseno.visitor.abstraction.IVisitor;

public class TarjetaNormal implements IVisitable {
	private double precio;

	@Override
	public double aceptar(IVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
