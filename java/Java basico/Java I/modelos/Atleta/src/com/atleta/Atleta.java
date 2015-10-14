package com.atleta;

import com.status.Modalidade;

public class Atleta {
	// atributos da classe, são private para manter a integridade dos dados
	// somente é possivel acessar atravez de getter setter, respeitando
	// encapsulamento
	private String nome;
	private int idade;
	private String sexo;
	private Modalidade modalidade;
	private int fama;

	// getter e setter da classe, são metodos de acesso
	// aos atributos da classe
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public int getFama() {
		return fama;
	}

	public void setFama(int fama) {
		this.fama = fama;
	}

	// metodo para criar atleta

	public static Atleta criarAtleta(String nome, int idade, String sexo,
			Modalidade modalidade, int fama) {

		Atleta atleta = new Atleta();
		atleta.setNome(nome);
		atleta.setIdade(idade);
		atleta.setSexo(sexo);
		atleta.setModalidade(modalidade);
		atleta.setFama(fama);
		return atleta;

	}

	// retorna maior atleta

	public static Atleta maiorSalario(Atleta[] vet) {
		double maior = Double.MIN_VALUE;
		Atleta maiorAtleta = new Atleta();
		for (Atleta atleta : vet) {
			if (atleta.getModalidade().getSalarioMedio() > maior) {
				maior = atleta.getModalidade().getSalarioMedio();
				maiorAtleta = atleta;
			}

		}
		return maiorAtleta;
	}

	// retorna maior atleta

	public static Atleta maiorFama(Atleta[] vet) {
		double maior = Double.MIN_VALUE;
		Atleta maiorFama = new Atleta();
		for (Atleta atleta : vet) {
			if (atleta.getFama() > maior) {
				maior = atleta.getFama();
				maiorFama = atleta;
			}

		}
		return maiorFama;
	}

}
