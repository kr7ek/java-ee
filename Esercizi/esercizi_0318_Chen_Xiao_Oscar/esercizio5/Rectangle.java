package esercizio5;

public class Rectangle implements TwoDShape, Shape {

	int latoA;
	int latoB;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int latoA, int latoB) {
		super();
		this.latoA = latoA;
		this.latoB = latoB;
	}

	public int getLatoA() {
		return latoA;
	}

	public void setLatoA(int latoA) {
		this.latoA = latoA;
	}

	public int getLatoB() {
		return latoB;
	}

	public void setLatoB(int latoB) {
		this.latoB = latoB;
	}

	@Override
	public int perimetro() {
		// TODO Auto-generated method stub

		return 2 * (latoA + latoB);
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub

		return latoA * latoB;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Sto disegnando un rettangolo di lati " + this.getLatoA() + " e " + this.getLatoB());

	}

}
