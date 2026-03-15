package livecoding0312;

public class Smartphone extends Telefono {

	@Override
	public void chiama(String numero) {
		System.out.println("Chiama con lo smartphone il numero " + numero);
	}
	
	@Override
	public void rispondi() {
		System.out.println("Risponde con lo smartphone");
	}
	

}
