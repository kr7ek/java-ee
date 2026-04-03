package esercizi_0402_Chen_Xiao_Oscar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Automobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String marca;
	@Column
	private String modello;
	@Column
	private String targa;
	@Column(name = "numero_telaio")
	private String numeroTelaio;
	@Column(name = "tipo_trazione")
	private String tipoTrazione;
	
	@ManyToOne
	@JoinColumn(name = "id_persona")
	private Persona persona;
	
	public Automobile() {
		// TODO Auto-generated constructor stub
	}

	public Automobile(Integer id, String marca, String modello, String targa, String numeroTelaio,
			String tipoTrazione) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.numeroTelaio = numeroTelaio;
		this.tipoTrazione = tipoTrazione;
	}

	public Automobile(String marca, String modello, String targa, String numeroTelaio, String tipoTrazione) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.numeroTelaio = numeroTelaio;
		this.tipoTrazione = tipoTrazione;
	}

	public Automobile(String marca, String modello, String targa, String numeroTelaio, String tipoTrazione,
			Persona persona) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.numeroTelaio = numeroTelaio;
		this.tipoTrazione = tipoTrazione;
		this.persona = persona;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getNumeroTelaio() {
		return numeroTelaio;
	}

	public void setNumeroTelaio(String numeroTelaio) {
		this.numeroTelaio = numeroTelaio;
	}

	public String getTipoTrazione() {
		return tipoTrazione;
	}

	public void setTipoTrazione(String tipoTrazione) {
		this.tipoTrazione = tipoTrazione;
	}

	@Override
	public String toString() {
		return "Automobile [id=" + id + ", marca=" + marca + ", modello=" + modello + ", targa=" + targa
				+ ", numeroTelaio=" + numeroTelaio + ", tipoTrazione=" + tipoTrazione + "]";
	}
}
