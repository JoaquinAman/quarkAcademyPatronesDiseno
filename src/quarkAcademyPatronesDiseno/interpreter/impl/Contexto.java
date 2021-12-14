package quarkAcademyPatronesDiseno.interpreter.impl;

public class Contexto {
	private String expresion;
	private int valor;

	public String getExpresion() {
		return expresion;
	}

	public void setExpresion(String expresion) {
		this.expresion = expresion;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Contexto() {
	}

	public Contexto(String interExpresion) {
		expresion = interExpresion;
		System.out.println("Se evaluara: " + expresion);
	}
}
