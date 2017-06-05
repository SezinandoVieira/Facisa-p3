package br.cesed.unifacisa.si.p3.deque.teste;

import org.junit.Test;

import br.cesed.unifacisa.si.p3.deque.entidades.Deque;
import org.junit.Assert;

/**
 * Here is this JUnit test case, I verify if the methods that i made for my Deque class are functioning as expected.
 * @author Sezinando Vieira
 *
 *
 */

public class TestDeque {

	@Test
	public void testAdd() {
		Deque pier = new Deque(5);

		pier.addFirst("Sezinando2");
		pier.addFirst("Sezinando3");

		Assert.assertEquals(2, pier.size());

		pier.addLast("Sezinando5");

		Assert.assertEquals(3, pier.size());

		pier.addLast("Carlos");
		pier.addFirst("Jão");
		pier.addFirst("Marieta");

		Assert.assertEquals(6, pier.size());

	}

	@Test
	public void testRemove() {
		Deque pier = new Deque(5);

		pier.addFirst("carlos");
		pier.addFirst("jobson");
		pier.addLast("varlysson");
		pier.addLast("mariscleyton");

		Assert.assertEquals(4, pier.size());
		pier.removeFirst("carlos");

		Assert.assertEquals(3, pier.size());

		pier.removeLast();

		Assert.assertEquals(2, pier.size());

	}

	@Test
	public void isEmptyTest() {
		Deque pier = new Deque(5);

		pier.addFirst("carlos");
		pier.addFirst("jobson");
		
		pier.removeFirst("carlos");
		pier.removeFirst("jobson");
		
		Assert.assertTrue(pier.isEmpty());
	}

}
