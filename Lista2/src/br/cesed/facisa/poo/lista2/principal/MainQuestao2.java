package br.cesed.facisa.poo.lista2.principal;

import br.cesed.facisa.poo.lista2.entidadesquestao2.Cliente;
import br.cesed.facisa.poo.lista2.entidadesquestao2.Empregado;

public class MainQuestao2 {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Pedin", 25, "Masculino", 1992);
		
		System.out.println(c1);
		
		Empregado emp1 = new Empregado("Bernadete", 45, "Feminino", 2500.0, "123" );
		
		System.out.println(emp1);
	}
	
}
