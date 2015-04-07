package prova.biscoito;

import java.util.ArrayList;
import java.util.Collections;


public class BiscoitoDaSorte {
	
	/* Classe BiscoitoDaSorte
	 * :param nome o nome do biscoito
	 * :param Tipo enuns para tipo de biscoito
	 * :param Forma enuns para a forma do biscoito
	 * :param palavra lista de palavras
	 * */
	private String nome;
	private Tipo tipo;
	private Forma forma;
	private ArrayList<String> palavras = new ArrayList();
	
	
	/* Construtor, carregsa os atributos do objeto na classe*/ 
	public BiscoitoDaSorte(String nome, prova.biscoito.Tipo tipo,
			prova.biscoito.Forma forma, ArrayList<String> palavras) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.forma = forma;
		this.palavras = palavras;
		// verifica iguais
		this.checkDuplicate();
	}
	
	/* Verifica a ocorrencia de palavras iguais
	 * Privato por que o uso é somente interno
	 * */
	private void checkDuplicate(){
		for (String s: this.getPalavras()) {
			if(Collections.frequency(this.getPalavras(),s) > 1){
				System.out.println("Ops, palavras iguais");
			}
		}
		
	}
	
	/*Imprime todas as palavras na tela
	 * em segundo momento subistitui todos os caracteres
	 * por "**" e  mostra na tela 
	 * */
	public void printBiscoito(){
		// mostra todas as palavras
		for(String s : this.getPalavras()){
			System.out.println(s);
		}
		
		for(String s : this.getPalavras()){
			//replace em minusculos
			for (int i = 97;i<=122;i++)
				s = s.replace((char) i, '*');
			
			//replace em minusculos
			for (int i = 65;i<=90;i++)
				s = s.replace((char) i, '*');
			System.out.println(s);
			
		}
		
	}
	/* GET SET*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Forma getForma() {
		return forma;
	}

	public void setForma(Forma forma) {
		this.forma = forma;
	}

	public ArrayList<String> getPalavras() {
		return palavras;
	}

	public void setPalavras(ArrayList<String> palavras) {
		this.palavras = palavras;
	}

	@Override
	public String toString() {
		return "BiscoitoDaSorte [nome=" + nome + ", tipo=" + tipo + ", forma="
				+ forma + ", palavras=" + palavras + "]";
	}
	
	
	
	
	

}
