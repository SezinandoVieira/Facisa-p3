package br.cesed.facisa.poo.lista2.principal;

import br.cesed.facisa.poo.lista2.entidades.Cachorro;
import br.cesed.facisa.poo.lista2.entidades.Peixe;

public class Main {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Ariosvaldo", 25.0, "Golden Retrivier");
		
		System.out.println(dog);
		
		Peixe fish = new Peixe("Golden", 0.1, "Agua Salgada");
		
		System.out.println(fish);
		
	}
	
}
