package quarkAcademyPatronesDiseno.visitor.abstraction;

import quarkAcademyPatronesDiseno.visitor.impl.TarjetaConDescuento;
import quarkAcademyPatronesDiseno.visitor.impl.TarjetaNormal;

public interface IVisitor {
	public double visit(TarjetaNormal normal);

	public double visit(TarjetaConDescuento descuento);

}
