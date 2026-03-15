package ereditarieta;

//Il Cliente è una Persona
public class Cliente extends Persona {
	
	public String indirizzo;
	public String telefono;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cognome, String indirizzo, String telefono) {
		super(nome, cognome);
		this.indirizzo = indirizzo;
		this.telefono = telefono;
	}
	
	//sovrascriviamo il metodo
	@Override
	public String toString() {
		return this.nome + " " + this.cognome + " " + this.indirizzo + " " + this.telefono;
	}

}
