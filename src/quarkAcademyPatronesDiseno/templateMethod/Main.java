package quarkAcademyPatronesDiseno.templateMethod;

import quarkAcademyPatronesDiseno.templateMethod.impl.CustomComponent;

public class Main {

	public static void main(String[] args) {
		CustomComponent csComp = new CustomComponent();
		csComp.renderEngine(csComp);
	}

}
