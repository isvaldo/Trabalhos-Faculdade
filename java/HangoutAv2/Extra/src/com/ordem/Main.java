package com.ordem;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Tamnho do vetor? ");
		Scanner ler = new Scanner(System.in);    
		int tamanho = ler.nextInt();
		
		
		int [] vetor = Gerador.gerarVetor(tamanho);
		
		int [] vetor2 = Gerador.gerarVetorOrdenado(tamanho);
		
		
		for (int item: vetor2) {
			System.out.println(item);
		}
		
		
		
		
	}
    
    
	
	
	

}
