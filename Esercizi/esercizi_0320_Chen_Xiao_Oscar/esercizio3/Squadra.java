package esercizio3;

import java.util.ArrayList;

public class Squadra {

	// Attributi
	private String nome;
	private double capitaleSociale;
	private ArrayList<Giocatore> giocatori;

	// Costruttore
	public Squadra(String nome, double capitaleSociale) {
		this.nome = nome;
		this.capitaleSociale = capitaleSociale;
		this.giocatori = new ArrayList<>();
	}

	// Metodo per acquistare un giocatore
	public void acquistaGiocatore(Giocatore giocatore) {
		if (capitaleSociale >= giocatore.getPrezzo()) {
			giocatori.add(giocatore);
			capitaleSociale -= giocatore.getPrezzo();
			System.out.println("Giocatore " + giocatore.getNome() + " acquistato.");
		} else {
			System.out.println("Capitale sociale insufficiente per acquistare " + giocatore.getNome() + ".");
		}
	}

	// Metodo per vendere un giocatore
	public void vendiGiocatore(Giocatore giocatore) {
		if (giocatori.remove(giocatore)) {
			capitaleSociale += giocatore.getPrezzo();
			System.out.println("Giocatore " + giocatore.getNome() + " venduto.");
		} else {
			System.out.println("Il giocatore " + giocatore.getNome() + " non è nella squadra.");
		}
	}
}
