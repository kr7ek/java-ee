package ereditarieta;

//L'impiegato è una Persona, sottoclasse di Persona, estende Persona
public class Impiegato extends Persona {

	private int oreLavoro;

	public Impiegato() {

	}

	public Impiegato(String nome, String cognome, int eta, double stipendio, int oreLavoro) {
		super(nome, cognome, eta, stipendio);
		this.oreLavoro = oreLavoro;
	}

	public int getOreLavoro() {
		return oreLavoro;
	}

	public void setOreLavoro(int oreLavoro) {
		this.oreLavoro = oreLavoro;
	}
	
	@Override
	public String toString() {
		return super.toString() + " ore di lavoro: " + this.oreLavoro;
	}
	
	//metodo specifico della classe Impiegato
	public double calcolaTariffaOraria() {
		double risultato = this.getStipendio() / this.oreLavoro;
		return risultato;
	}
	
	
}
