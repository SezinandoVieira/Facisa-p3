package br.cesed.unifacisa.si.p3.fila.entidades;

public class Fila {

	private Object[] array;

	private int inseridos;

	public Fila(int tamanho) {
		super();
		this.array = new Object[tamanho];
		this.inseridos = 0;
	}

	public void enqueue(Object obj) {
		duplica();
		array[inseridos++] = obj;

	}

	private void duplica() {
		if (array.length == inseridos) {
			Object[] arrayT = new Object[array.length * 2];
			for (int i = 0; i < arrayT.length; i++) {
				arrayT[i] = array[i];
			}
			array = arrayT;
		}

	}

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

	public int size() {
		return inseridos;
	}

	public boolean isEmpty() {
		return array.length == 0;
	}
}
