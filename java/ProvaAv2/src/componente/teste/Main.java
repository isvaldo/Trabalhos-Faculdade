package componente.teste;

import componente.carro.Carro;
import componente.equipe.Equipe;
import componente.piloto.Piloto;

public class Main {
	public static void main(String[] args) {
		
		// Criando Carros
		Carro carroA = Carro.criarCarro("BMW", "rodaMuito", "Shell");
		Carro carroB = Carro.criarCarro("Japon", "FireStreet", "PetroClean");
		
		//Criando Pilotos
		Piloto pilotoA = Piloto.adicionarPiloto(1, "isvaldo", 21, "brasileiro", 1); 
		Piloto pilotoB = Piloto.adicionarPiloto(2, "Link", 16, "Japão", 20); 
		
		// Criando Equipe
		Equipe equipeAlfa = Equipe.criarEquipe("Zueiros", "12/05/1993", "Brasil");
		
		// Colocando carros na equipe
		equipeAlfa.adicionarCarro(carroA, 0);
		equipeAlfa.adicionarCarro(carroB, 1);
		
		// Colocando pilotos na equipe
		equipeAlfa.adicionarPilotoEquipe(pilotoA, 0);
		equipeAlfa.adicionarPilotoEquipe(pilotoB, 1);
		
		// mostra melhor piloto
		equipeAlfa.mostraMelhorPiloto();
		
		//Adiciona titulo ao melhor piloto
		equipeAlfa.adicionaTitulo(equipeAlfa.getMelhorPiloto().getId());
		
		// troca os carros
		equipeAlfa.trocaCarro();
		
		// mostra melhor piloto novamente
		equipeAlfa.mostraMelhorPiloto();
		
		
		
		
		
	}
}
