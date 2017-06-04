package br.cesed.facisa.si.p3.pilha;

import org.junit.Test;

import org.junit.Assert;

/**
 * Junit test case to my Stack class in a sequential way
 * 
 * 
 * @author Sezinando Vieira
 *
 */

public class PileTest {

	/**
	 * Testing if the elements that i created, are being inserted int the top of the stack
	 */
	@Test
	public void testPush() {
		Pilha duracell = new Pilha(4);

		duracell.push("Objeto 1");
		duracell.push("Objeto 2");
		duracell.push("Objeto 3");

		Assert.assertTrue(duracell.top().equals("Objeto 3"));

	}
	/**
	 * In this method, I verify if the top element that i defined are correct 
	 */
	
	@Test
	public void testPop(){
		Pilha duracell = new Pilha(4);
		
		duracell.push("Brazil");
		duracell.push("Uruguai");
		duracell.push("Canadá");
		
		duracell.pop();
		
		Assert.assertTrue(duracell.top().equals("Uruguai"));
	}
	
	/**
	 * Testing the method that removes the top element of the stack
	 */
	@Test
	public void testTop(){
		Pilha duracell = new Pilha(4);
		
		duracell.push("Pastel");
		duracell.push("Pizza");
		
		Assert.assertEquals("Pizza", duracell.top());
		
	}
}
