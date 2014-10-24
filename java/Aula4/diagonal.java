
/*
 * Programa para estudar matriz multidimensional
 * 
 * corte diagonal na matriz
 * Saida
1000000000
0100000000
0010000000
0001000000
0000100000
0000010000
0000001000
0000000100
0000000010
0000000001

 */

public  class diagonal {
	public static void main(String[] args) {
		int[][] mvetor = new int [10] [10];
		
		mvetor = setVetor(mvetor);
		mvetor = corte(mvetor);
		mostraVetor(mvetor);
		
		
		
		
		
	}
	
	public static int[][] corte(int[][] vetor) {
		int posicao=0;
		for(int i=0;i<vetor.length;i++) {
			vetor[i][posicao]=1;
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
	
