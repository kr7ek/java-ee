package geometria;

public class Rettangolo extends FiguraGeometrica {

	private int base;
	private int altezza;

	public Rettangolo(int base, int altezza) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altezza = altezza;

	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return base * altezza;
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (base + altezza);
	}

}
