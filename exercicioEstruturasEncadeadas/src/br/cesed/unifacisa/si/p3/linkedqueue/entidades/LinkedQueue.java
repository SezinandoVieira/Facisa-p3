package br.cesed.unifacisa.si.p3.linkedqueue.entidades;

import br.cesed.unifacisa.si.p3.entidades.Conta;

/**
 * 
 * @author Sezinando Vieira
 *
 * Here i defined two variables. The first one is inicio of type Conta, 
 * it's serves to define which elements is the beginning of the Queue. The second one is
 * to map how many elements are inserted on the Queue
 *
 * @see Conta
 */

public class LinkedQueue {

	private Conta inicio;

	private int inseridos;

	/**
	 * In this method, i insert an element in the front of the Queue
	 * 
	 * @param <b>c<b> Is the responsible parameter to assume an object of type Conta
	 */
	
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
	/**
	 * 
	 * @return the size of the Queue. That is, how many elements was inserted in the Queue
	 */

	public int size() {
		return inseridos;
	}
	/**
	 * 
	 * @return if there is no element inserted
	 */

	public boolean isEmpty() {
		return inseridos == 0;
	}
	/**
	 * 
	 * @return the first element of the Queue
	 */

	public Conta front() {
		return inicio;
	}
	
	/**
	 * Here is this method, I remove the element in the first element of the Queue
	 * 
	 * @return the Front of the Queue, after a I removed the last one.
	 */

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
