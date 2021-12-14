package quarkAcademyPatronesDiseno.templateMethod.abstraction;

public abstract class AbstractComponent {

	public void create() {
		beforeCreate();
		created();
	}

	public abstract void beforeCreate();

	public abstract void created();
}
