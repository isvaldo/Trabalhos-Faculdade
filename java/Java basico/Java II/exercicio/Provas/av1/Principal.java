import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Principal {
	private final static int MAXREAD = 5;
	private final static String FINALZ = "z";
	private final static int RAZAO= 3;

	public static void main(String[] args) {
		// le 100 numeros e imprime os pares
		lerUsuario();
		
		// imprime nomes com n palavras ou nomes cujo o primeiro
		// termina em z
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Isvaldo");
		nomes.add("Thiago da silva pereira");
		nomes.add("Robert lucas amaldiçoado");
		nomes.add("Zicoz silva");
		
		System.out.println(filtraTamanho(nomes,3));

		// cria uma pa, e testa se funciona com uma razão definida
		ArrayList<Integer> seq = new ArrayList<>();
		
		for (int j=0;j<10;j=j+RAZAO){
			seq.add(j);
		}
		System.out.println(eProgressao(seq, RAZAO));


	}

	public static void lerUsuario(){
		// cria uma lista, declara objeto de leitura
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 100 Numeros Seguidos");
		// faz a leitura de todos itens
		while(lista.size() != MAXREAD)
			lista.add(sc.nextInt());
		sc.close();
		// inverte a lista
		Collections.reverse(lista);
		// imprime só os pares
		for (Integer n : lista){
			if (n%2==0)
				System.out.println(n);
		}
	}

	public static ArrayList<String> filtraTamanho(ArrayList<String> lista,int tamanho) {
		ArrayList<String> newLista = new ArrayList<>();
		for (String s : lista) {
			// quem não satisfazer a condição sai da lista
			if (
					(s.split(" ").length > tamanho) || (s.split(" ")[0].endsWith(FINALZ))
					)
				newLista.add(s);
		}
		// a propria lista e retornada
		return newLista;
	}

	// verifica se a lista é uma PA
	public static boolean eProgressao(ArrayList<Integer> seq,int razao){
		// primeiro termo
		int ant = seq.get(0);
		for (int i = 1;i<seq.size();i++){
			if (seq.get(i) - razao == ant){
				ant = seq.get(i);
			}else{
				return false;
			}
		}
		return true;
	}



}
