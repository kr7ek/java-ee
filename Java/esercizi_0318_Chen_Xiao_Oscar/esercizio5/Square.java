package esercizio5;

public class Square implements TwoDShape, Shape {

	int lato;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(int lato) {
		super();
		this.lato = lato;
	}

	public int getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub

		return lato * lato;
	}

	@Override
	public int perimetro() {

		// TODO Auto-generated method stub
		return 4 * lato;

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Sto disegnando un quadrato di lati " + this.getLato() + ".");

	}

}
