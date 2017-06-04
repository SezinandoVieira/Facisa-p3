package br.cesed.unifacisa.si.p3.pilha.entidade;

import br.cesed.unifacisa.si.p3.entidades.Conta;

/**
 * This class is my own implementation of data structure that is Stack in a linked way. 
 * 
 * Here i defined two variables. The first one is inicio of type Conta, 
 * it's serves to define which elements is the beginning of the Stack. The second one is
 * to map how many elements are inserted on the Stack
 * 
 * @see Conta
 * @author Sezinando Vieira
 */

public class PilhaEncadeada {

	private Conta inicio;

	private int inseridos;

	/**
	 * 
	 * @return the element in the top of the Stack
	 * 
	 */
	
	public Conta top() {
		return inicio;
	}
	
	/**
	 * This method removes the top element of the Stack
	 */

	public void pop() {
		Conta aux = inicio.getNextConta();
		inicio.setNextConta(null);
		inicio = aux;
		this.inseridos --;

	}
	/**
	 * With this method, I can insert a new element in the top of the stack
	 * 
	 * @param <b>c<b> This parameter will assume an object of type Conta 
	 */

	public void push(Conta c) {
		if (inicio == null) {
			this.inicio = c;
		} else {
			c.setNextConta(inicio);
			inicio = c;

		}
		this.inseridos++;

	}
	/**
	 * 
	 * @return the size of the stack
	 * 
	 */
	public int size(){
		return inseridos;
	}
}
