package br.cesed.unifacisa.si.p3.deque.entidades;

public class Deque {

	private int elementosInseridos;

	private Object[] dequeInterno;

	public Deque(int tamanho) {

		this.dequeInterno = new Object[tamanho];
	}

	public void addLast(Object obj) {

		if (elementosInseridos == dequeInterno.length) {
			this.duplica();
		}
		dequeInterno[elementosInseridos++] = obj;

	}

	public void addFirst(Object obj) {
		if (elementosInseridos == dequeInterno.length) {
			this.duplica();
		}
		Object[] dequeNovo = new Object[dequeInterno.length];
		dequeNovo[0] = obj;
		for (int i = 1; i >= this.elementosInseridos; i++) {
			dequeNovo[i] = dequeInterno[i - 1];
		}
		dequeInterno = dequeNovo;
		elementosInseridos++;
	}

	private void duplica() {
		if (elementosInseridos == dequeInterno.length) {
			Object[] dequeNovo = new Object[dequeInterno.length * 2];
			for (int i = 0; i < elementosInseridos; i++) {

				dequeNovo[i] = dequeInterno[i];

			}

			dequeInterno = dequeNovo;
		}
	}

	public void removeFirst(Object obj) {

		if (!(elementosInseridos == 0)) {
			dequeInterno[elementosInseridos -1] = null;
			--elementosInseridos;
			for (int i = 0; i < elementosInseridos; i++) {
				dequeInterno[i] = dequeInterno[i+1];
			}
		}
	}

}
