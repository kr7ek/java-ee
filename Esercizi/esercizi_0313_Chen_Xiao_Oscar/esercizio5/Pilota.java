package esercizio5;

public class Pilota {

	private String nome;
	private Auto auto;

	// cotruttore default
	public Pilota() {
		this.nome = "";
		this.auto = null;
	}

	// costruttore parametrizzato
	public Pilota(String nome, Auto auto) {
		this.nome = nome;
		this.auto = auto;
	}

	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

}
