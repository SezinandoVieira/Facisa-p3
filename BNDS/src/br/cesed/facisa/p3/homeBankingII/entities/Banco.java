package br.cesed.facisa.p3.homeBankingII.entities;
/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Bank object.
 *
 */
public class Banco {

	private int codigo;
	
	private String nome;
	
	private String paisOrigem;

	/**
	 * Constructor from class Banco.java
	 */
	public Banco(int codigo, String nome, String paisOrigem) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.paisOrigem = paisOrigem;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the paisOrigem
	 */
	public String getPaisOrigem() {
		return paisOrigem;
	}

	/**
	 * @param paisOrigem the paisOrigem to set
	 */
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Banco [Codigo = " + codigo +  ", Nome = " + nome + " e País de origem = " + paisOrigem + "]";
	}
	
	
	
}
