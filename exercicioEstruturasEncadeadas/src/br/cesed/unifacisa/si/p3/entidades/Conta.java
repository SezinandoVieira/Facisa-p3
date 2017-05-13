package br.cesed.unifacisa.si.p3.entidades;

public class Conta {

	private String nome;

	private int nroConta;

	protected Conta nextConta;

	public Conta(String nome, int conta) {
		super();
		this.nome = nome;
		this.nroConta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return nroConta;
	}

	public void setConta(int conta) {
		this.nroConta = conta;
	}

	public Conta getNextConta() {
		return nextConta;
	}

	public void setNextConta(Conta nextConta) {
		this.nextConta = nextConta;
	}

}
