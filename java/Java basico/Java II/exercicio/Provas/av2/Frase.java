package estudo.frase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import estudo.palavra.Palavra;

public class Frase {
	/*
	 * Frases precisam ser maiores que 2 caracteres por definição
	 *
	 * */
	private String frase;
	private int QtChar;
	private static final int MAXFRASELENGTH = 100;
	private static final int MINFRASELENGTH = 2;

	/* Constroi uma frase com tamanho aleatorio*/
	public Frase(){
		this(new Random().nextInt(MAXFRASELENGTH - MINFRASELENGTH)+ MINFRASELENGTH);
	}
	/* Constroi uma frase com tamanho de caracteres definido*/
	public Frase(int QtChar){
		this.setQtChar(QtChar);
		this.make();
	}


	/*montador*/
	public void make(){
		StringBuilder sb_mount = new StringBuilder(this.getQtChar());
		int rd_partOfLength = 0;
		// variavel de controle pare ser o tamanho maximo da nossa proxima palavra
		int fake_QtChar = this.getQtChar();
		while(sb_mount.length() <= this.getQtChar()){
			/*
			 *esse codigo escolhe um numero aleatorio até o maximo que falta para terminar a quantidade limite
			 *ex,se a frase tem 100 de limite, para cada chamada e escalonado um numero entre 0 e 100
			 *na proxima vai ser 0 a (100-numero_escolhido_aleatoriamente)
			 *na proxima vai ser 0 (resto_que_sobrou - numero_escolhido_aleatoriamente)
			 *até chegar perto da frase que queremos, caso utrapasse cortamos um pedacinho rs 
			 **/

			rd_partOfLength = new Random().nextInt(fake_QtChar - MINFRASELENGTH + 1)+ MINFRASELENGTH;
			fake_QtChar = fake_QtChar - rd_partOfLength;
			if (fake_QtChar == 1){
				fake_QtChar++;
			}
			sb_mount.append(new Palavra(rd_partOfLength));
			sb_mount.append(" ");

		}
		this.setFrase(sb_mount.toString().substring(0, this.getQtChar()));

	}
	/*
	 * Frequency conta quantas vezes uma palavra
	 * aparece em uma frase
	 * */
	public int frequency(String word){
		ArrayList<String> words = new ArrayList<>();
		words.addAll(Arrays.asList(this.getFrase().split(" ")));
		return Collections.frequency(words,word);
	}

	/*mostra palavras maiores que :param tamanho caracteres na frase*/
	public ArrayList<String> getLength(int tamanho) {
		ArrayList<String> words = new ArrayList<String>();
		// percorrendo todas as palavras da frase, quem for maior que :param tamanho entra na lista
		for (String s : this.getFrase().split(" ")){
			if (s.length()> tamanho) {
				words.add(s);
			}
		}
		// retorna o arraylist com todas palavras maiores que :param tamanho
		return words;

	}
	
	/*
	 * Replace
	 * */
	public void replace(char oldChar, char newChar){
		this.setFrase(this.getFrase().replace(oldChar, newChar));
	}

	/*Get set zone*/
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public int getQtChar() {
		return QtChar;
	}
	public void setQtChar(int qtChar) {
		QtChar = qtChar;
	}
	@Override
	public String toString() {
		return this.getFrase();
	}



}
