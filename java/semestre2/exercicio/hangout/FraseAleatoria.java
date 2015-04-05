package av2.palavra;
import java.util.Collections;
import java.util.Random;


public class FraseAleatoria {
	private String frase;
	private int tamanho;
	private final static int MAXFRASE = 100;
	private final static int MINFRASE = 25;
	private final static int MAXWORD = 15;
	private final static int MINWORD = 2;
	
	
	/*
	 * Criar uma frase padrão com minimo caracteres
	 * */
	FraseAleatoria(){
		this(MINFRASE);
		
	}
	
	/*
	 * Criar uma frase com o tamanho de caracteres
	 * passados por parametro
	 * */
	FraseAleatoria(int tamanho){
		this.setTamanho(tamanho);
		this.fabric();
		
	}
	
	
	/* Criando uma frase aleatoria*/
	public void fabric() {
		StringBuilder sb_frase = new StringBuilder();	
		int rd_word;
	
		while (sb_frase.length() <= this.getTamanho()){
			rd_word = new Random().nextInt(MAXWORD - MINWORD + 1) + MINWORD;
			sb_frase.append(new Palavra(rd_word));
			sb_frase.append(" ");
		}
		

		this.setFrase(sb_frase.toString().substring(0, this.getTamanho()));
		
		
		
	}
	

	/* Get Set Zone*/

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return this.getFrase();
	}
	
	
	
	

}
