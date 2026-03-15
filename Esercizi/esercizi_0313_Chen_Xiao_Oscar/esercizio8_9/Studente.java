package esercizio8_9;

public class Studente extends Persona {

	private double mediaVoti;

	// costruttore default
	public Studente() {
		// TODO Auto-generated constructor stub
	}

	// costruttore parametrizzato
	public Studente(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		this.mediaVoti = 0;
		// TODO Auto-generated constructor stub
	}

	// getters e setters
	public double getMediaVoti() {
		return mediaVoti;
	}

	public void setMediaVoti(double mediaVoti) {
		this.mediaVoti = mediaVoti;
	}

	// metodo studia
	public void studia() {
		System.out.println("Lo Studente " + this.getNome() + " " + this.getCognome() + " sta studiando...");
	}

	// metodo per calcolare media voti
	public void calcolaMediaVoti(int... voti) {

		if (voti.length == 0) {
			System.out.println("Nessun voto inserito!");
			return;
		}

		int media = 0;
		int i = 0;
		for (int v : voti) {
			media += v;
			i++;
		}

		mediaVoti = (double) media / i;

		System.out.println(
				"Lo Studente " + this.getNome() + " " + this.getCognome() + " ha la media del " + this.mediaVoti + ".");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " e' uno Studente con la media del " + this.mediaVoti;
	}

}
