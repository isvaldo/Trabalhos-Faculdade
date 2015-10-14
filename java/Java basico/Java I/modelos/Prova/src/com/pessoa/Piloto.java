package com.pessoa;

public class Piloto {
	 
	 private int id; 
	 private String nome; 
	 private int idade; 
	 private String nacionalidade; 
	 private int numerosTitulos;  
	 
	 
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
	
	public int getNumerosTitulos() {
		return numerosTitulos;
	}
	
	public void setNumerosTitulos(int numerosTitulos) {
		this.numerosTitulos = numerosTitulos;
	}
	
	
	
	
  @Override
	public String toString() {
		return "Piloto [id=" + id + ", nome=" + nome + ", idade=" + idade
				+ ", nacionalidade=" + nacionalidade + ", numerosTitulos="
				+ numerosTitulos + "]";
	}
  
  
public static Piloto criaPiloto( int id,String nome,int idade,String nacionalidade,int numerosTitulos){
		
		Piloto piloto = new Piloto();
		piloto.setId(id);
		piloto.setNome(nome);
		piloto.setIdade(idade);
		piloto.setNacionalidade(nacionalidade);
		piloto.setNumerosTitulos(numerosTitulos);
		return piloto;
	
	}

  
	 
	 
	 
}