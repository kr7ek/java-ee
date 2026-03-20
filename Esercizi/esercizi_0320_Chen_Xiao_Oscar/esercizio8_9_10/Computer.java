package esercizio8_9_10;

public class Computer extends Dispositivo {
	
	private SistemaOperativo sistemaOperativo;
	
	public Computer(String marca, String modello, SistemaOperativo sistemaOperativo) {
		super(marca, modello);
		this.sistemaOperativo = sistemaOperativo;
	}
	
	public SistemaOperativo getSistemaOperativo() {
		return sistemaOperativo;
	}
	
	public void inserisciPeriferica() {
		System.out.println("Periferica inserita nel computer.");
	}
}
