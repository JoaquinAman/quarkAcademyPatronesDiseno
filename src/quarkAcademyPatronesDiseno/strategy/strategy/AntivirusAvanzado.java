package quarkAcademyPatronesDiseno.strategy.strategy;

public class AntivirusAvanzado extends AnalisisAvanzado {

	@Override
	void iniciar() {
		System.out.println("Antivirus Avanzado - Analisis simple iniciado");

	}

	@Override
	void analizarMemoria() {
		try {
			System.out.println("Analizando Memoria RAM...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void analizarKeyloggers() {
		try {
			System.out.println("Analizando en busca de Keyloggers...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void analizarRootKits() {
		try {
			System.out.println("Analizando RootKits...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void descomprimirZip() {
		try {
			System.out.println("Descomprimiendo Zip...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	void detener() {
		System.out.println("Antivirus Avanzado - Analisis avanzado finalizado");
	}

}
