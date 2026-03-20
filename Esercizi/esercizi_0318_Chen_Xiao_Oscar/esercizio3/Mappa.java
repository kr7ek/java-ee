package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Creare una classe Java che chieda all'utente di inserire 3 elementi chiave-valore in una mappa.
 * La chiave deve essere di interi, il valore deve essere una stringa. 
 * Alla fine il programma deve chiedere all'utente di scegliere una delle chiavi 
 * e deve stamparne a schermo il valore.
 */

public class Mappa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> mappa = new HashMap<>();
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("Inserire una chiave: ");
			int key = in.nextInt();
			in.nextLine();

			System.out.print("Inserire una Stringa: ");
			String value = in.nextLine();

			mappa.put(key, value);
		}
		
		System.out.print("Inserire una chiave valida: ");
		int chiave = in.nextInt();
		if(mappa.containsKey(chiave))
			System.out.print(mappa.get(chiave));
		else
			System.out.print("Chiave non valida.");
		
		in.close();

	}

}
