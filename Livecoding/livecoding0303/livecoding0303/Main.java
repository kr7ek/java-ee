package livecoding0303;

public class Main {

	public static void main(String[] args) {

		/*
		 * int -> parola chiave che indica il tipo di dato per i numeri interi, tipo
		 * primitivo numero -> il nome della variabile, è un identificativo 10 -> il
		 * valore
		 */
		int numero = 10; // dichiarazione + assegnazione

		int numero2; // dichirazione
		// ...scrivo altro codice...
		numero2 = 100; // assegnazione

		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(numero + numero2); // 110
		System.out.println(numero + " " + numero2); // 10 100

		// double -> indica il tipo di dato in virgola mobile, tipo primitivo
		double numeroConVirgola = 11.2;

		// char -> rappresenta i singoli caratteri codificati secondo lo schema Unicode
		char carattere = 'c';

		// boolean -> due valori logici, true e false, vero e falso
		boolean valoreBoolean = true;

		System.out.println(numeroConVirgola);
		System.out.println(carattere);
		System.out.println(valoreBoolean);

		/*
		 * String -> per le sequenze di caratteri e va con le doppie virgolette String
		 * va con la prima lettera maiuscola perchè è una classe NON è un tipo
		 * primitivo, è un dato di tipo reference
		 */
		String stringa = "Messaggio di prova";

		System.out.println(stringa);

		System.out.println("----------");

		/*
		 * Creazione di un oggetto di tipo Gatto
		 * 
		 * Gatto -> Nome della classe, il tipo di oggetto che voglio creare gatto1 ->
		 * l'identificatore, il nome della variabile new -> parola chiave per creare
		 * l'oggetto Gatto() -> il costruttore
		 */

		Gatto gatto1 = new Gatto(); // costruttore vuoto
		System.out.println("Il gatto si chiama " + gatto1.nome);
		gatto1.nome = "Aron";
		gatto1.eta = 5;
		System.out.println("Il gatto si chiama " + gatto1.nome);
		gatto1.miagola();
		System.out.println(gatto1.cammina());
		String stringaGatto = gatto1.cammina();
		System.out.println(gatto1.nome + stringaGatto);

		int numeroZampe = gatto1.numeroZampe();
		System.out.println(gatto1.nome + " ha " + numeroZampe + " zampe");

		// costruttore parametrizzato
		Gatto gatto2 = new Gatto("Giotto", 2, "Persiano", "Furbetto", true);
		Gatto gatto3 = new Gatto("Micia");
		gatto3.eta = 4;
		gatto3.particolare = "Randagio";

		gatto2.razza = "Siamese";
		System.out.println(gatto2.razza);
		
		System.out.println("----------");
		
		System.out.println(differenza(10, 8));
		System.out.println(differenza(36, 8));
		System.out.println(differenza(gatto3.eta, gatto2.eta));
	}

	// Metodo che calcola la differenza tra due numeri
	public static int differenza(int a, int b) {
		int risultato = a - b;
		return risultato;
	}

}
