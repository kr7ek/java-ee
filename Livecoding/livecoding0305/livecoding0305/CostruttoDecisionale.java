package livecoding0305;

public class CostruttoDecisionale {

	public static void main(String[] args) {

		// Costrutto Decisionale IF

		int numeroLati = 5;

		// IF SEMPLICE
		//Struttura di controllo che permette di eseguire del codice solo se una condizione è vera
		// (numeroLati == 3) -> TRUE se la variabile numeroLati = 3 altrimenti FALSE
		// = -> assegnare un valore
		// == -> confrontare due valori per verificare se sono uguali
		if (numeroLati == 3) {
			System.out.println("La figura è un triangolo");
		}

		if (numeroLati != 3) { // diverso -> !=
			System.out.println("La figura NON è un triangolo");
		}

		System.out.println("-------------");

		// IF - ELSE scelta tra due istruzioni
		// else -> viene eseguito qunado la condizione è falsa
		if (numeroLati == 3) {
			System.out.println("La figura è un triangolo");
		} else { // Altrimenti
			System.out.println("La figura NON è un triangolo");
		}
		System.out.println("-------------");
		// IF con 2 condizioni
		// && corrisponde a AND, entrambe le condizioni devono essere vere per
		// restituire TRUE
		if (numeroLati > 2 && numeroLati == 5) {
			System.out.println("La figura è un pentagono");
		}
		System.out.println("-------------");

		// || corrisponde a OR, almeno una delle due condizioni deve essere vera per
		// reatituire TRUE
		if (numeroLati == 3 || numeroLati == 5) {
			System.out.println("La figura è un triangolo oppure un pentagono");
		}

		System.out.println("-------------");

		// IF nidificato
		int posizione = 5;

		if (posizione == 1) {
			System.out.println("Sei arrivato primo");
		} else if (posizione == 2) {
			System.out.println("Sei arrivato secondo");
		} else if (posizione == 3) {
			System.out.println("Sei arrivato terzo");
		} else {
			System.out.println("Non sei sul podio, sei arrivato in posizione " + posizione);
		}
		
		System.out.println("-------------");
		//SWITCH
		//gestisce una serie di casistiche in base al valore di una variabile
		switch(posizione){
		case 1:
			System.out.println("Sei arrivato primo");
			break;
		case 2: 
			System.out.println("Sei arrivato secondo");
			break;
		case 3:
			System.out.println("Sei arrivato Terzo");
			break;
		case 4:
			System.out.println("Sei arrivato quarto");
			break;
		case 5:
			System.out.println("Sei arrivato quinto");
			break;
		default:  //viene eseguito se nessun case corrisponde
			System.out.println("Non sei sul podio, sei arrivato in posizione " + posizione);
		}
		
		System.out.println("-------------");
		
		String giorno = "Giovedì";
		switch(giorno) {
		case "Lunedì":
			System.out.println("Il primo giorno della settimana");
			break;
		case "Martedì":
			System.out.println("Il secondo giorno della settimana");
			break;
		case "Mercoledì":
			System.out.println("Il terzo giorno della settimana");
			break;
		case "Giovedì":
			System.out.println("Manca un giorno a venerdì");
			break; //esce dallo switch, altrimenti entra nei case successivi
		case "Venerdì":
			System.out.println("Finalmente è venerdì");
			break;
		case "Sabato":
		case "Domenica":
			System.out.println("Giorno di riposo");
			break;
		default:
			System.out.println("Informazione non disponibile");
		}
		

		System.out.println("-------------");
		//OPERATORE TERNARIO
		/*
		 * Rquivale a if - else, solo più compatto
		 * variabile = espressione booleana ? Valore1 : Valore 2
		 * se la condizione è vera assegna alla variabile il Valore1
		 * se la condizione è false assegna alla variabile il Valore2
		 */
		
		String messaggio = posizione > 10 ? "Ciao" : "Buongiorno";
		System.out.println(messaggio);
		
		int numeroT = (posizione <= 5) ? 25 : 12;
		System.out.println(numeroT);
		
	}

}
