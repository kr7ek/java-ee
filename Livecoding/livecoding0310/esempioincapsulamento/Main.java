package esempioincapsulamento;

public class Main {
	
	public static void main(String[] args) {
		
		Fumetto f1 = new Fumetto();
		f1.setAutore("Oda");
		f1.setTitolo("One Piece");
		f1.setNumeroPagine(150);
		System.out.println(f1.getAutore() + " " + f1.getTitolo() + " " + f1.getNumeroPagine());
		System.out.println("------------");
		Fumetto f2 = new Fumetto("Stan Lee", "Spider Man", 195);
		//f2.setNumeroPagine(1950);
		System.out.println(f2.getAutore() + " " + f2.getTitolo() + " " + f2.getNumeroPagine());
		System.out.println("------------");
		Fumetto f3 = new Fumetto("Batman");
		f3.setNumeroPagine(200);
		System.out.println(f3.getAutore() + " " + f3.getTitolo() + " " + f3.getNumeroPagine());
		
		
	}

}
