package com.booble.operacional;

public class Colaborador {
	// Declarando atributos como private para manter a integridade dos dados
	// somente pode  acessado via getter e setter, cumprindo o encapsulamento
	private String nome;
	private int matricula;
	private int idade;
	private String sexo;
	private int tipoContrato;
	private int cargaHoraria;
	
	
	// Getter Setter  metodos de acesso aos atributos privados
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
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
	public int getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(int tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	
	
}
