package polimorfismo;

public class EsempioOverload {

	/*
	 * Overload -> Polimorfismo per metodo Sovraccaricare il nome del metodo
	 * Utilizzare lo stesso nome per metodi diversi ma che hanno la stessa
	 * funzionalità
	 * 
	 */

	/*
	 * public -> modificatore di accesso, regola la visibilità static ->
	 * modificatore, metodo appartiene alla classe String -> tipo di ritorno (non fa
	 * parte della firma) stampa(String masseggio) -> FIRMA del metodo data
	 * dall'identficatore (nome del metodo (stampa) + lista dei parametri(String
	 * messaggio)
	 */
	public static String stampa(String messaggio) {
		return messaggio;
	}

	/*
	 * //non possiamo avere due metodi con lo stesso nome e gli stessi parametri in
	 * ingresso public static String stampa(String messaggio) { //da errore return
	 * "Ciao" + messaggio; }
	 */

	// se i parametri in ingresso sono diversi non c'è errore
	public static String stampa(String messaggio, String messaggio1) {
		return messaggio + " " + messaggio1;
	}

	public static String stampa(int numero) {
		return "Il numero è " + numero;
	}

	/*
	 * public static int stampa(int numero) { //da errore return numero; }
	 */

	public static int stampa(int numero, int numero1) {
		return numero + numero1;
	}

	public static String stampa(int numero, String messaggio) {
		return messaggio + " " + numero;
	}

	public static String stampa(String messaggio, int numero) {
		return messaggio + " " + numero;
	}

	public static void main(String[] args) {
		
		
		System.out.println(stampa(25));
		System.out.println(stampa(25, 36));
		System.out.println(stampa(5, "Sei alla posizione"));
		System.out.println(stampa("Sei alla posizione", 1));
		System.out.println(stampa("Ciao Mondo"));
		System.out.println(stampa("Ciao", "a tutti"));
	}
}
