package esercizio3;

/*
 * Si realizzi un’applicazione che astragga il funzionamento di una squadra sportiva. 
 * All’interno della Squadra ci dovrà essere una Lista di tutti i giocatori ed un attributo che rappresenta il capitale sociale della squadra, 
 * nonché un attributo per il nome. Dovranno essere forniti metodi che permettano di:
 * • Acquistare giocatori, aggiungendoli alla lista e sottraendo il prezzo del Giocatore al capitale sociale della squadra
 * • Vendere giocatori, sottraendoli dalla lista ed aggiungendo il prezzo di vendita del giocatore al capitale sociale della squadra
 */

public class TestSquadra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Squadra squadra = new Squadra("FC Esempio", 1000000);
		Giocatore giocatore1 = new Giocatore("Mario Rossi", 200000);
		Giocatore giocatore2 = new Giocatore("Luigi Bianchi", 300000);

		squadra.acquistaGiocatore(giocatore1);
		squadra.acquistaGiocatore(giocatore2);

		squadra.vendiGiocatore(giocatore1);

	}

}
