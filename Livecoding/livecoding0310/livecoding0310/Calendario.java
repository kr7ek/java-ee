package livecoding0310;

public class Calendario {

	/*
	 * L'incapsulamento proteggere le informazioni, proteggere i dati impedendo
	 * l'uso all'esterno, permettendo di controllere come i dati vengono utilizzati
	 * mantendo il codice più sicuro e ordinati
	 */

	// Con private è accessibile solo all'interno di questa classe, per variabili e metodi
	private int giorno;
	private int mese;
	private int anno;
	
	//Senza modificatore, impostazione di default, visibile solo nel package
	String data;
	
	//protected per metodi e varibaili, visibile oltre che nel package anche nelle sottoclassi
	protected String info;

	//INTERFACCIA PUBBLICA DELLA CLASSE
	
	// Metodo GET -> permette l'accesso in lettura (Accessor method)
	public int getGiorno() {
		return giorno;
	}

	// Metodo SET -> permette di modificare il valore della variabile, accesso in
	// scrittura (Mutator methods)
	public void setGiorno(int giorno) {
		metodoPrivato();
		if (giorno >= 1 && giorno <= 31) {
			this.giorno = giorno;
		} else {
			System.out.println("Giorno non valido (da 1 a 31)");
		}
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		if (mese >= 1 && mese <= 12) {
			this.mese = mese;
		} else {
			System.out.println("Mese non valido (da 1 a 12)");
		}
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		if (anno > 0) {
			this.anno = anno;
		} else {
			System.out.println("Anno non valido");
		}
	}

	//public -> visibile da qualsiasi parte del programma 
	public String metodoPubblico() {
		metodoPrivato();
		return "Hai chiamato un metodo pubblico";
	}
	
	
	//Incapsulamento funzionale, rendere privati i metodi interni, nascondere i dettagli
	//del funzionamento, tale metodo potrà essere invocato solo da metodi dichiarati pubblici
	private void metodoPrivato() {
		System.out.println("Modifico il giorno");
	}
	
	/*
	 * toString() metodo della classe Object, la superclasse di tutte le classi java che
	 * trasforma un oggetto in una stringa
	 */
	public String toString() {
		return "Il giorno è: " + this.giorno + " mese: " + this.mese + " anno: " + this.anno;
	}
}
