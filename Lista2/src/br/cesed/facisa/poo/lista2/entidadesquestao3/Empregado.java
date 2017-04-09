package br.cesed.facisa.poo.lista2.entidadesquestao3;

public class Empregado extends Pessoa {

	private int codigoSetor;

	private double salarioBase;

	private double imposto = 0.9;

	/**
	 * Constructor from class Empregado.java
	 */
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	/**
	 * @return the codigoSetor
	 */
	public int getCodigoSetor() {
		return codigoSetor;
	}

	/**
	 * @param codigoSetor
	 *            the codigoSetor to set
	 */
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	/**
	 * @return the salarioBase
	 */
	public double getSalarioBase() {
		return calcularSalario();
		
	}

	/**
	 * @param salarioBase
	 *            the salarioBase to set
	 */
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	/**
	 * @return the imposto
	 */
	public double getImposto() {
		return imposto;
	}

	/**
	 * @param imposto
	 *            the imposto to set
	 */
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario() {
		double salario = 0.0;
		salario = salarioBase * imposto;
		return salario;

	}

}
