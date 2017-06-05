package br.cesed.unifacisa.si.p3.deque.entidades;

/**
 * This is my own implementation of the data structure Deque in a sequential
 * way. I defined one variable to track how many elements are being insert in
 * the array, that is elementosInseridos, and a internal array to store the
 * elements that I want to insert.
 * 
 * @author Sezinando Vieira
 *
 */

public class Deque {

	private int elementosInseridos;

	private Object[] dequeInterno;

	public Deque(int tamanho) {

		this.dequeInterno = new Object[tamanho];
	}

	/**
	 * In this method, I can insert elements in the end of the array
	 * 
	 * @param obj
	 *            an object of type Object
	 */

	public void addLast(Object obj) {

		if (elementosInseridos == 0) {
			addLast(obj);
		}

		if (elementosInseridos == dequeInterno.length) {
			duplica();
		}
		dequeInterno[elementosInseridos++] = obj;

	}

	/**
	 * Here I can add an object in the begin of the array.
	 * 
	 * @param obj
	 */

	public void addFirst(Object obj) {
		if (elementosInseridos == dequeInterno.length) {
			duplica();
		}
		Object[] dequeNovo = new Object[dequeInterno.length];
		dequeNovo[0] = obj;
		for (int i = 1; i < elementosInseridos; i++) {
			dequeNovo[i] = dequeInterno[i - 1];
		}
		dequeInterno = dequeNovo;
		elementosInseridos++;
	}

	/**
	 * This method is a private one, that I made to double the size of the
	 * array, in case of its original size does not support all the elements
	 * 
	 */

	private void duplica() {
		if (elementosInseridos == dequeInterno.length) {
			Object[] dequeNovo = new Object[dequeInterno.length * 2];
			for (int i = 0; i < elementosInseridos; i++) {

				dequeNovo[i] = dequeInterno[i];

			}

			dequeInterno = dequeNovo;
		}
	}

	/**
	 * Here I can remove the first element of the Deque
	 * 
	 * @param obj
	 *            a parameter that will assume an object of type Object
	 */
	public void removeFirst(Object obj) {

		if (!(elementosInseridos == 0)) {
			dequeInterno[elementosInseridos - 1] = null;
			--elementosInseridos;
			for (int i = 0; i < elementosInseridos; i++) {
				dequeInterno[i] = dequeInterno[i + 1];
			}
		}
	}

	/**
	 * Removes the last element of the internal array
	 */

	public void removeLast() {

		dequeInterno[dequeInterno.length - 1] = null;
		elementosInseridos --;
	}

	/**
	 * @return the size of the array
	 */

	public int size() {
		return elementosInseridos;
	}
	
	/**
	 * @return if the array is empty.
	 */

	public boolean isEmpty() {
		return elementosInseridos == 0;
	}

}
