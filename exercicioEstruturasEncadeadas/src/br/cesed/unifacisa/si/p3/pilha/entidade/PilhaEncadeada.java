package br.cesed.unifacisa.si.p3.pilha.entidade;

import br.cesed.unifacisa.si.p3.entidades.Conta;

public class PilhaEncadeada {

	private Conta inicio;

	private int inseridos;

	public Conta top() {
		return inicio;
	}

	public void pop() {
		Conta aux = inicio.getNextConta();
		inicio.setNextConta(null);
		inicio = aux;
		this.inseridos --;

	}

	public void push(Conta c) {
		if (inicio == null) {
			this.inicio = c;
		} else {
			c.setNextConta(inicio);
			inicio = c;

		}
		this.inseridos++;

	}
	
	public int size(){
		return inseridos;
	}
}
