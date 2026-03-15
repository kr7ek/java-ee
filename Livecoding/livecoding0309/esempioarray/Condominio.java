package esempioarray;

public class Condominio {

	// Dichiarazione
	Persona[] condominio;

	// Dichiarazione e creazione
	// Persona[] condominio = new Persona[10];

	// Costruttori
	public Condominio() {
		this.condominio = new Persona[10]; // creazione
	}

	public Condominio(Persona[] condominio) {
		this.condominio = condominio;
	}

	public Condominio(int numeroCondomini) {
		this.condominio = new Persona[numeroCondomini];
	}

	// aggiungere persone al condominio (all'array)
	public void aggiungiPersona(Persona p) {
		for (int i = 0; i < this.condominio.length; i++) {
			if (this.condominio[i] == null) {
				this.condominio[i] = p;
				break;
			}
		}
	}

	// Stampare i condomini
	public void stampaCondomini() {
		for (int i = 0; i < this.condominio.length; i++) {
			if (this.condominio[i] != null) {
				System.out.println(this.condominio[i].nome + " " + this.condominio[i].cognome);
			}
		}
	}

}
