package geometria;

/*
 * Creare una classe astratta che rappresenterà una figura geometrica generica, 
 * nel package "geometria", con due metodi astratti: calcolaArea(); e calcolaPerimetro();
 * Sentitevi liberi di aggiungere delle costanti.
 * 
 * Creare almeno tre classi, sempre nel package "geometria", che rappresentano delle figure 
 * geometriche piane, come ad esempio il triangolo ed il cerchio, che estenderanno la classe di 
 * base. Dotare le tre classi delle variabili appropriate, dei costruttori e fare l'override dei due 
 * metodi in modo tale da riuscire a calcolare perimetro ed area.
 * 
 * Creare una classe "TestFigureGeometriche" sempre nel package "geometria", con un metodo
 * main in cui verranno istanziate le tre classi ed in cui verranno stampati 
 * perimetro ed area delle figure.
 */

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
