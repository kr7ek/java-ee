package livecoding0312;

public abstract class Telefono {
	
	private String numero;
	
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public abstract void chiama(String numero);
	
	public void rispondi() {
		System.out.println("Sta per rispondere...");
	}

}
