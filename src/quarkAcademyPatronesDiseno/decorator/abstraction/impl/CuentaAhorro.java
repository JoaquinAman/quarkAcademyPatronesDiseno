package quarkAcademyPatronesDiseno.decorator.abstraction.impl;

import quarkAcademyPatronesDiseno.decorator.abstraction.ICuentaBancaria;
import quarkAcademyPatronesDiseno.decorator.model.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------");
		System.out.println("Se abrio una cuenta de Ahorros");
		System.out.println("Cliente: " + c.getCliente());
	}

}
