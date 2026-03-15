package esempiopolimorfismo;

public class Venditore extends Dipendente {
	
	public int provviggioni;
	public String[] portafoglioClienti;
	
	public String lavora() {
		return "Il venditore ha iniziato il turno";
	}
	
	@Override
	public String toString() {
		return super.toString() + " è un venditore";
	}
 
}
