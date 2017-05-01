package br.cesed.facisa.si.p3.arrays.teste;

import org.junit.Assert;
import org.junit.Test;

import br.cesed.facisa.si.p3.arrays.entidades.ArrayListFacisa;

public class ArrayTest {

	@Test
	public void testSize() {
		ArrayListFacisa lista1 = new ArrayListFacisa(3);

		Assert.assertEquals(lista1.size(), 0);

		lista1.add("pedro");

		Assert.assertEquals(1, lista1.size());

		lista1.add("jão");

		Assert.assertEquals(2, lista1.size());
	}

	@Test
	public void testAdd() {
		ArrayListFacisa lista1 = new ArrayListFacisa(3);

		lista1.add("jeca");

		Assert.assertEquals(1, lista1.size());

		lista1.add("balalaica");

		lista1.add("vodka");

		lista1.add("putin");

		Assert.assertEquals(4, lista1.size());

	}
	
	@Test
	public void testRemove() {
		ArrayListFacisa lista1 = new ArrayListFacisa(3);
		
		lista1.add("carlos");
		
		Assert.assertEquals(1, lista1.size());
		
		lista1.remove(0);
		
		Assert.assertEquals(0, lista1.size());
		
		
	}

}
