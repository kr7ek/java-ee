package esercizio8_9_10;

public abstract class Dispositivo {

	private String marca;
	private String modello;

	public Dispositivo(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModello() {
		return modello;
	}

	public SistemaOperativo getSistemaOperativo() {
		return null;
	}
}
