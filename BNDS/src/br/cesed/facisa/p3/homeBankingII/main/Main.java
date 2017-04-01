package br.cesed.facisa.p3.homeBankingII.main;

import br.cesed.facisa.p3.homeBankingII.entities.Agencia;
import br.cesed.facisa.p3.homeBankingII.entities.Banco;
import br.cesed.facisa.p3.homeBankingII.entities.Cliente;
import br.cesed.facisa.p3.homeBankingII.entities.Conta;
import br.cesed.facisa.p3.homeBankingII.entities.Endereco;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Oscar Alho","12542645","646466546");
		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente("Paula Tejando","9987897","97984654");
		System.out.println(cliente2);
		
		Banco banco1 = new Banco(1, "BNDS", "Irlanda");
		System.out.println(banco1);
		
		Agencia ag1 = new Agencia(1, "Agencia de Dublin");
		System.out.println(ag1);
		
		Conta c1 = new Conta(1, "Genérica", 0.0);
		System.out.println(c1);
		
		Endereco end1 = new Endereco("Rua do peido", 11, "24252829");
		System.out.println(end1);
		
	}
}
