package esempiopolimorfismo;

public class Dipendente {

	private String nome;
	private String matricola;
	private int stipendio;

	public Dipendente() {

	}

	public Dipendente(String nome, String matricola) {
		this.nome = nome;
		this.matricola = matricola;
	}

	public Dipendente(String nome, String matricola, int stipendio) {
		this(nome, matricola); //richiamare il costruttore della stessa classe (rigo 13)
		this.stipendio = stipendio;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public int getStipendio() {
		return stipendio;
	}
	
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	/*
	 * Un parametro di tipo reference si dice parametro poliformo quando può
	 * puntare a un oggetto istanziato da una sottoclasse
	 * Sfrutta il polimorfismo per dati
	 * Parametro (dip) può puntare a diversi oggetti
	 */
	public static void calcolaStipendio(Dipendente dip) {
		Programmatore p = null;
		Dirigente d = null;
		Venditore v = null;
		
		//instanceof -> controlla se dip è una istanza di Programmatore
		if (dip instanceof Programmatore) {
			/*
			 * dip è un dipendente e non riesce ad accedere agli anni di esperienza
			 * dip.setAnniEsperienza(0);
			 * Serve un cast sull'oggetto; 	
			 * ((Programmatore) dip).getAnniEsperienza();
			 * 		
			*/
			p = (Programmatore)dip;
			if(p.getAnniEsperienza() <2) {
				p.setStipendio(1300);
			}else if (p.getAnniEsperienza()>= 10){
				p.setStipendio(2500);
			}else {
				p.setStipendio(1900);
			}
			
		}
		
		if(dip instanceof Dirigente) { //dip è un Dirigente?
			d = (Dirigente)dip;
			
			/*
			 * equals() è un metodo che confronta il contenuto della stringa
			 * cioè confronta se le sequenze di caratteri sono uguali
			 * se sono uguali restituisce true se sono diverse restituisce false
			 * equivale a d.getGrado() == "Primo Livello"
			 */
			if (d.getGrado().equals("Primo Livello")) {
				d.setStipendio(3000);
			}else if(d.getGrado().equals("Secondo Livello")) {
				d.setStipendio(5000);
			}else {
				d.setStipendio(2000);
			}
		}
		
		if (dip instanceof Venditore) {
			v = (Venditore) dip;
			v.setStipendio(1000 + v.provviggioni);
		}
	}
	
	
	
	public String toString() {
		return "Dipendente: " + this.nome + " matricola " + this.matricola + " stipendio " + stipendio + " euro";
	}
	
}
