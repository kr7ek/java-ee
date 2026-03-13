package esercizio2;

public class Anime {

	String titolo;
	String director;
	int anno;
	String genere;

	// costruttore vuoto
	public Anime() {
		this.titolo = "";
		this.director = "";
		this.anno = 0;
		this.genere = "";
	}

	// costruttore parametrizzato
	public Anime(String titolo, String studio, int anno, String genere) {
		this.titolo = titolo;
		this.director = studio;
		this.anno = anno;
		this.genere = genere;
	}

	// inizializzatore di classe (statico)
	static {
		System.out.println("Nuova classe Anime creato.");
	}

	// inizializzatore di istanza
	{
		System.out.println("Nuovo oggetto Anime creato.");
	}

	// metodo per stampare i dettagli
	@Override
	public String toString() {
		return "Anime [titolo=" + titolo + ", studio=" + director + ", anno=" + anno + ", genere=" + genere + "]";
	}

}
