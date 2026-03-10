package esercizio4;

/*
 * Scrivere una classe che abbia un metodo main e un altro metodo che, 
 * presi come parametri un nome ed un cognome, stampi entrambi a schermo. 
 * Dentro al metodo main richiamare l’altro metodo per fornire un esempio.
 */

public class NomeCognome {

	public static void main(String[] args) {
		
		stampaNomeCognome("Pinco", "Pallino");
		stampaNomeCognome("Mario", "Rossi");
		stampaNomeCognome("Tizio", "Caio");
	}
	
	public static void stampaNomeCognome(String nome, String cognome) {
		
		System.out.println(nome + " " + cognome);
		
	}
}
