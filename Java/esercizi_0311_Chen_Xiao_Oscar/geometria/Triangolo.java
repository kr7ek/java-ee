package geometria;

public class Triangolo extends FiguraGeometrica {

	private int lato1;
	private int lato2;
	private int lato3;
	private int base;
	private int altezza;

	public Triangolo(int lato1, int lato2, int lato3, int base, int altezza) {
		// TODO Auto-generated constructor stub
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.base = base;
		this.altezza = altezza;
	}

	public int getLato1() {
		return lato1;
	}

	public void setLato1(int lato1) {
		this.lato1 = lato1;
	}

	public int getLato2() {
		return lato2;
	}

	public void setLato2(int lato2) {
		this.lato2 = lato2;
	}

	public int getLato3() {
		return lato3;
	}

	public void setLato3(int lato3) {
		this.lato3 = lato3;
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
		return (base * altezza) / 2;
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return lato1 + lato2 + lato3;
	}

}
