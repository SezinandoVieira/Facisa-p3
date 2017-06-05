package br.cesed.unifacisa.si.p3.fila.entidades;

/**
 * This is my own implementation of the data structure Queue in a sequential
 * way. I defined one variable to track how many elements are being insert in
 * the array, that is elementosInseridos, and a internal array to store the
 * elements that I want to insert.
 * 
 * @author Sezinando Vieira
 *
 *
 */

public class Fila {

	private Object[] array;

	private int inseridos;

	public Fila(int tamanho) {
		super();
		this.array = new Object[tamanho];
		this.inseridos = 0;
	}
	
	/**
	 * In this method I insert an element in the Queue 
	 * 
	 * @param obj this parameter will assume an object of type Object
	 */

	public void enqueue(Object obj) {
		duplica();
		array[inseridos++] = obj;

	}
	
	/**
	 * This method, I made just to duplicate the array, if he exceeds its size
	 */

	private void duplica() {
		if (inseridos == array.length) {
			Object[] arrayT = new Object[array.length * 2];
			for (int i = 0; i < inseridos; i++) {
				arrayT[i] = array[i];
			}
			array = arrayT;
		}
		

	}
	
	/**
	 * In here i remove an element of the Queue
	 * 
	 * @return the removed element
	 */

	public Object dequeue() {
		Object[] arrayTemp = new Object[array.length];

		Object retorno = array[0];
		array[0] = null;

		for (int i = 1; i < array.length; i++) {
			arrayTemp[i - 1] = array[i];

		}
		inseridos--;
		array = arrayTemp;
		return retorno;
	}
	
	/**
	 * 
	 * @return the size of the Queue
	 */

	public int size() {
		return inseridos;
	}
	
	/**
	 * 
	 * @return if its empty
	 */

	public boolean isEmpty() {
		return array.length == 0;
	}
}
