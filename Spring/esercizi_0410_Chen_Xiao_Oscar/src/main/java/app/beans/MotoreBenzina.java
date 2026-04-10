package app.beans;

public class MotoreBenzina extends Motore {

	private String tipo;
	
	public MotoreBenzina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotoreBenzina(String tipo) {
		super();
		this.tipo = tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
        return "Motore Benzina";
    }

	@Override
	public String toString() {
		return "MotoreBenzina [tipo=" + tipo + "]";
	}
}
