package aula01;

public class Pessoa {
	private int idade;
	private String nome;
	private int peso;
	private int altura;
	private String sexo;

Pessoa(int altura, int peso) {
	this.altura = altura;
	this.peso = peso;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(18,19);
		System.out.println(pessoa);
		
		
	}
	
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + ", peso=" + peso
				+ ", altura=" + altura + ", sexo=" + sexo + "]";
	}
	
}
