package esercito;

public class TestSoldato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fante fante = new Fante("Mario", "rosso");
		Cavaliere cavaliere = new Cavaliere("Tizio", "bianco");

		System.out.println(fante.toString());
		fante.gridoDiBattaglia();
		fante.avanza();
		fante.combatti();
		fante.riposa();

		System.out.println();

		System.out.println(cavaliere.toString());
		cavaliere.gridoDiBattaglia();
		cavaliere.avanza();
		cavaliere.combatti();
		cavaliere.riposa();

	}

}
