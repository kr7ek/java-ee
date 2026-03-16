package esercizio3;

import java.util.Scanner;

/*
 * Creare una classe Java con un metodo main che chieda l'immissione di un numero double. 
 * Gestire l'eccezione risultante dall'immissione di un carattere non numerico 
 * mostrando un messaggio di errore appropriato.
 */

public class InserimentoIllegale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		try {
			System.out.print("Per favore inserire un numero double: ");
			in.nextDouble();
		} catch (Exception e) {
			System.out.println("Errore");
		}

		in.close();
	}

}
