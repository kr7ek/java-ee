package app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Smartphone {

	private String marca;
	private String modello;
	@Autowired
	private Batteria batteria;
	
	public Smartphone() {
		super();
	}
	
	public Smartphone(String marca, String modello, Batteria batteria) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.batteria = batteria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Batteria getBatteria() {
		return batteria;
	}

	public void setBatteria(Batteria batteria) {
		this.batteria = batteria;
	}

	@Override
	public String toString() {
		return "Smartphone [marca=" + marca + ", modello=" + modello + "]";
	}
}
