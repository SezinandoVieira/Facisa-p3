/**
 * @author Sezinando Vieira
 * 
 * This Junit test case is used to test the methods of LinkedDeque Class
 * 
 * @see LinkedDeque.java
 */

package br.cesed.unifacisa.si.p3.linkeddeque.test;

import org.junit.Test;
import org.junit.Assert;

import br.cesed.unifacisa.si.p3.entidades.Conta;
import br.cesed.unifacisa.si.p3.linkeddeque.entidades.LinkedDeque;

public class LinkedDequeTest {

	/**
	 * In this test, i check if the elements that i defined are in the Deque
	 */

	@Test
	public void addTest() {
		/*
		 * I create multiple object of type Conta and add in the deque
		 */

		Conta c1 = new Conta("Carlota", 123);
		Conta c2 = new Conta("Antonieta", 124);
		Conta c3 = new Conta("Valdez", 125);

		LinkedDeque porto = new LinkedDeque();

		porto.addFirst(c1);
		porto.addFirst(c2);

		/*
		 * Now i'm checking if the size matches with the amount of elements tha
		 * i added
		 */
		Assert.assertEquals(2, porto.size());

		Assert.assertTrue(!porto.isEmpty());

		porto.addLast(c3);

		Assert.assertEquals(3, porto.size());

	}

	/**
	 * Here in this test, is pretty much the same logic as the previous test,
	 * but instead of adding a object, I'm removing it.
	 */

	@Test
	public void removeTest() {
		Conta c1 = new Conta("Carlota", 123);
		Conta c2 = new Conta("Antonieta", 124);
		Conta c3 = new Conta("Valdez", 125);

		LinkedDeque porto = new LinkedDeque();

		porto.addFirst(c1);
		porto.addFirst(c2);
		porto.addFirst(c3);

		porto.removeFirst();

		Assert.assertEquals(2, porto.size());

		porto.removeLast();

		Assert.assertEquals(1, porto.size());
		Assert.assertTrue(!porto.isEmpty());

		porto.removeFirst();

		Assert.assertTrue(porto.isEmpty());

	}
	/**
	 * And finally in this test, I'm just checking the size of the data structure.
	 */

	@Test
	public void sizeTest() {
		Conta c1 = new Conta("Carlota", 123);
		Conta c2 = new Conta("Antonieta", 124);
		Conta c3 = new Conta("Valdez", 125);

		LinkedDeque porto = new LinkedDeque();

		porto.addFirst(c1);
		porto.addLast(c3);

		Assert.assertEquals(2, porto.size());

		porto.addLast(c2);

		Assert.assertEquals(3, porto.size());

	}

}
