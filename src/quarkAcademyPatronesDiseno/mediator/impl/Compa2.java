package quarkAcademyPatronesDiseno.mediator.impl;

import quarkAcademyPatronesDiseno.mediator.abstraction.Compi;
import quarkAcademyPatronesDiseno.mediator.abstraction.IMediator;

public class Compa2 extends Compi {

	public Compa2(IMediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("compa2 recibe el mensaje: " + message);
	}
}
