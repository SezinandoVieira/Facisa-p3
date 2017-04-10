package br.cesed.facisa.poo.lista2.entidadesquestao3;

import br.cesed.facisa.poo.lista2.interfaces.Comissionavel;

public class Operario extends Empregado implements Comissionavel{

	private double valorProducao;
	
	private double comissao;

	/**
	 * Constructor from class Operario.java
	 */
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	/**
	 * @return the valorProducao
	 */
	public double getValorProducao() {
		return valorProducao;
	}

	/**
	 * @param valorProducao the valorProducao to set
	 */
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	/**
	 * @return the comissao
	 */
	public double getComissao() {
		return comissao;
	}

	/**
	 * @param comissao the comissao to set
	 */
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	/* (non-Javadoc)
	 * @see br.cesed.facisa.poo.lista2.entidadesquestao3.Empregado#calcularSalario()
	 */
	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return super.calcularSalario();
	}

	

}