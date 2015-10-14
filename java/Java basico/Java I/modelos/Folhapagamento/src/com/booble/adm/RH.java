package com.booble.adm;

//mudei metodo de acesso para acessar fora da classe
//class RH {
public class RH {
	// mudei metodo de acesso para acessar fora da classe
	// void exibirStatus() {
	public static void exibirStatus() {
		System.out.println("Iniciando Exibição do Status da Empresa");
		System.out.println("BLAH BLAH BLAH");
		System.out.println("Encerrando Exibição do Status da Empresa");
	}

	// mudei metodo de acesso para acessar fora da classe
	// int determinarPagamento(int tipoDeContrato) {
	public static int determinarPagamento(int tipoDeContrato) {
		int valor = 0;

		switch (tipoDeContrato) {
		case 1:
			valor = 50;
			break;

		case 2:
			valor = 20;
			break;

		default:
			valor = 10;
		}

		return valor;
	}
}
