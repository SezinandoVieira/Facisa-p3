package br.cesed.facisa.p3.homeBankingII.entities;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Address object.
 *
 */

public class Endereco {

	private String rua;
	
	private int numero;
	
	private String telefone;

	/**
	 * Constructor from class Endereco.java
	 */
	public Endereco(String rua, int numero, String telefone) {
		
		this.rua = rua;
		this.numero = numero;
		this.telefone = telefone;
	}

	/**
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
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
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Endereco {Rua = " + rua + ", Numero = " + numero + ", Telefone = " + telefone + "}";
	}
	
	
}
