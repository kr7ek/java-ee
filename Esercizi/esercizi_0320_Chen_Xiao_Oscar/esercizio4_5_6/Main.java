package esercizio4_5_6;

/*
 * Modificare la classe Lampadina dell’esercizio precedente in modo che tutte le lampadine 
 * condividano l’informazione sulla presenza di corrente elettrica nell’impianto. 
 * Lo stato di una lampadina quando non c’è corrente può essere solo spento o rotto.
 * Per testare la classe, estendere il programma TestLampadina dell’esercizio precedente 
 * in modo che offra all’utente anche la possibilità di staccare o riattivare la corrente.
 */

public class Main {

	public static void testLampadina() {

		Lampadina lampadina = new Lampadina(10); // Crea una lampadina con un numero massimo di click pari a 10
		System.out.println("Lampadina creata con un numero massimo di click pari a 10.");

		// Simulazione di click sulla lampadina
		System.out.println("Inizio della simulazione dei click sulla lampadina...");
		while (true) {
			System.out.println("Stato attuale della lampadina: " + lampadina.getStato());
			lampadina.click();
			if (lampadina.getStato().equals("rotta")) {
				System.out.println("La lampadina è rotta. Terminazione del programma.");
				break;
			}
		}

		// Simulazione di staccare e riattivare la corrente
		System.out.println("\n***Simulazione di staccare e riattivare la corrente...***\n");

		Lampadina lampadina2 = new Lampadina(10); // Crea una nuova lampadina per testare la corrente
		System.out.println("Lampadina creata con un numero massimo di click pari a 10.");
		System.out.println(
				"Inizio della simulazione dei click sulla lampadina con la possibilità di staccare e riattivare la corrente...");
		int clicks = 0; // Contatore per tenere traccia del numero di click

		// Simulazione di click sulla lampadina con la possibilità
		// di staccare e riattivare la corrente dopo un certo numero di click

		while (true) {
			System.out.println("Stato attuale della lampadina: " + lampadina2.getStato());
			lampadina2.click();
			if (lampadina2.getStato().equals("rotta")) {
				System.out.println("La lampadina è rotta. Terminazione del programma.");
				break;
			}

			clicks++;

			// Stacca la corrente dopo 5 click
			if (clicks == 5) {
				lampadina2.staccaCorrente();
				lampadina2.click(); // Prova a cliccare quando la corrente è staccata
				lampadina2.riattivaCorrente();
			}
		}
	}

	public static void testInterruttore() {

		Lampadina lampadina = new Lampadina(10); // Crea una lampadina con un numero massimo di click pari a 10
		Interruttore interruttore1 = new Interruttore(lampadina); // Crea il primo interruttore collegato alla lampadina
		Interruttore interruttore2 = new Interruttore(lampadina); // Crea il secondo interruttore collegato alla stessa
																	// lampadina

		System.out.println("Interruttori creati e collegati alla stessa lampadina.");

		// Simulazione di azionamento degli interruttori
		System.out.println("Inizio della simulazione degli interruttori...");

		while (true) {
			System.out.println("Stato attuale della lampadina: " + interruttore1.statoLampadina());

			// Aziona il primo interruttore
			System.out.println("Azionamento del primo interruttore...");
			interruttore1.aziona();

			if (interruttore1.statoLampadina().equals("rotta")) {
				System.out.println("La lampadina è rotta. Terminazione del programma.");
				break;
			}

			// Aziona il secondo interruttore
			System.out.println("Azionamento del secondo interruttore...");
			interruttore2.aziona();

			if (interruttore2.statoLampadina().equals("rotta")) {
				System.out.println("La lampadina è rotta. Terminazione del programma.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n*** Test della classe Lampadina ***\n");
		testLampadina();
		System.out.println("\n*** Test della classe Interruttore ***\n");
		testInterruttore();
	}

}
