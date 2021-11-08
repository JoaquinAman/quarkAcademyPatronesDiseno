package quarkAcademyPatronesDiseno.decorator;

import quarkAcademyPatronesDiseno.decorator.abstraction.ICuentaBancaria;
import quarkAcademyPatronesDiseno.decorator.abstraction.impl.CuentaAhorro;
import quarkAcademyPatronesDiseno.decorator.decorator.BlindajeDecorador;
import quarkAcademyPatronesDiseno.decorator.model.Cuenta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta(1, "Joaquin");

		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

		cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}

}
