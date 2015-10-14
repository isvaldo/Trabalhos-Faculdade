package com.ordem;
import java.util.Random;

public class Gerador {
	
	public static  int[] gerarVetor(int tamanho) {
	 int[] vet = new int[tamanho];
		for (int i =0;i<tamanho-1;i++) {
			Random rand = new Random();
			vet[i] = rand.nextInt(100);
	 }
		return vet;
		
	}
	
	public static int[] gerarVetorOrdenado(int tamanho) {
		 int[] vet = new int[tamanho];
			for (int i =0;i<tamanho-1;i++) {
				Random rand = new Random();
				vet[i] = rand.nextInt(100);
				
		 }
			return  Ordenador.ordenarVetor(vet);
			
		}

}
