package br.cesed.facisa.p3.poo.homeBanking.entities;

public class ContaPoupanca extends Conta {

	private double juros;
	
	/**
	 * Constructor from class Conta
	 */
	public ContaPoupanca(String titular, int agencia, int conta, double juros) {
		super(titular, agencia, conta);
		this.juros = juros;
	}

	/**
	 * Constructor from class Conta
	 */
	public ContaPoupanca(String titular, int agencia, int conta, double saldo, double juros) {
		super(titular, agencia, conta, saldo);
		this.juros = juros;
	}

	/**
	 * @return the juros
	 */
	public double getJuros() {
		return juros;
	}

	/**
	 * @param juros the juros to set
	 */
	public void setJuros(double juros) {
		this.juros = juros;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", Juros=" + juros + "]";
	}

	
	
	
}
