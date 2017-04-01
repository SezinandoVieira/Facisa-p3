package br.cesed.facisa.p3.homeBankingII.entities;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Agency object.
 *
 */

public class Agencia {

	private int numero;
	
	private String nome;

	/**
	 * Constructor from class Agencia.java
	 */
	
	public Agencia(int numero, String nome) {
		
		this.numero = numero;
		this.nome = nome;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agencia {Numero = " + numero + " Nome = " + nome + "}";
	}
	
	
	
	
}
