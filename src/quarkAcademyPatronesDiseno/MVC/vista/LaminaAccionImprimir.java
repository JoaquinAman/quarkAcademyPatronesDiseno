package quarkAcademyPatronesDiseno.MVC.vista;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class LaminaAccionImprimir extends JPanel {
	public LaminaAccionImprimir(String titulo) {

		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		botAccionImprimir = new JCheckBox();
		botAccionImprimir.setText("imprimir");
		add(botAccionImprimir);
	}

	private JCheckBox botAccionImprimir;

	public JCheckBox getBotAccionImprimir() {
		return botAccionImprimir;
	}

	public void setBotAccionImprimir(JCheckBox botAccionImprimir) {
		this.botAccionImprimir = botAccionImprimir;
	}

}
