package com.modalidade;

public class Modalidade {

	
	// propriedades
private String nome;
private int salarioMedio;

	// Get Set
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getSalarioMedio() {
	return salarioMedio;
}
public void setSalarioMedio(int salarioMedio) {
	this.salarioMedio = salarioMedio;
}

public static Modalidade cadastraModalidade(String nome, int salarioMedio) {
	Modalidade modalidade  = new Modalidade();
	modalidade.setNome(nome);
	modalidade.setSalarioMedio(salarioMedio);
	return modalidade;
}





}
