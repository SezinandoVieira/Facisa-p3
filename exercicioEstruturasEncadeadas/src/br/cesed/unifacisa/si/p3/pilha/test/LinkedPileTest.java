
package br.cesed.unifacisa.si.p3.pilha.test;

import org.junit.Test;
import org.junit.Assert;

import br.cesed.unifacisa.si.p3.entidades.Conta;
import br.cesed.unifacisa.si.p3.pilha.entidade.PilhaEncadeada;

public class LinkedPileTest {

	@Test
	public void testPush(){

		Conta c1 = new Conta("carlota", 123);
		Conta c2 = new Conta("tirulipa", 124);
		
		PilhaEncadeada duracell = new PilhaEncadeada();

		duracell.push(c1);
		duracell.push(c2);

		Assert.assertEquals(c2,duracell.top());
		Assert.assertEquals(2, duracell.size());

	}

	@Test
	public void testTop() {
		Conta c1 = new Conta("carlota", 123);
		Conta c2 = new Conta("tirulipa", 124);

		PilhaEncadeada duracell = new PilhaEncadeada();

		duracell.push(c1);
		duracell.push(c2);

		Assert.assertEquals(c2, duracell.top());
		
		Conta c3 = new Conta("vagem", 125);
		
		duracell.push(c3);
		
		Assert.assertEquals(c3, duracell.top());
		
		duracell.pop();
		duracell.pop();
		
		Assert.assertEquals(c1, duracell.top());

	}
	
	@Test
	public void TesPop(){
		
		Conta c1 = new Conta("carlota", 123);
		Conta c2 = new Conta("tirulipa", 124);
		Conta c3 = new Conta("malaquias", 125);
		
		PilhaEncadeada duracell = new PilhaEncadeada();
		
		duracell.push(c1);
		duracell.push(c2);
		duracell.push(c3);
		
		duracell.pop();
		
		Assert.assertEquals(c2, duracell.top());
		Assert.assertEquals(2, duracell.size());
		
	}

}
