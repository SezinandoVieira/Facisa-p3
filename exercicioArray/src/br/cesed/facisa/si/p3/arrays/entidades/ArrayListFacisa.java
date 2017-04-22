package br.cesed.facisa.si.p3.arrays.entidades;

/**
 * Class for my own implementation of ArrayList
 * 
 * @author Sezinando Vieira
 *
 */
public class ArrayListFacisa {

	private Object[] arrayInterno;

	private int elementosInseridos;

	/**
	 * Constructor
	 * 
	 * @param tamanho
	 *            the initial size of ArrayList
	 */
	public ArrayListFacisa(int tamanho) {
		this.arrayInterno = new Object[tamanho];
	}

	/**
	 * Return the size of ArrayList.
	 * 
	 * @return
	 */
	public int size() {
		return elementosInseridos;
	}

	/**
	 * Add an object
	 * 
	 * @param obj
	 */
	public void add(Object obj) {

		if (elementosInseridos >= arrayInterno.length) {

			Object[] arrayMaior = new Object[arrayInterno.length * 2];

			for (int i = 0; i < arrayInterno.length; i++) {

				arrayInterno[i] = arrayMaior[i];
			}
			arrayInterno = arrayMaior;
		}

		arrayInterno[elementosInseridos++] = obj;
	}

	/**
	 * Remove an object
	 * 
	 * @param obj
	 */
	public void remove(Object obj) {
		int elementoPosicao = findPosition(obj);

		if (elementoPosicao != -1) {
			for (int i = elementoPosicao; i < elementosInseridos; i++) {
				arrayInterno[i] = arrayInterno[i + 1];
			}
		}
		elementosInseridos--;
	}

	/**
	 * Get the object by index.
	 * 
	 * @param index
	 *            index in Array
	 */
	public Object getByIndex(int index) {

		Object obj = null;

		if (index < arrayInterno.length) {
			obj = arrayInterno[index];
		}

		return obj;
	}

	/**
	 * Check the position of the informed object.
	 * 
	 * @param obj
	 * @return
	 */
	public int findPosition(Object obj) {

		int posicionamento = -1;

		if (obj != null && arrayInterno.length > 0) {

			for (int i = 0; i < arrayInterno.length;) {
				posicionamento = i;
				break;
			}
		}

		return posicionamento;
	}

	public void printAllElements() {
		for (Object objeto : arrayInterno) {
			System.out.println(objeto);
		}

	}

}
