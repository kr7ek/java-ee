package esercizio8_9_10;

public class Smartphone extends Dispositivo {

	private SistemaOperativo sistemaOperativo;
	
	public Smartphone(String marca, String modello, SistemaOperativo sistemaOperativo) {
		super(marca, modello);
		this.sistemaOperativo = sistemaOperativo;
	}
	
	public SistemaOperativo getSistemaOperativo() {
		return sistemaOperativo;
	}
	
	public void mandaMessaggio() {
		System.out.println("Messaggio inviato dallo smartphone.");
	}
}
