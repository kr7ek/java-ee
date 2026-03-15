package polimorfismo;

public class EsempioVarargs {
	
	public static void main(String[] args) {
		
		
		String[] nomi = {"Elia", "Leone", "Luca"};
		String[] nomi1 = {"Elia"};
		String[] nomi2 = {"Elia", "Leone", "Luca", "Giovanna"};
		stampa(nomi);
		System.out.println("----------");
		stampa(nomi1);
		System.out.println("----------");
		stampa(nomi2);
		
		System.out.println("----------");
		System.out.println("----------");
		System.out.println("----------");
		
		
		/*
		 * VARARGS
		 * si utilizzano come argomenti per metodi quando vogliamo che vengano accettati
		 * un numero imprecisato, non definito, di parametri
		 * 
		 * ... -> numero variabile di parametri
		 * 
		 * viene considerato come un array, deve essere l'ultimo parametro e possiamo avere
		 * solo un varargs per metodo
		 * 
		 */
		stampaVarargs("Elia");
		System.out.println("----------");
		stampaVarargs("Elia", "Leone");
		System.out.println("----------");
		stampaVarargs("Elia", "Leone", "Giovanna", "Luca");
		
		
		System.out.println("----------");
		System.out.println("----------");
		System.out.println("----------");
		stampa(25);
		System.out.println("----------");
		stampa(32,50,75);
		System.out.println("----------");
		stampa(100, 35, 48, 15, 8);
	}
	
	public static void stampaVarargs(String...stringhe) {
		
		//System.out.println(stringhe[0]);
		
		/*
		 * For-each è un ciclo che permette di iterare sugli elementi di un array oppure di
		 * una collezione in modo semplice, senza indice, senza il problema della lunghezza,
		 * senza gestire gli indici manualmente, non creaimo anualmente l'array
		 * 
		 * for(tipo identificatore : nomeArray)
		 * String -> tipo di dato
		 * srt -> è l'identificatore della variabile, elemento corrente
		 * stringhe -> array o la collezione che vogliamo scorrere
		 */
		for(String str : stringhe) {
			System.out.println(str);
		}
		
		
	}
	
	public static void stampa(int...numeri) {
		for(int numero : numeri) {
			System.out.println(numero);
		}
	}
	
	public static void stampa(String[] arrayStringhe) {
		for(int i = 0; i< arrayStringhe.length; i++) {
			System.out.println(arrayStringhe[i]);
		}
	}

}
