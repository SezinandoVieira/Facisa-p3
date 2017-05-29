package br.cesed.unifacisa.si.p3.mergersort.entitie;

public class Merge {
	
	public static int[] sort(int[] array) {
		int inicio = 0;
		int meio = array.length / 2;
		int fim = array.length;
		int [] arrayS = new int[array.length];
		int [] arrayP = array;
		// Copy both parts into the helper array
		for (int i = inicio; i <= fim; i++) {
			arrayS[i] = arrayP[i];
		}

		int i = inicio;
		int j = meio + 1;
		int k = inicio;
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
