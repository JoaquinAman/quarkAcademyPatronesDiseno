package quarkAcademyPatronesDiseno.MVC.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import quarkAcademyPatronesDiseno.MVC.controlador.PersonaIdController;
import quarkAcademyPatronesDiseno.MVC.controlador.PersonaNombreController;
import quarkAcademyPatronesDiseno.MVC.modelo.Persona;

public class Marco extends JFrame {

	private Lamina_BotonesCheck laminaDatosPersona;
	private LaminaAccionImprimir laminaAccionImprimir;

	public Marco() {

		setTitle("Imprime datos Persona");

		setBounds(500, 100, 675, 450);

		JPanel lamina_cuadricula = new JPanel();

		lamina_cuadricula.setLayout(new GridLayout(2, 3));

		laminaDatosPersona = new Lamina_BotonesCheck("Datos de Persona");

		laminaAccionImprimir = new LaminaAccionImprimir("Accion imprimir");

		setLayout(new BorderLayout());

		lamina_cuadricula.add(laminaDatosPersona);
		lamina_cuadricula.add(laminaAccionImprimir);

		JPanel lamina_mostrar = new JPanel();

		JButton botonEjecutar = new JButton("Ejecutar");

		botonEjecutar.addActionListener(new AccionMostrar());

		lamina_mostrar.add(botonEjecutar);

		add(lamina_mostrar, BorderLayout.SOUTH);

		add(lamina_cuadricula, BorderLayout.CENTER);
	}

	public Lamina_BotonesCheck getLaminaDatosPersona() {
		return laminaDatosPersona;
	}

	public void setLaminaDatosPersona(Lamina_BotonesCheck laminaDatosPersona) {
		this.laminaDatosPersona = laminaDatosPersona;
	}

	public LaminaAccionImprimir getLaminaAccionImprimir() {
		return laminaAccionImprimir;
	}

	public void setLaminaAccionImprimir(LaminaAccionImprimir laminaAccionImprimir) {
		this.laminaAccionImprimir = laminaAccionImprimir;
	}

	public void recibeMain(Persona persona) {
		this.persona = persona;
	}

	Persona persona;

	// -------------------------------------------------------
	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (getLaminaAccionImprimir().getBotAccionImprimir().isSelected()) {
				String idPer = "";
				String nombrePersona = "";
				if (getLaminaDatosPersona().getBotIdPersona().isSelected()) {
					PersonaIdController personaIdController = new PersonaIdController();
					System.out.println("id de la persona: " + personaIdController.obtenerIdPersona(persona));

				}

				if (getLaminaDatosPersona().getBotNombrePersona().isSelected()) {
					PersonaNombreController personaNombreController = new PersonaNombreController();
					System.out
							.println("nombre de la persona: " + personaNombreController.obtenerNombrePersona(persona));
				}

			}

		}
	}
}
