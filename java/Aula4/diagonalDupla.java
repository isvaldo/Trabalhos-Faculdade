
/*
 * Programa para estudar matriz multidimensional
 * 
 * corte nas duas diagonais
 * Saida
1000000001
0100000010
0010000100
0001001000
0000110000
0000110000
0001001000
0010000100
0100000010
1000000001


 */

public  class diagonalDupla {
	public static void main(String[] args) {
		int[][] mvetor = new int [10] [10];
		
		mvetor = setVetor(mvetor);
		mvetor = corte(mvetor);
		mostraVetor(mvetor);
		
		
		
		
		
	}
	
	public static int[][] corte(int[][] vetor) {
		int posicao = 0;
		int posicao2 = vetor[0].length-1;
		for(int i=0;i<vetor.length;i++) {
			vetor[i][posicao]=1;
			vetor[i][posicao2]=1;
			posicao2--;
			posicao++;
		}
		return vetor;
	}
	// Essa função preenche todas as possições do vetor
	public static int[][] setVetor(int[][]vetor) {
		for(int i=0;i<vetor.length;i++) {
			for(int j=0;j < vetor[i].length;j++) {
				vetor[i][j] = 0;
			}
		}
		return vetor;
	}
	// essa função mostra o vetor em forma de matriz
	public static void mostraVetor(int[][]vetor){
		for (int i=0;i<vetor.length;i++) {
			System.out.print("\n");
			for (int j=0;j<vetor[i].length;j++) {
				System.out.print(vetor[i][j]);			
			}
		}
	
	
}

}
	
