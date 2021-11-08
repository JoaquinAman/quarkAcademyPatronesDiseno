package quarkAcademyPatronesDiseno.prototype;

import quarkAcademyPatronesDiseno.prototype.model.CuentaAhorroImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaAhorroImpl cuentaAhorro = new CuentaAhorroImpl();
		cuentaAhorro.setMonto(200);
		CuentaAhorroImpl cuentaClonada = (CuentaAhorroImpl) cuentaAhorro.clonar();

		if (cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}

		System.out.println(cuentaClonada == cuentaAhorro);
	}

}
