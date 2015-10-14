package com.booble.operacional;

public class FolhadePagamento {
	
	// Declarando atributos como private para manter a integridade dos dados
	// somente pode  acessado via getter e setter, cumprindo o encapsulamento
	private int ano;
	private int mes;
	// publico para que seja possivel o acesso fora da class
	public int numeroSerie;
	private Colaborador[] listaColaborador = new Colaborador[3];

	
	// Gettser setter
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public Colaborador[] getListaColaborador() {
		return listaColaborador;
	}
	public void setListaColaborador(Colaborador[] listaColaborador) {
		this.listaColaborador = listaColaborador;
	}
	
	// criando um colaborador
	public void cadastrarColaborador( String nome,
			int matricula,
			int idade,
			String sexo,
			int tipoContrato,
			int cargaHoraria,
			int indice) {
		// criando o objeto colaborador
		Colaborador colaborador = new Colaborador();
		// setando os valores de colaborador
		colaborador.setNome(nome);
		colaborador.setMatricula(matricula);
		colaborador.setIdade(idade);
		colaborador.setSexo(sexo);
		colaborador.setTipoContrato(tipoContrato);
		colaborador.setCargaHoraria(cargaHoraria);
		// adicionando o colaborador na lista, com o indice
		this.listaColaborador[indice] = colaborador;
		
		
		
		
	}
	 
	
	
	


}
