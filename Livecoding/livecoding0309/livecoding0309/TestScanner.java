package livecoding0309;

import java.util.Scanner; //deve essere importata

public class TestScanner {

	public static void main(String[] args) {

		// Classe Scanner -> leggere in input i dati dalla tastiera, dalla console
		// fa parte delle librerie standard di Java
		// System.in -> lo stream di input standard, cioè la tastiera

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero: "); //chiedo all'utente di scrivere un numero
		
		//input.nextInt() è il metodo che recupera i dati interi dalla console
		int num = input.nextInt(); //salva il numero all'interno della variabile num
		
		System.out.println("Il numero inserito è: "+ num);

		//serve per pulire la tastiera
		input.nextLine();
		
		System.out.println("Inserisci stringa: ");
		String stringa = input.nextLine(); //leggere intere righe di testo
		System.out.println("La stringa inserita è "+ stringa);
		
		//input.close() è il metodo per chiudere lo scanner
		input.close();
	}

}
