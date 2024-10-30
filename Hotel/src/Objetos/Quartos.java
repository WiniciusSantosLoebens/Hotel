package Objetos;

public class Quartos {
	int numero;
	String tipo;
	double precoDiario;
	boolean disponivel;

	public Quartos(int numero, String tipo, double precoDiario) {
		this.numero = numero;
		this.tipo = tipo;
		this.precoDiario = precoDiario;
		this.disponivel = true;
	}
	
	public void ocupar() {
		disponivel = false;
	}
	
	public void desocupar() {
		disponivel = true;
	}
}
