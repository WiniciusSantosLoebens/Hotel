package Objetos;

import java.util.Date;

public class Reservas {
	String nomeHospede;
	Date checkin;
	Date checkout;
	int numeroQuartosReservados;
	String tipoQuartoReservado;
	
	
	public Reservas(String nomeHospede, Date checkin, Date checkout, int numeroQuartos, String tipoQuarto) {
		this.nomeHospede = nomeHospede;
		this.checkin = checkin;
		this.checkout = checkout;
		this.numeroQuartosReservados = numeroQuartos;
		this.tipoQuartoReservado = tipoQuarto;
	}

}
