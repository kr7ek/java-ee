package geometria;

public class TestFiguraGeometrica {

	public static void main(String[] args) {

		Cerchio cerchio = new Cerchio(5);
		Rettangolo rettangolo = new Rettangolo(5, 10);
		Triangolo triangolo = new Triangolo(4, 6, 8, 8, 5);

		System.out.println("Costruisco un cerchio di raggio " + cerchio.getRaggio());
		System.out.println("Perimetro: " + cerchio.calcolaPerimetro());
		System.out.println("Area: " + cerchio.calcolaArea());

		System.out.println("Costruisco un rettangolo di base " + rettangolo.getBase() + " e altezza " + rettangolo.getAltezza());
		System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
		System.out.println("Area: " + rettangolo.calcolaArea());

		System.out.println("Costruisco un triangolo di lati " + triangolo.getLato1() + ", " + triangolo.getLato2() + ", " + triangolo.getLato3() + " con base " + triangolo.getBase() + " e altezza " + triangolo.getAltezza());
		System.out.println("Perimetro: " + triangolo.calcolaPerimetro());
		System.out.println("Area: " + triangolo.calcolaArea());

	}

}
