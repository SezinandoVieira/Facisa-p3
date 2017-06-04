package br.cesed.unifacisa.si.p3.entidades;

public class Conta {

	private String nome;

	protected Conta nextConta;

	public Conta(String nome, int conta) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getNextConta() {
		return nextConta;
	}

	public void setNextConta(Conta nextConta) {
		this.nextConta = nextConta;
	}

}
