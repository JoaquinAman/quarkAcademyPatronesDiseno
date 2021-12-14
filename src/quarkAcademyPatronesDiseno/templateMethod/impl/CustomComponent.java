package quarkAcademyPatronesDiseno.templateMethod.impl;

import quarkAcademyPatronesDiseno.templateMethod.abstraction.AbstractComponent;

public class CustomComponent extends AbstractComponent {

	@Override
	public void beforeCreate() {
		System.out.println("before create Component");
	}

	@Override
	public void created() {
		System.out.println("Component Created");
	}

	public void renderEngine(AbstractComponent abs) {
		abs.create();
	}
}
