package br.cesed.facisa.poo.entidades;

public class ContaCorrente extends Conta {

	/**
	 * Constructor from class ContaCorrente.java
	 */
	public ContaCorrente(String titular, int agencia, int conta) {
		super(titular, agencia, conta);
	}

	/**
	 * Constructor from class ContaCorrente.java
	 */
	public ContaCorrente(String titular, int agencia, double saldo, int conta) {
		super(titular, agencia, saldo, conta);
	}
	
	
}
