package br.cesed.facisa.poo.lista2.entidades;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Cachorro object
 *
 */

public class Cachorro extends Animal {

	private String raca;

	/**
	 * Constructor from class Cachorro.java
	 */
	public Cachorro(double peso, String raca) {
		super(peso);
		this.raca = raca;
	}

	/**
	 * Constructor from class Cachorro.java
	 */
	public Cachorro(String nome, double peso, String raca) {
		super(nome, peso);
		this.raca = raca;
	}

	/**
	 * @return the raca
	 */
	public String getRaca() {
		return raca;
	}

	/**
	 * @param raca the raca to set
	 */
	public void setRaca(String raca) {
		this.raca = raca;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + (raca != null ? " Raça = " + raca : "") + "}";
	}
	
	
	
}
