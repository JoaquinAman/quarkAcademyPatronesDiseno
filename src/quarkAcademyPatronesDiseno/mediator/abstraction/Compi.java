package quarkAcademyPatronesDiseno.mediator.abstraction;

public abstract class Compi {
	public IMediator mediator;

	public Compi(IMediator mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String message);

	public abstract void messageReceived(String message);

}
