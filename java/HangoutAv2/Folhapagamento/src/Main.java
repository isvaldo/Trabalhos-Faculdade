import com.booble.adm.RH;
import com.booble.operacional.Colaborador;
import com.booble.operacional.FolhadePagamento;

public class Main {

	public static void main(String[] args) {
		RH.exibirStatus();
		
		FolhadePagamento folha = new FolhadePagamento();
		
		folha.cadastrarColaborador("marcio",001, 18, "F", 1, 8, 0);
		folha.cadastrarColaborador("joão",010, 26, "M", 2, 6, 1);
		folha.cadastrarColaborador("Renato",011, 15, "M", 3, 8, 2);
		
		
		for (Colaborador colaborador : folha.getListaColaborador()) {
			System.out.println("");
			System.out.println("Nome: "+colaborador.getNome());
			System.out.println("Salario:"+ colaborador.getCargaHoraria()*RH.determinarPagamento(colaborador.getTipoContrato()));
		}
		
		
		
		
		
	}
}
