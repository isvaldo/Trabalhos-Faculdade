package com.atleta;

import com.modalidade.Modalidade;

public class Atleta {
	
	// Definindo as variaveis
	private String nome;
	private int idade;
	private String sexo;
	private int fama;
	private Modalidade modalidade;
	
	public int getFama() {
		return fama;
	}
	public void setFama(int fama) {
		this.fama = fama;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	// Get e Sets
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
	
	// metodo para criar um atleta
	public static Atleta cadastrarAtleta(String nome, int idade, String sexo, int fama, Modalidade modalidade) {
		Atleta atleta = new Atleta();
		atleta.nome = nome;
		atleta.idade = idade;
		atleta.sexo = sexo;
		atleta.fama = fama;
		atleta.modalidade = modalidade;
		return atleta;
	}
	
}
