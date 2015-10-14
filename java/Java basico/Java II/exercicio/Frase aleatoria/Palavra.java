package av2.palavra;

import java.util.Random;

public class Palavra {
	
	private String palavra;
	private int tamanho;
	private final static int MAXCHAR = 122;
	private final static int MINCHAR = 97;
	private final static int MINWORD = 2;
	
	/*Criando palavra com tamanho minimo*/
	 Palavra(){
		this(MINWORD);
	}
	
	/* Criando palavra com tamanho passado por parametro*/
	Palavra(int tamanho){
		this.setTamanho(tamanho);
		this.fabric();
		
	}
	
	
	/* Criar uma palavra com base no tamanho
	 * utilizando tabela ascii
	 * */
	public void fabric(){
		
		int tamanho = this.getTamanho();
		StringBuilder sb_rascunho = new StringBuilder(tamanho);
		int rd_char;
		for(int w=0;w<tamanho; w++){
			rd_char = new Random().nextInt(MAXCHAR - MINCHAR + 1) + MINCHAR;
			
			sb_rascunho.append((char) rd_char);
		}
		
		this.setPalavra(sb_rascunho.toString());
		
		
	}
	
	
	/*Get set Zone*/


	public String getPalavra() {
		return palavra;
	}




	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}




	public int getTamanho() {
		return tamanho;
	}




	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

    /*
     * Representação da classe
     * */
	@Override
	public String toString() {
		return this.getPalavra();
	}
	
	
	
	

}
