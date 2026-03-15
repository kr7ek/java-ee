package esempiopolimorfismo;

public class Dirigente extends Dipendente {
	
	private String grado;
	
	public Dirigente() {
		
	}
	
	public Dirigente(String nome, String matricola, int stipendio, String grado) {
		super(nome, matricola, stipendio);
		this.grado = grado;
	}
	
	public String getGrado() {
		return grado;
	}
	
	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	@Override
	public String toString() {
		return super.toString() +  " il grado è " + this.grado;
	}

}
