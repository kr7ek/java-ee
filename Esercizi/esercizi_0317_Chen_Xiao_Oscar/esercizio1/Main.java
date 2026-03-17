package esercizio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Cardinal.N.isOpposite(Cardinal.S));
		System.out.println(Cardinal.NE.isOpposite(Cardinal.SO));

		System.out.println(Cardinal.mix(Cardinal.N, Cardinal.NE));
		System.out.println(Cardinal.mix(Cardinal.N, Cardinal.E));
	}

}
