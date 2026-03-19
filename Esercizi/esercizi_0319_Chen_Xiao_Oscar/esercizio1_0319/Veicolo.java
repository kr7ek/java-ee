package esercizio1_0319;

public abstract class Veicolo {

	private String modello;
	private String targa;
	private int annoImmatricolazione;
	private double costoNoleggioGiornaliero;

	public Veicolo(String modello, String targa, int annoImmatricolazione, double costoNoleggioGiornaliero) {
		this.modello = modello;
		this.targa = targa;
		this.annoImmatricolazione = annoImmatricolazione;
		this.costoNoleggioGiornaliero = costoNoleggioGiornaliero;
	}

	public String getModello() {
		return modello;
	}

	public String getTarga() {
		return targa;
	}

	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	public double getCostoNoleggioGiornaliero() {
		return costoNoleggioGiornaliero;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}

	public void setCostoNoleggioGiornaliero(double costoNoleggioGiornaliero) {
		this.costoNoleggioGiornaliero = costoNoleggioGiornaliero;
	}
	
}
