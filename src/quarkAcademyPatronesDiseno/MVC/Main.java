package quarkAcademyPatronesDiseno.MVC;

import javax.swing.JFrame;

import quarkAcademyPatronesDiseno.MVC.modelo.Persona;
import quarkAcademyPatronesDiseno.MVC.vista.Marco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		p.setId(1);
		p.setNombre("Joaquin");

		Marco miMarco = new Marco();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miMarco.setVisible(true);

		miMarco.recibeMain(p);
	}

}
