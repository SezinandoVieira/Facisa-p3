package br.cesed.facisa.si.p3.pilha;
/**
 * 
 * @author Sezinando
 * 
 * Class for my own implementation of stack
 *
 */
public class Pilha {

	private Object[] pilhaInterna;

	private int pos;

	/**
	 * Constructor from class Pilha.java
	 */
	public Pilha(int tamanho) {

		this.pilhaInterna = new Object[tamanho];

	}

	/**
	 * Responsible method for remove the top element
	 * 
	 */
	public Object pop() {
		pilhaInterna[--pos] = null;
		return this.top();
	}

	/**
	 * 
	 * Responsible method to insert one element in the top
	 * 
	 */

	public void push(Object obj) {
		if (pos == pilhaInterna.length) {

			Object[] pilhaNova = new Object[pilhaInterna.length * 2];
			for (int i = 0; i < pilhaNova.length; i++) {
				pilhaInterna[i] = pilhaNova[i];
			}
			pilhaInterna = pilhaNova;

		}
		pilhaInterna[pos++] = obj;

	}

	/**
	 * 
	 * Responsible method to consult the top element
	 */
	public Object top() {
		return pilhaInterna[pos - 1];
	}

}
