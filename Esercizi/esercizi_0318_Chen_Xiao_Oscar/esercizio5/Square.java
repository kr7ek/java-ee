package esercizio5;

public class Square implements TwoDShape {

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
		
	return lato*lato;
	}

	@Override
	public <T> int perimetro() {
		// TODO Auto-generated method stub
		
	}
	

}
