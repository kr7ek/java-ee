package esercizio1;

public class Gatto {

	private int microchip;
	private String nome;
	private int eta;
	private String colorePelo;

	public Gatto() {
		super();
	}

	public Gatto(int microchip, String nome, int eta, String colorePelo) {
		this.microchip = microchip;
		this.nome = nome;
		this.eta = eta;
		this.colorePelo = colorePelo;
	}

	public int getMicrochip() {
		return microchip;
	}

	public void setMicrochip(int microchip) {
		this.microchip = microchip;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getColorePelo() {
		return colorePelo;
	}

	public void setColorePelo(String colorePelo) {
		this.colorePelo = colorePelo;
	}

	@Override
	public String toString() {
		return "Gatto [microchip=" + microchip + ", nome=" + nome + ", eta=" + eta + ", colorePelo=" + colorePelo + "]";
	}
}
