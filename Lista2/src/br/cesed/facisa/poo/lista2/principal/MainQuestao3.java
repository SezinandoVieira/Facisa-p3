package br.cesed.facisa.poo.lista2.principal;

import br.cesed.facisa.poo.lista2.entidadesquestao3.Fornecedor;

public class MainQuestao3 {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor("Biladas Inc","Rua da Torneirona Mole", "25665-8458", 5000.0);
		
		System.out.println(f1);
		
		Fornecedor f2 = new Fornecedor("Jailson Mendes ltda.", "Rua do Macho Peludo", "24241111-2568", 9000.0, 7000.0);

		System.out.println(f2);
	}

}
