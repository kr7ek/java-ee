package app.beans;

import org.springframework.stereotype.Component;

@Component
public class Batteria {
	
	private int capacita;
	
	public Batteria() {
		super();
	}

	public Batteria(int capacita) {
		super();
		this.capacita = capacita;
	}

	public int getCapacita() {
		return capacita;
	}

	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}

	@Override
	public String toString() {
		return "Batteria [capacita=" + capacita + "]";
	}
}
