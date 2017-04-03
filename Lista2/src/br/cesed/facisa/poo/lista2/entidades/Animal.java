package br.cesed.facisa.poo.lista2.entidades;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Animal object
 *
 */

public abstract class Animal {

	private String nome;
	
	private double peso;

	/**
	 * Constructor from class Animal.java
	 */
	public Animal(double peso) {
		super();
		this.peso = peso;
	}

	/**
	 * Constructor from class Animal.java
	 */
	public Animal(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal {" + (nome != null ? "Nome do animal = " + nome + ", " : "") + "Peso = ," + peso;
	}
	
	
	
}
