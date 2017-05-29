package br.cesed.unifacisa.si.p3.mergersort.test;

import org.junit.Assert;
import org.junit.Test;

import br.cesed.unifacisa.si.p3.mergersort.entitie.Merge;

public class MergeSortTest {

	@Test
	public void ordenationTest() {
		int [] array = new int [] {89, 25, 2, 4, 6, 78, 12, 52};
		
		array = Merge.sort(array);
		
		int [] arrayE = new int [] {2, 4, 6, 12, 25, 52, 78, 89};
		
		
		Assert.assertArrayEquals(arrayE, array);
		
		
		
	}

	

}
