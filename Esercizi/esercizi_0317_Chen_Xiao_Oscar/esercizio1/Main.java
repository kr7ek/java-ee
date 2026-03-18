package esercizio1;

public class Main {

	public static void main(String[] args) throws CardinalException {
		// TODO Auto-generated method stub

		System.out.println(Cardinal.N.isOpposite(Cardinal.S));
		System.out.println(Cardinal.NE.isOpposite(Cardinal.SO));
		System.out.println(Cardinal.ONO.isOpposite(Cardinal.ESE));
		System.out.println(Cardinal.N.isOpposite(Cardinal.E));

		try {
			System.out.println(Cardinal.mix(Cardinal.N, Cardinal.NE));
			System.out.println(Cardinal.mix(Cardinal.N, Cardinal.E));
			System.out.println(Cardinal.mix(Cardinal.N, Cardinal.S));
		} catch (CardinalException e) {
			System.out.println(e.getMessage());
		}
	}

}
