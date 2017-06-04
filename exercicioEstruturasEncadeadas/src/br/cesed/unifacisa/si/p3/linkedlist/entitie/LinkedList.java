package br.cesed.unifacisa.si.p3.linkedlist.entitie;

import br.cesed.unifacisa.si.p3.entidades.Conta;

public class LinkedList {

	/*
	 * 
	 * 
	 * 
	 * 
	 * Adiciona e remove pelo objeto;
	 * 
	 * Retorna o tamanho da lista;
	 * 
	 * Retorna se a lista está vazia;
	 * 
	 * Obter a posição de um elemento;
	 * 
	 * Obter um elemento por sua posição;
	 * 
	 */

	private int inseridos;

	private Conta inicio;

	public void addIndex(Conta c, int index) {
		if (inicio == null) {
			c = inicio;
		} else if (index < inseridos && c != null) {
			Conta ct = inicio;
			for (int i = 1; i < index - 1; i++) {
				ct = ct.getNextConta();
			}
			c.setNextConta(ct.getNextConta());
			ct.setNextConta(c);

		}
		inseridos++;
	}

	public void removeByIndex(int index) {

		if (index < inseridos) {
			Conta temp = inicio;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getNextConta();
			}

			temp.setNextConta(temp.getNextConta().getNextConta());
		}
		inseridos--;

	}

	public int size() {
		return inseridos;
	}

	public boolean isEmpty() {
		return inseridos == 0;
	}

	public void add(Conta c) {

		if (inicio == null) {
			inicio = c;
		} else {

			c.setNextConta(inicio);
			inicio = c;

		}
		
		inseridos ++;

	}

}
