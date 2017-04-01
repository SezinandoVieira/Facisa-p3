package br.cesed.facisa.p3.homeBankingII.entities;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Client object.
 *
 */

public class Cliente {

	private String nome;
	
	private String identidade;
	
	private String cpf;

	/**
	 * Constructor from class Cliente.java
	 */
	public Cliente(String nome, String identidade, String cpf) {
		
		this.nome = nome;
		this.identidade = identidade;
		this.cpf = cpf;
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
	 * @return the identidade
	 */
	public String getIdentidade() {
		return identidade;
	}

	/**
	 * @param identidade the identidade to set
	 */
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	/**
	 * @return the paisOrigem
	 */
	public String getPaisOrigem() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setPaisOrigem(String cpf) {
		this.cpf = cpf;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente {Nome = " + nome + ", Identidade = " + identidade + ", CPF = " + cpf + "}";
	}
	
	
	
}
