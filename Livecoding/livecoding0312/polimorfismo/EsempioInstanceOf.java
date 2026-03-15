package polimorfismo;

import esempiopolimorfismo.Dipendente;
import esempiopolimorfismo.Programmatore;

public class EsempioInstanceOf {

	public static void main(String[] args) {

		/*
		 * Object è la superclasse di tutte le classi, ogni classe Java la estende
		 * automaticamente tutti gli oggetti sono anche object le stringhe sono object,
		 * gli interi sono object, i boolean sono object
		 */

		//Object obj = "Elia";
		//Object obj = 5;
		Object obj = true;
		//Tutto è un oggetto, quindi possiamo utilizzare come reference la classe Object
		Object oggetto = new Dipendente();
		Object oggettoP = new Programmatore();

		/*
		 * instanceOf va a verificare se l'oggetto appartiene ad una determinata
		 * tipologia di dato, se è un'istanza di quella classe
		 * 
		 * Restituisce TRUE se obj è una istanza di String/Integer/Boolean 
		 * Restituisce FALSE se obj è di un'altro tipo oppure è null
		 */
		
		if (obj instanceof String) {
			System.out.println("L'oggetto è una stringa");
		} else if(obj instanceof Integer) {
			System.out.println("L'oggetto è un intero");
		} else if(obj instanceof Boolean) {
			System.out.println("Loggetto è un boolean");
		} else {
			System.out.println("L'oggetto NON è String, Integer o Boolean");
		}

		
		if (oggetto instanceof Dipendente) {
			System.out.println("E' un dipendente");
		}
		
		if (oggettoP instanceof Programmatore) {
			System.out.println("E' un programmatore");
		}
	}

}
