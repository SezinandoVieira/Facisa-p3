package br.cesed.unifacisa.si.p3.linkeddeque.entidades;

import br.cesed.unifacisa.si.p3.entidades.Conta;

public class LinkedDeque {

	private Conta inicio;

	private int inseridos;

	public void addLast(Conta c) {

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

	public boolean isEmpty() {
		return inseridos <= 0;
	}

	public int size() {
		return inseridos;
	}

	public void removeLast() {
		if (!isEmpty()) {
			Conta temp = inicio;
			while (temp.getNextConta() != null){
				if(temp.getNextConta().getNextConta() == null){
					break;
				}
				temp = temp.getNextConta();
			}
			temp.setNextConta(null);
			inseridos--;
		}

	}

	public void addFirst(Conta c) {
		if (!isEmpty()) {
			c.setNextConta(inicio);
		}
		inicio = c;
		inseridos ++;

	}
	
	public void removeFirst(){
		if (!isEmpty()){
			Conta temp = inicio;
			inicio = null;
			inicio = temp.getNextConta();
			inseridos --;
		}
	}

}
