package br.cesed.facisa.poo.lista2.entidades;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Animal object
 *
 */

public class Peixe extends Animal {

	private String tipoHabitat;

	/**
	 * Constructor from class Peixe.java
	 */
	public Peixe(double peso, String tipoHabitat) {
		super(peso);
		this.tipoHabitat = tipoHabitat;
	}

	/**
	 * Constructor from class Peixe.java
	 */
	public Peixe(String nome, double peso, String tipoHabitat) {
		super(nome, peso);
		this.tipoHabitat = tipoHabitat;
	}

	/**
	 * @return the tipoHabitat
	 */
	public String getTipoHabitat() {
		return tipoHabitat;
	}

	/**
	 * @param tipoHabitat the tipoHabitat to set
	 */
	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + (tipoHabitat != null ? " Tipo de Habitat = " 
	+ tipoHabitat : "") + "}";
	}
	
	
	
	
	
}
