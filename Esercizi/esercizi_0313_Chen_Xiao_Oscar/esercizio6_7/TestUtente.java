package esercizio6_7;

/*
 * Sviluppare una classe Test per testare la classe ContrattoTelefonico 
 * e le sue sottoclassi ContrattoFisso e ContrattoMobile. 
 * Definire due utenti, uno fisso e uno mobile. 
 * I due utenti fanno una serie di telefonate di un certo tempo, 
 * alla fine stampare le loro bollette telefoniche.
*/
public class TestUtente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContrattoFisso utentef = new ContrattoFisso("0123456789", "Mario", "Via Fisso 1");
		ContrattoMobile utentem = new ContrattoMobile("3456789012", "Mario");

		System.out
				.println("L'utente con contratto fisso ha effetuato una chiamata di 180 secondi.\nLa sua bolletta e'di "
						+ utentef.calcoloBolletta(180) + " euro.");
		System.out.println("L'utente con contratto mobile ha effetuato una chiamata di 180 secondi.\nLa sua bolletta e' di "
				+ utentem.calcoloBolletta(180) + " euro.");

	}

}
