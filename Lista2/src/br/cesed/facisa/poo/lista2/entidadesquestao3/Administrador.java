package br.cesed.facisa.poo.lista2.entidadesquestao3;

public class Administrador extends Empregado {

	private double ajudaDeCusto;

	/**
	 * Constructor from class Administrador.java
	 */
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	/**
	 * @return the ajudaDeCusto
	 */
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	/**
	 * @param ajudaDeCusto the ajudaDeCusto to set
	 */
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	/* (non-Javadoc)
	 * @see br.cesed.facisa.poo.lista2.entidadesquestao3.Empregado#calcularSalario()
	 */
	@Override
	public double calcularSalario() {
		
		return super.calcularSalario() + ajudaDeCusto;
	}
	
	
	
}

