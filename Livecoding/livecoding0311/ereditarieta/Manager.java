package ereditarieta;

//Il Manager è una Persona
public class Manager extends Persona {
	
	@Override
	public String saluta() {
		return this.cognome + " è il manager e sta salutando";
	}

}
