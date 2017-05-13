package br.cesed.unifacisa.si.p3.linkedqueue.entidades;

import br.cesed.unifacisa.si.p3.entidades.Conta;

public class LinkedQueue {

	private Conta inicio;

	private int inseridos;

	public void enqueue(Conta c) {

		if (isEmpty()) {
			inicio = c;
		} else {
			Conta temp = inicio;

			while (temp.getNextConta() != null) {

				temp = temp.getNextConta();
			}

			temp.setNextConta(c);

		}
		inseridos++;

	}

	public int size() {
		return inseridos;
	}

	public boolean isEmpty() {
		return inseridos <= 0;
	}

	public Conta front() {
		return inicio;
	}

	public Conta dequeue() {
		Conta temp = inicio;
		if (!isEmpty()) {

			inicio = null;

			inicio = temp.getNextConta();
			inseridos --;
			
		}

		return temp;
	}
}
