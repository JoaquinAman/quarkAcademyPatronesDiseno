package quarkAcademyPatronesDiseno.command;

import quarkAcademyPatronesDiseno.command.commands.Cuenta;
import quarkAcademyPatronesDiseno.command.commands.DepositarImpl;
import quarkAcademyPatronesDiseno.command.commands.Invoker;
import quarkAcademyPatronesDiseno.command.commands.RetirarImpl;

public class Main {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1, 200);

		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);

		ivk.realizarOperaciones();
	}

}
