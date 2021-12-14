package quarkAcademyPatronesDiseno.mediator.impl;

import quarkAcademyPatronesDiseno.mediator.abstraction.Compi;
import quarkAcademyPatronesDiseno.mediator.abstraction.IMediator;

public class Compa1 extends Compi {

	public Compa1(IMediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("compa1 recibe el mensaje: " + message);
	}

}
