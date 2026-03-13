package esercizio5;

public class Auto {

	private String scuderia;

	// costruttore default
	public Auto() {
	}

	// costruttore parametrizzato
	public Auto(String scuderia) {
		this.scuderia = scuderia;
	}

	// getters e setters
	public String getScuderia() {
		return scuderia;
	}

	public void setScuderia(String scuderia) {
		this.scuderia = scuderia;
	}

}
