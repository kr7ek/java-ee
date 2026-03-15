package livecoding0305;

public class Ciclo {

	public static void main(String[] args) {
		
		//STRUTTURE DI CONTROLLO ITERATIVE

		/*
		 * WHILE
		 * Ripete l'esecuzione di un blocco di istruzioni
		 * Fintanto che una condizione è vera
		 * PRIMA valuta la condizione poi esegue il blocco di istruzioni da ripetere
		 * 
		 * 
		 * int numero = 1 -> inizializzazione
		 * while(numero <= 5) -> condizione, espressione booleana
		 * System.out.println(numero); -> istruzione da ripetere
		 * numero++; -> incremente, aggiorna l'iterazione
		 */
		
		System.out.println("WHILE");
		int numero = 10;
		while(numero <= 5) {
			System.out.println(numero);
			numero++; //istruzione che modifica la condizione
		}
		
		System.out.println("-------------");
		//System.out.println(numero);
		
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		
		/*
		 * DO-WHILE
		 * Fintanto che una condizione è vera
		 * quando sono sicuro che le istruzioni contenute all'interno del ciclo
		 * debbano essere eseguite almeno una volta
		 * perchè prima esegue il blocco di codice da ripetere e DOPO valiuta la condizione
		 * Struttura che ammette al minimp una iterazione
		 * 
		 * int numero1 = 10; -> inizializzazione
		 * do { -> parola chiave
		 * System.out.println(numero1); -> blocco di istruzioni da ripetere
		 * numero1++; -> incremente, aggiornamento dell'iterazione
		 * } while (numero1 <= 5) -> espressione booleana
		 */
		
		System.out.println("DO - WHILE");
		int numero1 = 10;
		do {
			System.out.println(numero1);
			numero1++;
		} while(numero1 <= 5);
		
		
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		/*
		 * FOR
		 * molto simile al while, lo utilizziamo quando conosciamo esattamente il numero
		 * di volte per cui vogliamo ripetere il blocco di istruzioni
		 * 
		 * è composto da 3 statement
		 * for (inizializzazione; condizione - esprezzione booleana; aggiornamento) {
		 * 			istruzioni da ripetere
		 * }
		 */
		System.out.println("FOR");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		
		//CICLO INFINITO
		/*
		int m = 0;
		while(true) {
			System.out.println(m);
			m++;
		}
		*/
		
		//BREAK -> permette l'uscita dal ciclo infinito WHILE(TRUE)
		System.out.println("CICLO - INFINITO più BREAK");
		int num = 1;
		while(true) {
			System.out.println(num);
			num++;
			if (num > 3) {
				break; //interrompe il ciclo
			}
			
		}
		
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		
		//CICLO FOR con BREAK e CONTINUE
		//PAROLA CHIAVE: BREAK -> permette l'uscita dal ciclo, interrompe il ciclo
		System.out.println("CICLO FOR più BREAK");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		//PAROLA CHIAVE: CONTINUE -> termina solo l'iterazione corrente, NON l'intero ciclo
		System.out.println("CICLO FOR più CONTINUE");
		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				continue; //passa all'iterazione successiva
			}
			System.out.println(i);
		}
		
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		
		System.out.println("CICLO DO-WHILE più CONTINUE");
		int k = 0;
		do {
			k++;
			if(k == 5) {
				continue;
			}
			System.out.println(k);
		} while (k < 10);
		
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
	}

}
