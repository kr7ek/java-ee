package esercizio1_2;

/*
 * Dopo aver fatto l'esercizio 1, creare una classe Java che chiameremo EsempioCellulare, 
 * nello stesso package di Cellulare. La classe deve avere il metodo main e nel metodo main dovete: 
 * 
 *    · Istanziare una classe Cellulare
 *    · Simulare una chiamata 
 *    · Controllare il credito residuo 
 *    · Controllare l'ultimo numero chiamato
 */

public class EsempioCellulare {

	public static void main(String[] args) {

		// nuovo cellulare
		System.out.println("Creo nuovo Cellulare con il seguente numero: 1234567890;");
		Cellulare telefono = new Cellulare("1234567890");

		// chiamo ultimo numero
		System.out.println("Chiamo ultimo numero.");
		telefono.richiama();
		
		// chiamo il numero 0987654321
		telefono.chiama("0987654321");

		// controllo credito
		telefono.creditoResiduo();

		// ricarico il telefono
		telefono.ricaricaCredito(10);

		// chiamo il numero 0987654321
		telefono.chiama("0987654321");

		// controllo ultimo numero chiamato
		System.out.println("L'utimo numero chiamato e': " + telefono.ultimaChiamataEffettuata());

		// controllo credito
		telefono.creditoResiduo();
	}
}
