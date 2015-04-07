package prova.palavra;

import java.util.ArrayList;
import java.util.Random;

public class PalavraAleatoria {
	
	
		/*Constantes
		 * :const MAXWORD Tamanho maximo da palavra
		 * :const MINWORD Tamanho minimo da palavra
		 * :const MAXCHAR char z na tabela ascii
		 * :const MINCHAR char a na tabela ascii
		 * :param String palavra gerada pela classe
		 * :param String caixa controla maiusculo/minusculo*/
		private String palavra;
		private String caixa;
		private static final int MAXWORD = 10;
		private static final int MINWORD = 4;
		private static final int MAXCHAR = 122;
		private static final int MINCHAR = 97;
		private static final String LOW = "LOW";
		private static final String HIGH = "HIGH";
		
		
		/* Cria uma palavra aleatoria com caixa baixa
		 * Esse construtor default chama o outro para continuar o processo*/
		public PalavraAleatoria() {
			this(LOW);
		}
		
		/*Cria uma palavra com caixa passada por parametro*/
		public PalavraAleatoria(String caixa){
			this.setCaixa(caixa);
			this.make();
		}
		
		/* Gera uma palavra aleatoria*/
		private void make(){
			int tamanho = new Random().nextInt(MAXWORD - MINWORD +1) + MINWORD;
			
			StringBuilder sb_palavra = new StringBuilder(tamanho);
			// monta caracter a caracter da palavra
			while(sb_palavra.length() != tamanho) {
				//faz um casting do inteiro que fica no ranger da tabela ascii
				char c = (char) (new Random().nextInt((MAXCHAR - MINCHAR) +1) + MINCHAR );
				sb_palavra.append(c);
			}
			// aplica caixa a palavra
			if (this.getCaixa() == HIGH){
				this.palavra = sb_palavra.toString().toUpperCase();
			}else if (this.getCaixa() == LOW){
				this.palavra = sb_palavra.toString().toLowerCase();
			}else{
				// canela operação caso parametro de caixa invalido
				this.palavra = "ERRO";
			}
				
		}
		/*chama o make  novamente gerando uma nova palavra igual random o/ uhull*/
		public String nextPalavra(){
			this.make();
			return this.toString();
		}
		
		/*Cria palavras em lote
		 * :param n quantidade de palavras
		 * :return ArrayList com todas as palavras
		 * */
		public ArrayList<String> MakeLote(int n) {
			// valor default para lote
			if (this.getCaixa() == null){
				this.setCaixa(LOW);
			}
			// criando uma lista de palavras
			ArrayList<String> palavras = new ArrayList<>();
			// cada interação uma nova palavra é adicionada (:
			for (int i=0;i<n;i++)
				palavras.add(this.nextPalavra());
			
			return palavras;
		}

		public String getPalavra() {
			return palavra;
		}

		public void setPalavra(String palavra) {
			this.palavra = palavra;
		}
		

		
		public String getCaixa() {
			return caixa;
		}

		public void setCaixa(String caixa) {
			this.caixa = caixa;
		}

		/*Representação da classe
		 * isso evita ter que chamar um metodo para
		 * voltar a palavra*/
		@Override
		public String toString() {
			return this.palavra;
		}
		
	}


