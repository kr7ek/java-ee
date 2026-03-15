package esercito;

public class Cavaliere extends Soldato {

	private String cavallo;

	public Cavaliere() {

	}

	public Cavaliere(String nome, String cavallo) {
		super(nome);
		this.cavallo = cavallo;
		// TODO Auto-generated constructor stub
	}

	public String getCavallo() {
		return cavallo;
	}

	public void setCavallo(String cavallo) {
		this.cavallo = cavallo;
	}

	@Override
	public void gridoDiBattaglia() {
		// TODO Auto-generated method stub
		System.out.println("Il cavaliere " + this.nome + " e' stato schierato!");
	}

	@Override
	public void combatti() {
		// TODO Auto-generated method stub
		System.out.println("Il cavaliere " + this.nome + " sta attaccando!");
	}

	@Override
	public void riposa() {
		// TODO Auto-generated method stub
		System.out.println("Il cavaliere " + this.nome + " sta riposando!");
	}

	@Override
	public void avanza() {
		// TODO Auto-generated method stub
		System.out.println("Il cavaliere " + this.nome + " sta avanzando!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " [CAVALIERE]: Nome: " + this.nome + ", Cavallo: " + this.cavallo;
	}

}
