package br.cesed.unifacisa.si.p3.mergersort.entitie;

public class MergeSort {
	private static int[] arrayP;
	private static int[] arrayS;

	private int numeros;
/**
	public void sort(int[] valores) {
		this.arrayP = valores;
		numeros = valores.length;
		this.arrayS = new int[numeros];
		mergeSort(0, numeros - 1);
	}**/

	public static int[] mergeSort(int ini, int fim) {
		int [] arrayO = null;
		//Verifica se o inicio é maior que o final, se não for o array é ordenado
		if (ini < fim) {
			
			
			// Aqui eu vou pegar a posição do elemento que está no meio
			int meio = (ini + fim) / 2;
			// Aqui eu ordeno o lado esquerda do array
			mergeSort(ini, meio);
			// aqui eu ordeno o lado direito do array
			mergeSort(meio + 1, fim);
			// E após os dois ordenados, eu combino eles em um unico array
			arrayO = sort(ini, meio, fim);
		}
		
		return arrayO;
	}

	/**
	 * Responsible method to do 
	 * @param ini
	 * @param meio
	 * @param fim
	 * @return 
	 */
	
	public static int[] sort(int ini, int meio, int fim) {

		// Copy both parts into the helper array
		for (int i = ini; i <= fim; i++) {
			arrayS[i] = arrayP[i];
		}

		int i = ini;
		int j = meio + 1;
		int k = ini;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= meio && j <= fim) {
			if (arrayS[i] <= arrayS[j]) {
				arrayP[k] = arrayS[i];
				i++;
			} else {
				arrayP[k] = arrayS[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= meio) {
			arrayP[k] = arrayS[i];
			k++;
			i++;
		}
		return arrayP;

	}
}
