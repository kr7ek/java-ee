package app.beans;

public class Automobile {
	
	private Motore motore;

	public Automobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Automobile(Motore motore) {
		super();
		this.motore = motore;
	}

	public void setMotore(Motore motore) {
		this.motore = motore;
	}

	public Motore getMotore() {
		return this.motore;
	}

	@Override
	public String toString() {
		return "Automobile [motore=" + motore + "]";
	}
	
    public void stampaDettagli() {
        System.out.println("Auto con: " + motore.getTipo());
    }

}
