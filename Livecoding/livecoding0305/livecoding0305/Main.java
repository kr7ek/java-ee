package livecoding0305;

public class Main {
	
	public static void main(String[] args) {
		
		//L'operatore modulo % restituisce il resto della divisione
		//utilizzato per controllare se un numero è pari o dispari, controllare multipli
		int resto = 15 % 5;
		System.out.println(resto);
		
		int somma = 15;
		int y = 5;
		
		//+= -> somma + assegnazione
		//somma = somma + y;
		somma += y; //equivale a scrivere somma = somma + y;
		System.out.println(somma);
		
		int sottrazione = 0;
		sottrazione -= y; //equivale a scrivere sottrazione = sottrazione - y;
		System.out.println(sottrazione);
		
		//+ -> non solo somma ma anche concatenazione
		System.out.println("-------------" + "-------------" );
		
		/*
		 * ++z o z++ -> Pre e Post incremento ___ --z o z-- -> Pre e Post decremento
		 * la variabile sarà incrementata o decrementata di 1
		 * 
		 * Pre -> stampa il valore che la variabile assume dopo l'incremento
		 * Post -> stampa il valore che la variabile assumeva prima dell'incremento
		 */
		int z = 3;
		System.out.println(z);		//valore 3
		System.out.println(++z);	//+1 e stampa il valore 4
		System.out.println(z);		//valore 4
		System.out.println(z++);	//+1 MA stampa 4 e poi il valore passa a 5 
		System.out.println(z);		//valore 5
		System.out.println(z--);	//-1 MA stampa 5 e poi passa il valore a 4
		System.out.println(z);		//valore 4
		System.out.println(--z);	//-1 e stampa il valore 3
		System.out.println(z);		//valore 3
	}

}
