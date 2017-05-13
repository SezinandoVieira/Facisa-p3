/**
package br.cesed.unifacisa.si.p3.pilha.test;

import org.junit.Test;
import org.junit.Assert;

import br.cesed.unifacisa.si.p3.entidades.Conta;
import br.cesed.unifacisa.si.p3.pilha.entidade.PilhaEncadeada;

public class LinkedPileTest {

	@Test
	public void testPush(){

		PilhaEncadeada duracell = new PilhaEncadeada();

		duracell.push();
		duracell.push(c2);

		Assert.assertEquals("carlota", duracell.top.getNome());

	}

	@Test
	public void testTop() {
		Conta c1 = new Conta("carlota", 123);
		Conta c2 = new Conta("tirulipa", 124);

		PilhaEncadeada duracell = new PilhaEncadeada();

		duracell.push(c1);

		AssertEquals("carlota", duracell.top.getNome());

	}
	
	@Test
	public void TesPop(){
		
		Conta c1 = new Conta("carlota", 123);
		Conta c2 = new Conta("tirulipa", 124);
		Conta c3 = new Conta("malaquias", 125);
		
		PilhaEncadeada duracell = new PilhaEncadeada();
		
		duracell.pop();
		
		AssertEquals("tirulipa", duracell.top.getNome);
		
	}

}
**/