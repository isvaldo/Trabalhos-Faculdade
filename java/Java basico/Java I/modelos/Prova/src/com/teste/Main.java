package com.teste;

import com.equipe.Equipe;
import com.maquina.Carro;
import com.pessoa.Piloto;

public class Main {
	
	public static void main(String[] args) {
		
		Piloto piloto1 = Piloto.criaPiloto(98, "caio", 18, "Brasileiro", 50);
		Piloto piloto2 = Piloto.criaPiloto(56, "Jossinaldo", 19, "Angolano", 50);
		
		Carro carro1 = Carro.criarCarro("Rapidinho", "veio", "rodaralho", "Shelldow");
		Carro carro2 = Carro.criarCarro("Feloz", "Marco polo", "Pineu", "Michelan");
		
		Equipe equipe = Equipe.criarEquipe("Brazil", "Devagar e mancinhos", "10/12/2014");
		
		equipe.associarCarro(carro1, 0);
		equipe.associarCarro(carro2, 1);
		
		equipe.associarPiloto(piloto1, 0);
		equipe.associarPiloto(piloto2, 1);
		
		equipe.mostraMelhorPiloto();
		
		equipe.adicionaVitoria(98);	
		equipe.trocarCarros();
		equipe.mostraMelhorPiloto();
		
		
		
	}

}
