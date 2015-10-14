package teste;

import java.util.ArrayList;

public class Main {


	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String> ();


		for(int i=0;i<10;i++){
			nomes.add("isvaldo"+i+" Fernandes"+i);	
		}



		for (String nome : nomes) {

			System.out.println(nome);

		}



		for (String nome : nomes) {

			System.out.println(nome.toUpperCase());

		}



		for (String nome : nomes) {

			System.out.println(nome.toLowerCase());

		}


		
		
		for (String nome : nomes) {
			String[] nomex = nome.split(" ");
			nome = nomex[0]+nomex[1];
			System.out.println(nome);
		}
		
		
		for (String nome : nomes) {

			System.out.println(nome.replaceAll("a", "4"));

		}
		
		
		for (String nome : nomes) {
	
			System.out.println(nome.replaceAll("an", "JAVA2"));

		}
		
		
		for (String nome : nomes) {
			
			if (nome.split(" ")[0].startsWith("A"))
				System.out.println(nome);

		}
		
          for (String nome : nomes) {
			
			if (nome.endsWith(""))
				System.out.println(nome);

		}
		
          for (String nome : nomes) {
  			
  			if (nome.split(" ")[1].startsWith("A"))
  				System.out.println(nome);
  		}



	}


}
