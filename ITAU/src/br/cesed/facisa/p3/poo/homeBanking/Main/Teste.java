package br.cesed.facisa.p3.poo.homeBanking.Main;

import br.cesed.facisa.p3.poo.homeBanking.entities.Conta;
import br.cesed.facisa.p3.poo.homeBanking.entities.ContaCorrente;
import br.cesed.facisa.p3.poo.homeBanking.entities.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
	
		Conta c1 = new ContaCorrente("Jaozin", 1, 1, 1.2);
		
		Conta c2 = new ContaPoupanca("Pedin", 1, 1, 1.3);
		
		System.out.println(c1);
		
		System.out.println(c2);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
	}
	 
	
}
