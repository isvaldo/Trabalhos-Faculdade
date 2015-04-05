package estudo.principal;

import java.util.ArrayList;
import java.util.Collections;

import estudo.frase.Frase;

public class Principal {
	public final static int MAXFRASE = 50;
	public final static int MAXWORD = 8;
	public final static char TESTCHAR = 'a';
	public static void main(String[] args) {
		
		//Criando uma frase
		Frase lero = new Frase(MAXFRASE);
		
		// uma frase aleatoria, implica na dificuldade de gerar coisas iguais
		// para testar nossa aplicação, vamos forçar uma frase com 8 palavras
		// assim forçando agrupamentos
		
		while (!(lero.toString().split(" ").length > MAXWORD)) {
			lero = new Frase(MAXFRASE);
		}
		// mostrando a frase em caso de duvida
		System.out.println("Frase: "+lero);
		
		// usando o replace artificial para forçar duplicatas, transformando tudo em 'a'
		for(int i = 97;i<=122;i++){
			lero.replace((char)i,TESTCHAR);
		}
	
		
		
		// Pegando todas palavras da frases maiores que 3 caracteres, usando ArrayList
		ArrayList<String> maiores = lero.getLength(2);
		System.out.println("maiores que 2: "+maiores);
		// Mostrando as que repetem, e sua quantidade de repetições
		ArrayList<String> iguais = new ArrayList<>();
		// Mostrando a quantidade 
		for (String s : maiores) {
			// usa uma lista auxiliar para registrar a primeira ocorrencia
			if (!(Collections.frequency(iguais, s) > 0)){
				iguais.add(s);
				int maiores_repet = Collections.frequency(maiores, s);
				if(maiores_repet > 1) {
				System.out.println("String: "+s+" repete:"+maiores_repet+"");
				}
			}
			
			
		}
		
		
		
	}
	
	

}
