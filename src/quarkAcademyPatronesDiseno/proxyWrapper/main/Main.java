package quarkAcademyPatronesDiseno.proxyWrapper.main;

import quarkAcademyPatronesDiseno.proxyWrapper.abstraction.ICuenta;
import quarkAcademyPatronesDiseno.proxyWrapper.model.Cuenta;

public class Main {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "Joaquin", 100);

		ICuenta cuentaProxy = new CuentaProxyWrapper();
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
	}

}
