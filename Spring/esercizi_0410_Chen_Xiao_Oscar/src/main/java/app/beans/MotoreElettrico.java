package app.beans;

public class MotoreElettrico extends Motore {

	private String tipo;
	
	public MotoreElettrico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotoreElettrico(String tipo) {
		super();
		this.tipo = tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
        return "Motore Elettrico";
    }

	@Override
	public String toString() {
		return "MotoreElettrico [tipo=" + tipo + "]";
	}
}
