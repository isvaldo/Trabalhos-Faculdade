package com.status;

public class Modalidade {
	// atributos da classe, são private para manter a integridade dos dados
	// somente é possivel acessar atravez de getter setter, respeitando
	// encapsulamento
	private String nome;
	private double salarioMedio;

	// getter e setter da classe, são metodos de acesso
	// aos atributos da classe

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioMedio() {
		return salarioMedio;
	}

	public void setSalarioMedio(double salarioMedio) {
		this.salarioMedio = salarioMedio;
	}

	// criar metodo parar criar modalidade

	public static Modalidade criarModalidade(String nome, double salarioMedio) {
		Modalidade modalidade = new Modalidade();
		modalidade.setNome(nome);
		modalidade.setSalarioMedio(salarioMedio);
		return modalidade;

	}

}
