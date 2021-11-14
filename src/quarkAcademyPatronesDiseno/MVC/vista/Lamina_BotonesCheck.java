package quarkAcademyPatronesDiseno.MVC.vista;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Lamina_BotonesCheck extends JPanel {
	public Lamina_BotonesCheck(String titulo) {

		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		botIdPersona = new JCheckBox();
		botNombrePersona = new JCheckBox();
		botIdPersona.setText("id de la persona");
		botNombrePersona.setText("nombre de la persona");
		add(botIdPersona);
		add(botNombrePersona);

	}

	private JCheckBox botIdPersona;
	private JCheckBox botNombrePersona;

	public JCheckBox getBotIdPersona() {
		return botIdPersona;
	}

	public void setBotIdPersona(JCheckBox botIdPersona) {
		this.botIdPersona = botIdPersona;
	}

	public JCheckBox getBotNombrePersona() {
		return botNombrePersona;
	}

	public void setBotNombrePersona(JCheckBox botNombrePersona) {
		this.botNombrePersona = botNombrePersona;
	}

}
