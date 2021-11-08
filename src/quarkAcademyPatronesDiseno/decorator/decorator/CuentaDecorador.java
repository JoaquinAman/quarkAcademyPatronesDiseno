package quarkAcademyPatronesDiseno.decorator.decorator;

import quarkAcademyPatronesDiseno.decorator.abstraction.ICuentaBancaria;
import quarkAcademyPatronesDiseno.decorator.model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria {
	protected ICuentaBancaria cuentaDecorada;

	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		// TODO Auto-generated method stub
		this.cuentaDecorada.abrirCuenta(c);
	}
}
