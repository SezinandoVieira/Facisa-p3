package br.cesed.facisa.poo.teste;

import br.cesed.facisa.poo.entidades.Conta;
import br.cesed.facisa.poo.entidades.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente("Rodrigo", 1, 1);
		
		c.depositar(50000.0);
		
		System.out.println(c.retornaSaldo());
		
		c.sacar(25000.0);
		
		System.out.println(c.retornaSaldo());
	}
	
}
