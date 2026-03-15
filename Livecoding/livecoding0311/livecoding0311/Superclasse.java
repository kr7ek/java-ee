package livecoding0311;

/* 
 * Superclasse, classe genitore (padre/madre), classe base
 * Animale, Veicolo o StrumentoMusicale
 */
public class Superclasse /*extends Object*/ {
	
	//Estende in modo implicito la superclasse Object, ereditando i membri
	//Object è la superclasse di tutte le classi, qulasiasi classe la estende automaticamente
	
	//attributi
	private int attributoNumerico;
	private String attributoStringa;
	
	//costruttori
	public Superclasse() {
		
	}
	
	public Superclasse(int attributoNumerico, String attributoStringa) {
		this.attributoNumerico = attributoNumerico;
		this.attributoStringa = attributoStringa; 
	}
	
	public Superclasse(String attributoStringa) {
		this.attributoStringa = attributoStringa;
	}
	
	//getter e setter
	public int getAttributoNumerico() {
		return attributoNumerico;
	}
	
	public void setAttributoNumerico(int attributoNumerico) {
		this.attributoNumerico = attributoNumerico;
	}
	
	public String getAttributoStringa() {
		return attributoStringa;
	}

	public void setAttributoStringa(String attributoStringa) {
		this.attributoStringa = attributoStringa;
	}
	
	
	//metodo
	public String metodoSuperclasse() {
		return "Questo metodo viene dalla classe Superclasse";
	}
	
	public String metodoOverride() {
		return "Metodo Superclasse";
	}
	
	@Override
	public String toString() {
		return "Superclasse " + attributoStringa;
	}
	
	//final -> metodo che non può essere sovrascritto nelle sottoclassi
	public final void metodoFinal() {
		System.out.println("Non può essere sovrascritto");
	}
	
	
}
