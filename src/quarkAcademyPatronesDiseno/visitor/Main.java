package quarkAcademyPatronesDiseno.visitor;

import quarkAcademyPatronesDiseno.visitor.impl.Descuento;
import quarkAcademyPatronesDiseno.visitor.impl.TarjetaConDescuento;
import quarkAcademyPatronesDiseno.visitor.impl.TarjetaNormal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TarjetaConDescuento tarj1 = new TarjetaConDescuento();
		tarj1.setPrecio(1800);
		TarjetaNormal tarj2 = new TarjetaNormal();
		tarj2.setPrecio(1800);

		Descuento descuento = new Descuento();
		double resultado1 = tarj1.aceptar(descuento);
		double resultado2 = tarj2.aceptar(descuento);

		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
