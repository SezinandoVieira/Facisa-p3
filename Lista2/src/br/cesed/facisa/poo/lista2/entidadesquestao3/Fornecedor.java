package br.cesed.facisa.poo.lista2.entidadesquestao3;

public class Fornecedor extends Pessoa {

	/**
	 * 
	 * @author Sezinando Vieira
	 * 
	 * Responsible class for creation of Animal object
	 *
	 */
	
	private double valorCredito;
	
	private double valorDivida;

	/**
	 * Constructor from class Fornecedor.java
	 */
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
	}

	/**
	 * Constructor from class Fornecedor.java
	 */
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	/**
	 * @return the valorCredito
	 */
	public double getValorCredito() {
		return valorCredito;
	}

	/**
	 * @param valorCredito the valorCredito to set
	 */
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
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
	
	public double obterSaldo (double valorDivida, double valorCredito){
		double saldo = 0.0;
		
		saldo = valorCredito - valorDivida;
		
		return saldo;
		
		}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String retorno = "";
		if (valorDivida > 0 ) {
			retorno = ", Valor do credito = " + valorCredito + ", Valor da Divida = " + valorDivida + "}";
		}else{
			retorno = ", Valor do credito = " + valorCredito + "}";
		}
		return super.toString() + retorno;
	}
	
	
	
}
