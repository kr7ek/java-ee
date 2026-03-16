package esercizio3_4;

/*
 * Creare una classe Java che rappresenti una macchinetta per il caffè a cialde. 
 * Dotare la classe degli attributi e costruttori che ritenete appropriati, applicando i principi dell'incapsulamento. 
 * Dotare la classe dei metodi necessari per fare queste azioni:
 * a. Simulare un caffè, usando una cialda.
 * b. Svuotare il cassetto delle cialde usate quando è pieno.
 * c. Mostrare quanti caffè sono stati fatti in totale.
 * d. Mostrare quanti caffè sono stati fatti dall'ultima volta che si è svuotato il cassetto delle cialde usate.
 * 
 * Creare una classe Java per istanziare una classe Macchinetta dell'esercizio 3 e fornire qualche esempio.
 */

public class Main {

	public static void main(String[] args) {

		Macchinetta macchinetta = new Macchinetta(7);
		System.out.println(
				"Comprata nuova macchinetta che prepara fino a " + macchinetta.getCassetto() + " cialde consecutive!");

		System.out.println("Sto preparando 100 caffe'. Attendere...");

		// preparazione 100 caffe'
		for (int i = 0; i < 100; i++) {

			macchinetta.preparaCaffe();

			if (macchinetta.getCaffeDaUltimoSvuotamento() == macchinetta.getCassetto()) {
				macchinetta.preparaCaffe();
				macchinetta.svuotaCassetto();
				continue;
			}
		}

		macchinetta.visualizzaCaffeTotali();
		macchinetta.visualizzaCaffeDaUltimoSvuotamento();

	}

}
