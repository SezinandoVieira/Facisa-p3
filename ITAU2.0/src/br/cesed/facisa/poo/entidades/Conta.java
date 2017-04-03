package br.cesed.facisa.poo.entidades;

public abstract class Conta {

	private String titular;

	private int agencia;

	private double saldo;

	private int conta;

	/**
	 * Constructor from class Conta.java
	 */
	public Conta(String titular, int agencia, int conta) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
	}

	/**
	 * Constructor from class Conta.java
	 */
	public Conta(String titular, int agencia, double saldo, int conta) {
		this(titular, agencia, conta);
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
	public void setTitular(String titular) {
		this.titular = titular;
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

	public void sacar(double montante) {
		if (montante <= saldo) {
			saldo -= montante;
		} else {
			System.out.println("O valor que você está querendo sacar é muito alto, "
					+ "tem certeza que quer utilizar o crédito especial ?");
		}

	}

	public void depositar(double montante) {
		if (montante > 0) {
			saldo += montante;
		} else {
			System.out.println("O valor que você está querendo depositar é invalido. "
					+ "Por favor deposite um valor válido");
		}

	}
	
	public double retornaSaldo(){
		System.out.println("Seu saldo é:");
		return saldo;
	}

}
