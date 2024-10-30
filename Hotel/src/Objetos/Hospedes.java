package Objetos;

import java.util.ArrayList;

public class Hospedes {
	String nome;
	ArrayList<Reservas>historicoReservas;

	public Hospedes(String nome) {
		this.nome = nome;
		this.historicoReservas = new ArrayList<>();
	}
	
	public void adicionarReserva(Reservas reserva) {
		historicoReservas.add(reserva);
	}
	
	public void mostrarHistoricoReservas() {
		System.out.println("Histórico de Reservas de " + nome + ":");
		for (Reservas reserva : historicoReservas) {
			
	System.out.println("Check-in: " + reserva.checkin + ", Check-out:" + reserva.checkout + ", Tipo de Quarto: " + reserva.tipoQuartoReservado + ", Número de quartos: " + reserva.numeroQuartosReservados);
		}
	}
}
