package esercizio4;

/*
 * Creare una classe Java che abbia all'interno un array di stringhe 
 * scelte dal programmatore. Stampare l'array a schermo.
 */

public class StampaArray4 {

	public static void main(String[] args) {
		
		String[] stringhe = {"Ciao", "Mondo", "come", "stai?"};
		
		// visualizza array
		for(int i=0; i<stringhe.length; i++)
			System.out.println(stringhe[i]);
	}
}
