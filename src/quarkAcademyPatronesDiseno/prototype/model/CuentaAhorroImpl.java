package quarkAcademyPatronesDiseno.prototype.model;

import quarkAcademyPatronesDiseno.prototype.abstraction.ICuenta;

public class CuentaAhorroImpl implements ICuenta {
	private String tipo;
	private double monto;

	public CuentaAhorroImpl() {
		tipo = "AHORRO";
	}

	@Override
	public ICuenta clonar() {
		// TODO Auto-generated method stub
		CuentaAhorroImpl cuenta = null;
		try {
			cuenta = (CuentaAhorroImpl) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cuenta;
	}

	@Override
	public String toString() {
		return "CuentaAhorroImple [tipo=" + tipo + ", monto=" + monto + "]";
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
}
