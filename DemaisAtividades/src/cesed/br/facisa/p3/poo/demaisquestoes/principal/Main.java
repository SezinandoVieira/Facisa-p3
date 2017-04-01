package cesed.br.facisa.p3.poo.demaisquestoes.principal;

import cesed.br.facisa.p3.poo.demaisquestoes.entidades.Empregado;
import cesed.br.facisa.p3.poo.demaisquestoes.entidades.Veiculo;

public class Main {

	public static void main(String[] args) {

		Veiculo veraneio = new Veiculo();

		Veiculo paganiZonda = new Veiculo();

		veraneio.setPropietario("Jaozinho");
		veraneio.setAnoVeiculo(1992);
		
		System.out.println(veraneio.getPropietario());
		System.out.println(veraneio.getAnoVeiculo());
		
		paganiZonda.setPropietario("Abelardo");
		paganiZonda.setAnoVeiculo(2012);
		
		System.out.println(paganiZonda.getPropietario());
		System.out.println(paganiZonda.getAnoVeiculo());
		
		Empregado emp1 = new Empregado("Pedin", 123, 64, 2200.0);

		Empregado emp2 = new Empregado("Josivaldo", 124, 27, 22000.0);

		System.out.println(emp1);
		
		System.out.println(emp2);
		
		
		
	}

}
