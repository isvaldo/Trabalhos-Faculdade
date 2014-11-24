package componente.piloto;

public class Piloto {
	/*
	 * Atributos da classe, são declarados como private para manter a
	 * integridade dos dados, respeitando o encapsulamento, somente é possivel
	 * acessar e setar os dados via metodos getter setter.
	 */
	private int id;
	private String nome;
	private int idade;
	private String nacionalidade;
	private int numeroTitulos;

	/*
	 * Metodos Getter e Setter, metodos que permitem o acesso a atributos
	 * privados da classe
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getNumeroTitulos() {
		return numeroTitulos;
	}

	public void setNumeroTitulos(int numeroTitulos) {
		this.numeroTitulos = numeroTitulos;
	}

	/*  Metodo para cadastrar um piloto,uso static para que seja possivel
	 *  utilizar fora da classe 
	 */
	public static Piloto adicionarPiloto(int id, String nome, int idade,
			String nacionalidade, int numeroTitulos) {
		Piloto piloto = new Piloto();
		piloto.setId(id);
		piloto.setNome(nome);
		piloto.setIdade(idade);
		piloto.setNacionalidade(nacionalidade);
		piloto.setNumeroTitulos(numeroTitulos);
		return piloto;
	}
	/*Override é uma reescrita do metodo toString, uso para imprimir  os 
	dados dos atributos da classe */
	@Override
	public String toString() {
		return "Piloto [id=" + id + ", nome=" + nome + ", idade=" + idade
				+ ", nacionalidade=" + nacionalidade + ", numeroTitulos="
				+ numeroTitulos + "]";
	}

}
