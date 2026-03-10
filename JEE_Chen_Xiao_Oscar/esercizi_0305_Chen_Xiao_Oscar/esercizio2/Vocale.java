package esercizio2;

/*
 * Creare una classe Java che controlli un carattere.
 * Stampare a schermo se si tratta di una vocale o di una consonante.
 */

public class Vocale {

	public static void main(String[] args) {
		
		String msg = "Creare una classe Java che controlli un carattere. "
				+ "Stampare a schermo se si tratta di una vocale o di una consonante";
		
		int j = 0;
		
		for(int i=0; i < msg.length(); i++) {
			switch(msg.charAt(i)){
				case 'a': {
					System.out.println("Trovata una vocale");
					j++;
					break;
				}
				case 'e': {
					System.out.println("Trovata una vocale");
					j++;
					break;
				}
				case 'i': {
					System.out.println("Trovata una vocale");
					j++;
					break;
				}
				case 'o': {
					System.out.println("Trovata una vocale");
					j++;
					break;
				}
				case 'u': {
					System.out.println("Trovata una vocale");
					j++;
					break;
				}
			}
		}
		
		System.out.println("In totale ci sono " + j + " vocali.");
	}
}
