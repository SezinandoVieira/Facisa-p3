package br.cesed.unifacisa.si.p3.linkeddeque.entidades;

import br.cesed.unifacisa.si.p3.entidades.Conta;

/**
 * This class is my own implementation of data structure that is Deque in a linked way. 
 * 
 * Here i defined two variables. The first one is inicio of type Conta, 
 * it's serves to define which elements is the beginning of the Deque. The second one is
 * to map how many elements are inserted on the Deque
 * 
 * @see Conta
 * @author Sezinando Vieira
 */

public class LinkedDeque {

	private Conta inicio;

	private int inseridos;

	/**
	 * This method is responsible to add a account on the beginning Deque
	 * 
	 * 
	 * @param <b>c<b> is responsible for catch the accounts that will be used on the method
	 */
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

	/**
	 * Check if the deque is empty
	 * 
	 * @return if the Deque is empty or not
	 */
	
	public boolean isEmpty() {
		return inseridos <= 0;
	}

	/**
	 * Return the size of deque
	 * 
	 * @return how many elements was inserted on the Deque
	 */
	
	public int size() {
		return inseridos;
	}
	
	/**
	 * 
	 * This method is removes the last element on the Deque
	 * 
	 */

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

	/**
	 * Adds a element on the first position of the Deque 
	 *
	 * @param <b>c<b> is responsible for catch the accounts that will be used on the method
	 */
	
	public void addFirst(Conta c) {
		if (!isEmpty()) {
			c.setNextConta(inicio);
		}
		inicio = c;
		inseridos ++;

	}
	/**
	 * Remove the first element of the Deque
	 */
	
	public void removeFirst(){
		if (!isEmpty()){
			Conta temp = inicio;
			inicio = null;
			inicio = temp.getNextConta();
			inseridos --;
		}
	}

}
