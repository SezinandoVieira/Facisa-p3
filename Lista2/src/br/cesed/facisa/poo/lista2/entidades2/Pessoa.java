package br.cesed.facisa.poo.lista2.entidades2;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Person object.
 *
 */

public abstract class Pessoa {

	private String nome;
	
	private int idade;
	
	private String sexo;

	/**
	 * Constructor from class Pessoa.java
	 */
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
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
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pessoa {Nome = " + nome + ", Idade = " + idade + ", Sexo = " + sexo;
	}
	
	
	
	
	
}
