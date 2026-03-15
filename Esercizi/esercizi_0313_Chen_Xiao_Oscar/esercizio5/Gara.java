package esercizio5;
import java.util.Random;

public class Gara {

	private int circuito;
	private Pilota vincitore;
	private Pilota[] grigliaPartenza;

	// // costruttore default
	public Gara() {
		this.circuito = 0;
		this.vincitore = null;
	}

	// costruttore parametrizzato
	public Gara(int circuito, int numeroPartecipanti) {
		this.circuito = circuito;
		this.vincitore = null;
		creaGrigliaDiPartenza(numeroPartecipanti);
	}

	// getters e setters
	public int getCircuito() {
		return circuito;
	}

	public void setCircuito(int circuito) {
		this.circuito = circuito;
	}

	public Pilota getVincitore() {
		return vincitore;
	}

	public void setVincitore(Pilota vincitore) {
		this.vincitore = vincitore;
	}

	public Pilota[] getGrigliaPartenza() {
		return grigliaPartenza;
	}

	public void setGrigliaPartenza(Pilota[] grigliaPartenza) {
		this.grigliaPartenza = grigliaPartenza;
	}
	
	// istanzia n piloti in un array
	public void creaGrigliaDiPartenza(int n) {
		
		grigliaPartenza = new Pilota[n];
		
		for(int i=0; i<n; i++) {
			grigliaPartenza[i] = new Pilota("Pilota" + i , new Auto("Auto" + i));
		}
	}
	
	public Pilota corriGara() {
		
		Random rand = new Random();
        vincitore = grigliaPartenza[rand.nextInt(grigliaPartenza.length)];
		
		return vincitore;
	}
	
}
