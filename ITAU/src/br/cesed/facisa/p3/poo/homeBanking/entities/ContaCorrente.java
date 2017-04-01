package br.cesed.facisa.p3.poo.homeBanking.entities;

public class ContaCorrente extends Conta {

	private double investimento;

	/**
	 * Constructor from class Conta
	 */
	public ContaCorrente(String titular, int agencia, int conta, double investimento) {
		super(titular, agencia, conta);
		this.investimento = investimento;
	}

	/**
	 * Constructor from class Conta
	 */
	public ContaCorrente(String titular, int agencia, int conta, double saldo, double investimento) {
		super(titular, agencia, conta, saldo);
		this.investimento = investimento;
	}

	/**
	 * @return the investimento
	 */
	public double getInvestimento() {
		return investimento;
	}

	/**
	 * @param investimento the investimento to set
	 */
	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() +  ", Investimento=" + investimento + "]";
	}
	
	
	
}
