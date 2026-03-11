package esercito;

public abstract class Soldato {

	protected String nome;

	public Soldato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void combatti() {
	}

	public void riposa() {
	}

	public void avanza() {
	}

	public abstract void gridoDiBattaglia();

	@Override
	public String toString() {
		return "Soldato";
	}
}
