package br.cesed.facisa.si.p3.pilha;

import org.junit.Test;
import org.junit.Assert;

public class PileTest {

	@Test
	public void testPush() {
		Pilha duracell = new Pilha(4);

		duracell.push("Objeto 1");
		duracell.push("Objeto 2");
		duracell.push("Objeto 3");

		Assert.assertTrue(duracell.top().equals("Objeto 3"));

	}
	
	
	@Test
	public void testPop(){
		Pilha duracell = new Pilha(4);
		
		duracell.push("Brazil");
		duracell.push("Uruguai");
		duracell.push("Canadá");
		
		duracell.pop();
		
		Assert.assertTrue(duracell.top().equals("Uruguai"));
	}
	
	@Test
	public void testTop(){
		Pilha duracell = new Pilha(4);
		
		duracell.push("Pastel");
		duracell.push("Pizza");
		
		Assert.assertEquals("Pizza", duracell.top());
		
	}
}
