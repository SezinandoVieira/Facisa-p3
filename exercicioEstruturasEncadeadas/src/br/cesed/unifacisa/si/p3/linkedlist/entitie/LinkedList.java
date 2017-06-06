package br.cesed.unifacisa.si.p3.linkedlist.entitie;

import br.cesed.unifacisa.si.p3.entidades.Conta;

/**
 * This class is my own implementation of data structure that is List in a
 * linked way.
 * 
 * Here i defined two variables. The first one is inicio of type Conta, it's
 * serves to define which elements is the beginning of the List. The second one
 * is to map how many elements are inserted on the List.
 * 
 * @see Conta
 * @author Sezinando Vieira
 *
 */

public class LinkedList {

	private int inseridos;

	private Conta inicio;

	/**
	 * This method adds a object by the index that is defined by the user
	 * 
	 * @param <b>c<b>
	 *            assume a object of type Conta
	 * 
	 * @param <b>index<b>
	 *            assume the index value
	 */

	public void addIndex(Conta c, int index) {
		if (inicio == null) {
			inicio = c;
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

	/**
	 * Removes an element from his index
	 * 
	 * @param index
	 */

	public void removeByIndex(int index) {

		if (index < inseridos) {
			Conta temp = inicio;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getNextConta();
			}
			if(temp.getNextConta()==null){
				temp.setNextConta(null);
			}else{
				temp.setNextConta(temp.getNextConta().getNextConta());
			}

		}
		inseridos--;

	}

	/**
	 * 
	 * @return the size of the list
	 */

	public int size() {
		return inseridos;
	}

	/**
	 * @return if the list is empty
	 */

	public boolean isEmpty() {
		return inseridos == 0;
	}

	/**
	 * Here I'm adding an object by his value
	 *
	 * @param c
	 */
	public void add(Conta c) {

		if (inicio == null) {
			inicio = c;
		} else {

			c.setNextConta(inicio);
			inicio = c;

		}

		inseridos++;

	}

	/**
	 * With this method, I add an object in the final of the list
	 * 
	 * @param c
	 *            an object of type Conta
	 */

	public void addLast(Conta c) {
		if (inicio == null) {
			c = inicio;
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
	 * This method removes an object by his value
	 * 
	 * @param c
	 *            an object of type Conta
	 */

	public void removeByValue(Conta c) {
		Conta temp = inicio;

		while (c != temp) {
			if (temp.getNextConta() == c) {
				temp.setNextConta(c.getNextConta());
				break;
			}
			temp = temp.getNextConta();

		}

	}

}
