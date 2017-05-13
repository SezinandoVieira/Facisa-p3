package br.cesed.unifacisa.si.p3.linkedqueue.test;

import org.junit.Test;
import org.junit.Assert;

import br.cesed.unifacisa.si.p3.entidades.Conta;
import br.cesed.unifacisa.si.p3.linkedqueue.entidades.LinkedQueue;

public class LinkedQueueTest {

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
	
	
	@Test 
	public void testDequeue(){
		
		Conta c1 = new Conta("Carlota", 123);
		Conta c2 = new Conta("Antonieta", 124);

		LinkedQueue clodo = new LinkedQueue();
		
		clodo.dequeue();
		
		Assert.assertEquals(c2, clodo.front());
		Assert.assertEquals(1, clodo.size());
		
	}

}
