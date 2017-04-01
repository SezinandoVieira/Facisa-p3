package br.cesed.facisa.p3.homeBankingII.entities;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Checking Account object.
 *
 */

public class Conta {

	private int numero;
	
	private String tipo;
	
	private double saldo;

	/**
	 * Constructor from class Conta.java
	 */
	public Conta(int numero, String tipo, double saldo) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conta {Numero = " + numero + ", Tipo = " + tipo + ", Saldo = " + saldo + "}";
	}
	
	
	
}
