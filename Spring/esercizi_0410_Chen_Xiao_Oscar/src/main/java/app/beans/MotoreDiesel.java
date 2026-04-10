package app.beans;

public class MotoreDiesel extends Motore {

	private String tipo;
	
	public MotoreDiesel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotoreDiesel(String tipo) {
		super();
		this.tipo = tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
        return "Motore Diesel";
    }

	@Override
	public String toString() {
		return "MotoreDiesel [tipo=" + tipo + "]";
	}
}
