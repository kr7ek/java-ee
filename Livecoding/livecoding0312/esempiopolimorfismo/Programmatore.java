package esempiopolimorfismo;

public class Programmatore extends Dipendente {

	private String linguaggiConosciuti;
	private int anniEsperienza;

	public Programmatore() {

	}

	public Programmatore(String nome, String matricola, int stipendio, String linguaggiConosciuti, int anniEsperienza) {
		super(nome, matricola, stipendio); //chiama il costruttore della superclasse
		this.linguaggiConosciuti = linguaggiConosciuti;
		this.anniEsperienza = anniEsperienza;
	}
	
	public String getLinguaggiConosciuti() {
		return linguaggiConosciuti;
	}
	
	public void setLinguaggiConosciuti(String linguaggiConosciuti) {
		this.linguaggiConosciuti = linguaggiConosciuti;
	}
	
	public int getAnniEsperienza() {
		return anniEsperienza;
	}
	
	public void setAnniEsperienza(int anniEsperienza) {
		this.anniEsperienza = anniEsperienza;
	}
	
	/*Override -> sovrascrivere o ridefinire un metodo ereditato dalla superclasse
	 * @Overrride aggiunge funzionalità di controllo
	 * 
	 * stessa firma, stesso tipo di ritorno e non deve essere meno accessibile
	 * se non c'è throws nel metodo originale non può essere aggiunto
	 */
	@Override
	public String toString() {
		return super.toString() + " gli anni di esperienza sono " + this.anniEsperienza +
				" i linguaggi conosciuti sono " + this.linguaggiConosciuti; 
	}
}
