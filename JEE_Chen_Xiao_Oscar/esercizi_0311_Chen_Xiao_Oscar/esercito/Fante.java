package esercito;

public class Fante extends Soldato {

	private String armatura;

	public Fante(String nome, String armatura) {
		super(nome);
		this.armatura = armatura;
		// TODO Auto-generated constructor stub
	}

	// getters e setters
	public String getArmatura() {
		return armatura;
	}

	public void setArmatura(String armatura) {
		this.armatura = armatura;
	}

	@Override
	public void gridoDiBattaglia() {
		// TODO Auto-generated method stub
		System.out.println("Il fante " + this.nome + " e' schierato!");

	}

	@Override
	public void combatti() {
		// TODO Auto-generated method stub
		System.out.println("Il fante " + this.nome + " sta attaccando!");
	}

	@Override
	public void riposa() {
		// TODO Auto-generated method stub
		System.out.println("Il fante " + this.nome + " sta riposando!");
	}

	@Override
	public void avanza() {
		// TODO Auto-generated method stub
		System.out.println("Il fante " + this.nome + " sta avanzando!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " [FANTE]: Nome: " + this.nome + ", Armatura: " + this.armatura;
	}

}
