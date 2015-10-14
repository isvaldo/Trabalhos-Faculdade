package com.equipe;

import com.pessoa.Piloto;
import com.maquina.Carro;


public class Equipe {

	private String pais;
	private String nome;  // "isvaldo"
	private String dataFundacao; //"02-02-2014"

	private Piloto[] pilotos = new Piloto[2];
	private Carro[] carros = new Carro[2];

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
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
	public Piloto[] getPiloto() {
		return pilotos;
	}
	public void setPiloto(Piloto[] piloto) {
		this.pilotos = piloto;
	}
	public Carro[] getCarro() {
		return carros;
	}
	public void setCarro(Carro[] carro) {
		this.carros = carro;
	}

	public void associarPiloto(Piloto piloto,int indice){
		this.pilotos[indice] = piloto; 

	}
	public void associarCarro(Carro carro,int indice){
		this.carros[indice] = carro; 

	}

	public void  trocarCarros(){
		Carro aux = this.carros[0];
		this.carros[0] = this.carros[1];
		this.carros[1] = aux;
	}

	public void adicionaVitoria(int id){
		int vitoriasAnteriores;
		for(int i=0; i<this.pilotos.length;i++){
			if (this.pilotos[i].getId() == id){
				vitoriasAnteriores = this.pilotos[i].getNumerosTitulos();
				this.pilotos[i].setNumerosTitulos(vitoriasAnteriores+1);
			}
		}
	}
	
	public int getIndiceMelhorPiloto(){
		int maior = Integer.MIN_VALUE;
		int indice = 0;
		for(int i=0; i<this.pilotos.length;i++){
			
			if (this.pilotos[i].getNumerosTitulos()>maior) {
				maior = this.pilotos[i].getNumerosTitulos();
				indice = i;
				
			}
			
			
		}
		return indice;
	}
	
	public  void mostraMelhorPiloto() {
		int indice = getIndiceMelhorPiloto();
		System.out.println(this.pilotos[indice].toString());
		System.out.println(this.carros[indice].toString());
		System.out.println("\n");
		
	}
	
	public static Equipe criarEquipe(String pais, String nome, String dataFundacao) {
		
		Equipe equipe = new Equipe();
		equipe.setPais(pais);
		equipe.setNome(nome);
		equipe.setDataFundacao(dataFundacao);
		return equipe;
	}
	
	
	
	
	


}
