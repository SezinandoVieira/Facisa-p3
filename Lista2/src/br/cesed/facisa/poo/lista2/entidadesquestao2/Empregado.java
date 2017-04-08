package br.cesed.facisa.poo.lista2.entidadesquestao2;

public class Empregado extends Pessoa {

	private double salario;
	
	private String matricula;

	/**
	 * Constructor from class Empregado.java
	 */
	public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() +  " Salário = " + salario + ", Matricula = " + matricula + "}";
	}
	
	
	
}
