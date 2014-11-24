package componente.equipe;

import componente.carro.Carro;
import componente.piloto.Piloto;

public class Equipe {
	/*
	 * Atributos da classe, são declarados como private para manter a
	 * integridade dos dados, respeitando o encapsulamento, somente é possivel
	 * acessar e setar os dados via metodos getter e setter.
	 */
	private String nome;
	private String dataFundacao; // data está no formato DD/MM/AAAA
	private String pais;
	private Piloto[] listaPiloto = new Piloto[2];
	private Carro[] listaCarro = new Carro[2];

	/*
	 * Metodos Getter e Setter, metodos que permitem o acesso a atributos
	 * privados da classe
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Piloto[] getListaPiloto() {
		return listaPiloto;
	}

	public void setListaPiloto(Piloto[] listaPiloto) {
		this.listaPiloto = listaPiloto;
	}

	public Carro[] getListaCarro() {
		return listaCarro;
	}

	public void setListaCarro(Carro[] listaCarro) {
		this.listaCarro = listaCarro;
	}

	// Metodo para designar piloto a equipe
	public void adicionarPilotoEquipe(Piloto piloto, int indice) {
		this.listaPiloto[indice] = piloto;
	}

	// Metodo para designar carro a equipe
	public void adicionarCarro(Carro carro, int indice) {
		this.listaCarro[indice] = carro;
	}

	// metodo para trocar carros entre pilotos
	public void trocaCarro() {
		// variavel auxiliar, guarda o primeiro elemento
		Carro Carrotemp = this.listaCarro[0];
		this.listaCarro[0] = this.listaCarro[1];
		this.listaCarro[1] = Carrotemp;
	}

	// adiciona titulo a um piloto
	public void adicionaTitulo(int id) {
		// procuro entre os pilotos
		for (int i = 0; i < this.listaPiloto.length; i++) {
			if (this.listaPiloto[i].getId() == id) {
				// incremento 1 o numero de titulos
				this.listaPiloto[i].setNumeroTitulos(this.listaPiloto[i]
						.getNumeroTitulos() + 1);
			}
		}
	}

	// metodo que Pega melhor piloto
	public Piloto getMelhorPiloto() {
		// crio uma variavel com menor valor inteiro
		int maior = Integer.MIN_VALUE;
		// variavel auxiliar para armazenar indice piloto,carro
		int indice = 0;
		// procuro em todos os pilotos e vou alocando o maior nº titulos
		for (int i = 0; i < this.listaPiloto.length; i++) {

			if (this.listaPiloto[i].getNumeroTitulos() > maior)
				indice = i;

		}
		return this.listaPiloto[indice];

	}
	
	// metodo que Pega melhor piloto
		public void mostraMelhorPiloto() {
			// crio uma variavel com menor valor inteiro
			int maior = Integer.MIN_VALUE;
			// variavel auxiliar para armazenar indice piloto,carro
			int indice = 0;
			// procuro em todos os pilotos e vou alocando o maior nº titulos
			for (int i = 0; i < this.listaPiloto.length; i++) {

				if (this.listaPiloto[i].getNumeroTitulos() > maior)
					indice = i;

			}
			// mostrando dados do melhor piloto
			System.out.println(this.listaPiloto[indice].toString());
			System.out.println(this.listaCarro[indice].toString()+"\n");

		}
	/* Metodo para criar uma equipe e static para que seja possivel
	 *  utilizar fora da classe 
	 */
	public static Equipe criarEquipe(String nome,String dataFundacao,String pais) {
		Equipe equipe = new Equipe();
		equipe.setNome(nome);
		equipe.setDataFundacao(dataFundacao);
		equipe.setPais(pais);
		return equipe;
	}

}
