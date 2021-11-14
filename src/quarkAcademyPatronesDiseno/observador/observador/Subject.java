package quarkAcademyPatronesDiseno.observador.observador;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observador> observadores = new ArrayList<Observador>();
	private int estado;

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
		notificarTodosObservadores();
	}

	public void agregar(Observador observador) {
		observadores.add(observador);
	}

	public void notificarTodosObservadores() {
//		for (Observador observador : observadores) {
//			observador.actualizar();
//		}
		observadores.forEach(x -> x.actualizar());
	}
}
