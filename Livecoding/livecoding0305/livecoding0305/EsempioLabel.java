package livecoding0305;

public class EsempioLabel {

	public static void main(String[] args) {

		
		 //Label è una etichetta
		 //nomeLabel:
		 //In java vengono utilizzate per contrassegnare punti specifici nel codice
		 //Permetteno la gestione di cicli annidati
		 

		int counter = 0; // contare le iterazioni
		
		//start: -> assegnare un nome a questo blocco di codice
		start: {
			for (int i = 0; i <= 10; i++) {
				for (int j = 0; j <= 10; j++) {
					if (i == 8) {
						break start; //break nomeLabel; -> esce dal ciclo etichettato
					}
					System.out.println("Valore i: " + i + " valore j: " + j);
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

}
