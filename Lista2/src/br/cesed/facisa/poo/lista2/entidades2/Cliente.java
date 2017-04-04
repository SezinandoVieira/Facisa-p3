package br.cesed.facisa.poo.lista2.entidades2;

public class Cliente extends Pessoa {

	private double valorDivida;
	
	private int anoNascimento;

	/**
	 * Constructor from class Cliente.java
	 */
	public Cliente(String nome, int idade, String sexo, int anoNascimento) {
		super(nome, idade, sexo);
		this.anoNascimento = anoNascimento;
	}

	/**
	 * Constructor from class Cliente.java
	 */
	public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascimento) {
		super(nome, idade, sexo);
		this.valorDivida = valorDivida;
		this.anoNascimento = anoNascimento;
	}

	/**
	 * @return the valorDivida
	 */
	public double getValorDivida() {
		return valorDivida;
	}

	/**
	 * @param valorDivida the valorDivida to set
	 */
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	/**
	 * @return the anoNascimento
	 */
	public int getAnoNascimento() {
		return anoNascimento;
	}

	/**
	 * @param anoNascimento the anoNascimento to set
	 */
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " Valor da dívida = " + valorDivida + ", Ano de nascimento = " + anoNascimento + "}";
	}
	
	
	
}
