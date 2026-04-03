package esercizio8_9;

public class Insegnante extends Persona {

	private String materia;

	// costruttore default
	public Insegnante() {
		// TODO Auto-generated constructor stub
	}

	// costruttore parametrizzato
	public Insegnante(String nome, String cognome, int eta, String materia) {
		super(nome, cognome, eta);
		this.materia = materia;
		// TODO Auto-generated constructor stub
	}

	// getters e setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void insegna() {
		System.out.println(
				"L'insegnante " + this.getNome() + " " + this.getCognome() + " insegna " + this.getMateria() + ".");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " è un'insegnante che insegna " + this.getMateria();
	}

}
