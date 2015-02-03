package aula2;
public class Cubo {
	public int altura;
	public int largura;
	public int profundidade;
	public String cor;
	public String material;
	
	
	Cubo(int altura,int largura,int profundidade,String cor){
		this.setMaterial("cartolina");
		System.out.println(this);
	}
	
	Cubo(){
		this(30,30,30,"azul");
	}
	
   Cubo(String cor, String material) {
		this.altura = this.largura = this.profundidade = 30;
		this.setCor(cor);
		this.setMaterial(material);                            
		System.out.println(this);
   }

	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getLargura() {
		return largura;
	}


	public void setLargura(int largura) {
		this.largura = largura;
	}


	public int getProfundidade() {
		return profundidade;
	}


	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	
	public static void main(String[] args) {
		new Cubo();
		new Cubo(12,35,47,"amarelo");
		new Cubo("azul","pratico");

	}

	@Override
	public String toString() {
		return "Cubo [altura=" + altura + ", largura=" + largura
				+ ", profundidade=" + profundidade + ", cor=" + cor
				+ ", material=" + material + "]";
	}
	

}
