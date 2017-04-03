package br.cesed.facisa.poo.entidades;

public class ContaPoupanca extends Conta {

	private double juros;

	/**
	 * Constructor from class ContaPoupanca.java
	 */
	public ContaPoupanca(String titular, int agencia, int conta, double juros) {
		super(titular, agencia, conta);
		this.juros = juros;
	}

	/**
	 * Constructor from class ContaPoupanca.java
	 */
	public ContaPoupanca(String titular, int agencia, double saldo, int conta, double juros) {
		super(titular, agencia, saldo, conta);
		this.juros = juros;
	}

	/**
	 * @return the juros
	 */
	public double getJuros() {
		return juros;
	}

	/* (non-Javadoc)
	 * @see br.cesed.facisa.poo.entidades.Conta#sacar(double)
	 */
	@Override
	public void sacar(double montante) {
		
		double juros = (montante/100) * this.juros;
		double valorRetirado = montante + juros;
		
		super.sacar(valorRetirado);
		
		
		
	}

	
	
	
}
