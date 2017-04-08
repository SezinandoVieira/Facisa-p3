package br.cesed.facisa.poo.lista2.entidadesquestao3;

public abstract class Pessoa {

	/**
	 * 
	 * @author Sezinando Vieira
	 * 
	 * Responsible class for creation of Animal object
	 *
	 */
	
	private String nome;
	
	private String endereco;
	
	private String telefone;

	/**
	 * Constructor from class Pessoa.java
	 */
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
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
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	
	
	
}
