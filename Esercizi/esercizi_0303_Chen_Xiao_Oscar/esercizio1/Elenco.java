package esercizio1;

/*
 * Scrivere il programma Elenco che stampa la lista della spesa, 
 * dove ogni articolo da comprare risiede sul proprio rigo.
 */

public class Elenco {
	
	public static void main(String[] args) {
		
		String[] lista = {"Latte", "Uova", "Farina", "Sale", "Pomodoro", "Formaggio"};
		
		for(int i=0; i<lista.length; i++)
			System.out.println(lista[i]);
	}
	
}
