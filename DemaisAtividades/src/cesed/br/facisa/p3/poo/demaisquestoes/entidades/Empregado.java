package cesed.br.facisa.p3.poo.demaisquestoes.entidades;

/**
 * 
 * @author Sezinando Vieira
 * 
 *         Responsible class for creation of Vehicle object.
 *
 */

public class Empregado {

	private String nome;

	private int matricula;

	private int idade;

	private double salario;

	/**
	 * Constructor from class Empregado.java
	 */
	public Empregado(String nome, int matricula, int idade, double salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.salario = salario;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula
	 *            the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
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
		if (salario > 0){
			this.salario = salario;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Empregado {" + (nome != null ? "Nome = " + nome + ", " : "") + " Matricula = " + matricula
				+ ", Idade = " + idade + ", Salario = " + salario + "}";
	}

}
