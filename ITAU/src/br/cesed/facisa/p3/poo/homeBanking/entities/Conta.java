package br.cesed.facisa.p3.poo.homeBanking.entities;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Account object.
 *
 */

public abstract class Conta {

	private String titular;

	private int agencia;

	private int conta;

	private double saldo;

	/**
	 * @param titular
	 * @param agencia
	 * @param conta
	 */
	public Conta(String titular, int agencia, int conta) {

		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
	}

	/**
	 * @param titular
	 * @param agencia
	 * @param conta
	 * @param saldo
	 */
	public Conta(String titular, int agencia, int conta, double saldo) {

		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular
	 *            the titular to set
	 */
	public void setTitular(String titular2) {
		titular = titular2;
	}

	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia
	 *            the agencia to set
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the conta
	 */
	public int getConta() {
		return conta;
	}

	/**
	 * @param conta
	 *            the conta to set
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}

	public void sacar(double valorSacado) {

		if (saldo >= valorSacado) {
			saldo -= valorSacado;
		}
	}

	public void depositar(double valorDepositado) {

		if (valorDepositado > 0) {
			valorDepositado += saldo;

		}

	}

	public double obtemSaldo() {

		return this.saldo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conta [" + (titular != null ? "Titular = " + titular + ", " : "") + "Agencia = " + agencia + ", Conta = "
				+ conta + ", Saldo = " + saldo ;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + conta;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (conta != other.conta)
			return false;
		return true;
	}

	

}
