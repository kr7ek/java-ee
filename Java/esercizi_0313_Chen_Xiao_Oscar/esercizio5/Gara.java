package esercizio5;
import java.util.Random;

public class Gara {

	private String circuito;
	private Pilota vincitore;
	private Pilota[] grigliaPartenza;

	// // costruttore default
	public Gara() {
		this.circuito = "";
		this.vincitore = null;
	}

	// costruttore parametrizzato
	public Gara(int numeroPartecipanti) {
		this.vincitore = null;
		creaGrigliaDiPartenza(numeroPartecipanti);
	}

	// getters e setters
	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	
	// istanzia n piloti in un array
	public void creaGrigliaDiPartenza(int n) {
		
		grigliaPartenza = new Pilota[n];
		
		// genera n numeri di piloti
		for(int i=0; i<n; i++) {
			grigliaPartenza[i] = new Pilota("Pilota" + (i+1) , new Auto("Scuderia" + (i+1)));
			System.out.println("Il pilota " +grigliaPartenza[i].getNome() + " con l'auto " + grigliaPartenza[i].getAuto().getScuderia() + " in posizione.");
		}
	}
	
	// ritorna un vincitore casuale tra i piloti
	public Pilota corriGara() {
		
		System.out.println("Piloti partiti! Gara in corso...");
		
		Random rand = new Random();
        vincitore = grigliaPartenza[rand.nextInt(grigliaPartenza.length-1)];
		
		return vincitore;
	}
	
}
