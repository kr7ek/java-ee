package esercizio5;

public class Point2D implements Shape {

	private int x;
	private int y;

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("Sto disegnando nel punto " + "(" + this.getX() + ", " + this.getY() + ").");
	}

}
