import com.atleta.Atleta;
import com.modalidade.Modalidade;


public class Main {

	public static void main(String[] args) {
		
		Modalidade model1 = Modalidade.cadastraModalidade("Skate", 50000);
		Modalidade model2 = Modalidade.cadastraModalidade("Patinete", 5564600);
		Modalidade model3 = Modalidade.cadastraModalidade("Futebol", 5004546);
		Modalidade model4 = Modalidade.cadastraModalidade("Hacker", 51650);
		Modalidade model5 = Modalidade.cadastraModalidade("Programador pog", 54654);
		
		
			
		Atleta atleta1 = Atleta.cadastrarAtleta("isvaldo", 18, "F", 666, model1);
		Atleta atleta2 = Atleta.cadastrarAtleta("Paulo", 19, "F", 454, model2);
		Atleta atleta3 = Atleta.cadastrarAtleta("Lucas", 24, "F", 999, model3);
		Atleta atleta4 = Atleta.cadastrarAtleta("pedro", 15, "F", 648, model4);
		Atleta atleta5 = Atleta.cadastrarAtleta("amarildo", 11, "F", 1, model5);
		
		
	}
	
}
