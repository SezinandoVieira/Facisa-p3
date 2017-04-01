package cesed.br.facisa.p3.poo.demaisquestoes.entidades;

/**
 * 
 * @author Sezinando Vieira
 * 
 * Responsible class for creation of Vehicle object.
 *
 */

public class Veiculo {

	private String propietario;
	
	private int anoVeiculo;

	/**
	 * Constructor from class Veiculo.java
	 */
	
	/*
	public Veiculo(String propietario, int anoVeiculo) {
		super();
		this.propietario = propietario;
		this.anoVeiculo = anoVeiculo;
	}
*/
	/**
	 * @return the propietario
	 */
	public String getPropietario() {
		return propietario;
	}

	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	/**
	 * @return the anoVeiculo
	 */
	public int getAnoVeiculo() {
		return anoVeiculo;
	}

	/**
	 * @param anoVeiculo the anoVeiculo to set
	 */
	public void setAnoVeiculo(int anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}
	
	
	
}
