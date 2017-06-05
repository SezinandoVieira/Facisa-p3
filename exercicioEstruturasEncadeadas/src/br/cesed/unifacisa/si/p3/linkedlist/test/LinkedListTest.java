package br.cesed.unifacisa.si.p3.linkedlist.test;

import org.junit.Test;
import org.junit.Assert;

import br.cesed.unifacisa.si.p3.entidades.Conta;
import br.cesed.unifacisa.si.p3.linkedlist.entitie.LinkedList;

public class LinkedListTest {

	@Test
	public void addByIndexTest() {
		LinkedList ll = new LinkedList();

		Conta c1 = new Conta("Jerson", 123);
		Conta c2 = new Conta("Jania", 124);
		Conta c3 = new Conta("Jobson", 125);
		Conta c4 = new Conta("Janaina", 126);

		ll.addIndex(c1, 1);
		ll.addIndex(c2, 3);
		ll.addIndex(c3, 2);

		Assert.assertEquals(3, ll.size());

		ll.addIndex(c4, 4);
	}

	@Test
	public void removeByIndex() {
		LinkedList ll = new LinkedList();

		Conta c1 = new Conta("Jerson", 123);
		Conta c2 = new Conta("Jania", 124);
		Conta c3 = new Conta("Jobson", 125);
		
		ll.addIndex(c1, 1);
		ll.addIndex(c2, 2);
		ll.addIndex(c3, 3);
		
		ll.removeByIndex(1);
		
		Assert.assertEquals(2, ll.size());
		
		ll.removeByIndex(2);
		
		Assert.assertEquals(1, ll.size());

	}

}
