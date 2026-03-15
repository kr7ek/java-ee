package geometria;

public class Cerchio extends FiguraGeometrica {

	private int raggio;

	public Cerchio(int raggio) {
		// TODO Auto-generated constructor stub
		this.raggio = raggio;
	}

	public int getRaggio() {
		return raggio;
	}

	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return this.raggio * raggio * 3.14;
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * raggio;
	}

}
