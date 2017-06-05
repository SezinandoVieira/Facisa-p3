package br.cesed.unifacisa.si.p3.fila.teste;

import org.junit.Test;

import br.cesed.unifacisa.si.p3.fila.entidades.Fila;
import org.junit.Assert;

/**
 * This is my JUnit test case for my class Queue. I make the Enqueue and Dequeue tests, to see
 * if they are working well. 
 * 
 * @author Sezinando Vieira
 *
 *
 */

public class TestFila {

	@Test
	public void enqueueTest() {
		
		Fila f = new Fila(3);
		
		f.enqueue("Vando");
		f.enqueue("Marilson");
		f.enqueue("Gilberta");
		
		Assert.assertEquals(3, f.size());
		
		f.enqueue("Vania");
		
		Assert.assertEquals(4, f.size());
		
	}
	
	@Test
	public void dequeueTest(){
		
		Fila f = new Fila(3);
		
		f.enqueue("Vando");
		f.enqueue("Marilson");
		
		Assert.assertEquals(2, f.size());
		
		f.dequeue();
		
		Assert.assertEquals(1, f.size());
		
		f.dequeue();
		
		Assert.assertEquals(0,f.size());
		
	}

}
