package componente.carro;

public class Carro {
	/*
	 * Atributos da classe, são declarados como private para manter a
	 * integridade dos dados, respeitando o encapsulamento, somente é possivel
	 * acessar e setar os dados via metodos getter e setter.
	 */
	private String marcaMotor;
	private String marcaPneu;
	private String marcaCombustivel;

	/*
	 * Metodos Getter e Setter, metodos que permitem o acesso a atributos
	 * privados da classe
	 */
	public String getMarcaMotor() {
		return marcaMotor;
	}

	public void setMarcaMotor(String marcaMotor) {
		this.marcaMotor = marcaMotor;
	}

	public String getMarcaPneu() {
		return marcaPneu;
	}

	public void setMarcaPneu(String marcaPneu) {
		this.marcaPneu = marcaPneu;
	}

	public String getMarcaCombustivel() {
		return marcaCombustivel;
	}

	public void setMarcaCombustivel(String marcaCombustivel) {
		this.marcaCombustivel = marcaCombustivel;
	}
	
	/* metodo para adicionar um carro , uso static para que seja possivel
	 *  utilizar fora da classe 
	 */
	public static Carro criarCarro(String marcaMotor, String marcaPneu, String marcaCombustivel) {
		Carro carro = new Carro();
		carro.setMarcaMotor(marcaMotor);
		carro.setMarcaPneu(marcaPneu);
		carro.setMarcaCombustivel(marcaCombustivel);
		return carro;
	}
	
	/*Override é uma reescrita do metodo toString, uso para imprimir  os 
	dados dos atributos da classe */
	@Override
	public String toString() {
		return "Carro [marcaMotor=" + marcaMotor + ", marcaPneu=" + marcaPneu
				+ ", marcaCombustivel=" + marcaCombustivel + "]";
	}
	

}
