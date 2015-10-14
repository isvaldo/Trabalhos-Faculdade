import com.atleta.Atleta;
import com.status.Modalidade;


public class Main {

	public static void main(String[] args) {
		
		Modalidade model1 = Modalidade.criarModalidade("skate", 3000);
		Modalidade model2 = Modalidade.criarModalidade("pimbal", 1000);
		Modalidade model3 = Modalidade.criarModalidade("Tiro alvo", 9000);
		Modalidade model4 = Modalidade.criarModalidade("cuspe a distancia", 2000);
		Modalidade model5 = Modalidade.criarModalidade("bolinha de papel no bruno", 1000);
		
		Atleta[] listaAtleta = new Atleta[5];
		listaAtleta[0] = Atleta.criarAtleta("isvaldo",21,"M",model1,10);
		listaAtleta[1] = Atleta.criarAtleta("carlos",25,"M",model2,25);
		listaAtleta[2] = Atleta.criarAtleta("guilherme",30,"M",model3,30);
		listaAtleta[3] = Atleta.criarAtleta("diego",19,"M",model4,44);
		listaAtleta[4] = Atleta.criarAtleta("marcio",24,"M",model5,99);
		
		for (Atleta atleta: listaAtleta){
			System.out.println("");
			System.out.println("Nome:"+atleta.getNome());
			System.out.println("Idade:"+atleta.getIdade());
			System.out.println("Sexo:"+atleta.getSexo());
			System.out.println("Fama:"+atleta.getFama());
			System.out.println("Modalidade: "+atleta.getModalidade().getNome());			
			
		}
		System.out.println("");
		System.out.println("Maior Fama: "+Atleta.maiorFama(listaAtleta).getNome()+"fama = "+Atleta.maiorFama(listaAtleta).getFama());
		System.out.println("Maior Salario: "+Atleta.maiorSalario(listaAtleta).getNome()+" Salario: "+Atleta.maiorSalario(listaAtleta).getModalidade().getSalarioMedio());
		
		
		
		
		
	}
}
