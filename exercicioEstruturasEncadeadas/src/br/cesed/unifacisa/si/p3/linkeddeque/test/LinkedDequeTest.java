
package br.cesed.unifacisa.si.p3.linkeddeque.test;

import org.junit.Test;

import org.junit.Assert;

import br.cesed.unifacisa.si.p3.entidades.Conta;
import br.cesed.unifacisa.si.p3.linkeddeque.entidades.LinkedDeque;

/**
 * This is my JUnit test case for my LinkedDeque Class, to see if the methods
 * that I made, are working fine.
 * 
 * 
 * @author Sezinando Vieira
 * 
 * @see Conta
 *
 */

public class LinkedDequeTest {

	@Test
	public void addTest() {

		Conta c1 = new Conta("Carlota", 123);
		Conta c2 = new Conta("Antonieta", 124);
		Conta c3 = new Conta("Valdez", 125);

		LinkedDeque porto = new LinkedDeque();

		porto.addFirst(c1);
		porto.addFirst(c2);

		Assert.assertEquals(2, porto.size());

		Assert.assertTrue(!porto.isEmpty());

		porto.addLast(c3);

		Assert.assertEquals(3, porto.size());

	}

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
