/*
 * Programa para estudar matriz multidimensional
 */

public  class matriz {
	public static void main(String[] args) {
		int[][] mvetor = new int [4] [8];
		
		mvetor = setVetor(mvetor);
		
		mostraVetor(mvetor);
		
		
		
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
	

