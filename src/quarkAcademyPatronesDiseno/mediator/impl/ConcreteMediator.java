package quarkAcademyPatronesDiseno.mediator.impl;

import quarkAcademyPatronesDiseno.mediator.abstraction.Compi;
import quarkAcademyPatronesDiseno.mediator.abstraction.IMediator;

public class ConcreteMediator implements IMediator {

	public Compa1 compa1;
	public Compa2 compa2;

	public void setCompa1(Compa1 compa1) {
		this.compa1 = compa1;
	}

	public void setCompa2(Compa2 compa2) {
		this.compa2 = compa2;
	}

	@Override
	public void send(String message, Compi compi) {
		System.out.println("s");
		if (compi == compa1) {
			compa2.messageReceived(message);
		} else if (compi == compa2) {
			compa1.messageReceived(message);
		} else {
			System.out.println("prueba");
		}
	}
}
