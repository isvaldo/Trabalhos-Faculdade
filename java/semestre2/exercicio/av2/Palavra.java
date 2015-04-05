package estudo.palavra;

import java.util.Random;

public class Palavra{
	/*os atributos armazenam a palavra e seu tamanho*/
	private String palavra;
	private int tamanho;
	private static final int MAXWORD = 100;
	private static final int MAXCHAR = 122;
	private static final int MINCHAR = 97;
	
	
	/* sorteria uma palavra aleatoriamente*/
	Palavra() {
		this(new Random().nextInt(MAXWORD));
	}
	
	/*Sorteia uma palavra com  tamnho especifico*/
	public Palavra(int tamanho){
		this.setTamanho(tamanho);
		this.make();
	}
	
	/* Esse metodo deve construir nossa palavra, com base no att tamanho*/
	private void make(){
		
		tamanho = this.getTamanho();
		StringBuilder sb_palavra = new StringBuilder(tamanho);
		// monta caracter a caracter da palavra
		while(sb_palavra.length() != tamanho) {
			// isso gera um numero entre 97 a 122, reperesentando um char a-z
			char c = (char) (new Random().nextInt((MAXCHAR - MINCHAR) +1) + MINCHAR );
			sb_palavra.append(c);
		}
		// retorna a palavra já montada
		this.palavra = sb_palavra.toString();
			
	}
	/*chama o make  novamente gerando uma nova palavra*/
	public String nextPalavra(){
		this.make();
		return this.toString();
	}

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

	
	/*Representação da classe*/
	@Override
	public String toString() {
		return this.palavra;
	}
	
}
