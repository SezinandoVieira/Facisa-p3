package br.cesed.unifacisa.si.p3.linkedqueue.test;

import org.junit.Test;

import org.junit.Assert;

import br.cesed.unifacisa.si.p3.entidades.Conta;
import br.cesed.unifacisa.si.p3.linkedqueue.entidades.LinkedQueue;

/**
 * 
 * @author Sezinando Vieira
 *
 * This is the Junit test case, that a i made for the LinkedQueue class, to test if the methods are 
 * behaving the ways that are expected.
 */

public class LinkedQueueTest {

	/**
	 * Here I test the Enqueue method. Making sure that the elements are being inserted in the Queue.
	 * 
	 * And also, checking if the front element and the size are matched with what is expected.
	 * 
	 */
	@Test
	public void testEnqueue() {
		Conta c1 = new Conta("Carlota", 123);
		Conta c2 = new Conta("Antonieta", 124);

		LinkedQueue clodo = new LinkedQueue();

		clodo.enqueue(c1);
		clodo.enqueue(c2);

		Assert.assertEquals(c1, clodo.front());
		Assert.assertEquals(2, clodo.size());

	}
	
	/**
	 *In this test, I'm checking if the front element of the queue is being removed, 
	 *and the size and the front element are corresponding with the expected.
	 */
	
	@Test 
	public void testDequeue(){
		
		Conta c1 = new Conta("Carlota", 123);
		Conta c2 = new Conta("Antonieta", 124);

		LinkedQueue clodo = new LinkedQueue();
		
		clodo.enqueue(c1);
		clodo.enqueue(c2);
		
		
		clodo.dequeue();
		
		
		Assert.assertEquals(c2, clodo.front());
		Assert.assertEquals(1, clodo.size());
		
	}
	
	/**
	 * I'm testin here the size method, if is returning the queue size as expected.
	 */
	
	@Test
	public void testSize(){
		
		Conta c1 = new Conta("Carlota", 123);
		Conta c2 = new Conta("Antonieta", 124);
		Conta c3 = new Conta("Felizberto", 125);
		Conta c4 = new Conta("Chica", 126);
		
		
		LinkedQueue clodo = new LinkedQueue();
		
		clodo.enqueue(c1);
		clodo.enqueue(c2);
		clodo.enqueue(c3);
		clodo.enqueue(c4);
		
		Assert.assertEquals(4, clodo.size());
		
		clodo.dequeue();
		clodo.dequeue();
		
		Assert.assertEquals(2, clodo.size());
	}
	/**
	 * And finally, in this test I'm adding and removing elements to check if the method returns if the queue is really empty
	 */
	@Test
	public void testIsEmpty(){
		Conta c1 = new Conta("Carlota", 123);
		Conta c2 = new Conta("Antonieta", 124);
		Conta c3 = new Conta("Felizberto", 125);
		
		LinkedQueue clodo = new LinkedQueue();
		
		clodo.enqueue(c1);
		clodo.enqueue(c2);
		clodo.enqueue(c3);
		
		Assert.assertTrue(!clodo.isEmpty());
		
		clodo.dequeue();
		clodo.dequeue();
		clodo.dequeue();
		
		Assert.assertTrue(clodo.isEmpty());
		
	}
	

}
