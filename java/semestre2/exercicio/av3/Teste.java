package prova.testes;

import java.util.ArrayList;
import java.util.Random;

import prova.biscoito.BiscoitoDaSorte;
import prova.biscoito.Forma;
import prova.biscoito.Tipo;
import prova.palavra.PalavraAleatoria;

public class Teste {
	
	public static void main(String[] args) {
		/*Criando uma palavra aleatoria com construtor default*/
		
		System.out.println(new PalavraAleatoria());
		
		/*criando uma palavra em upCase*/
		System.out.println(new PalavraAleatoria("HIGH"));
		
		/*criando palavras em lote*/
		System.out.println(new PalavraAleatoria().MakeLote(3));
		
		/* testando se o tamanho está entre 4 -10*/
		PalavraAleatoria fabric = new PalavraAleatoria();
		for (int i =0;i<1000;i++){
			int p = fabric.nextPalavra().toString().length();
			if (p<4 && p>10) {
				System.out.println("Tamanho errado");
			}
		}
		
		int rd_test = new Random().nextInt(5)+4;
		BiscoitoDaSorte biscoito = new BiscoitoDaSorte(
				"Traqueia",
				Tipo.DOCE,
				Forma.A,
				new PalavraAleatoria().MakeLote(rd_test));
		
		// printando todos os biscoitos
		biscoito.printBiscoito();
		
		/*Testando palavras iguais*/
		ArrayList<String> lista = new ArrayList<>();
		lista.add("isvaldo");
		lista.add("isvaldo");
		lista.add("isvaldo");
		lista.add("isvaldo");
		BiscoitoDaSorte testeduplicata = new BiscoitoDaSorte(
				"Traqueia",
				Tipo.DOCE,
				Forma.A,
				lista);
		
	
			
		
	}

}
