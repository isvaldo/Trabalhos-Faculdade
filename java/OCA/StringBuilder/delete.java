public class D {
	public static void main(String[] args) {
	StringBuilder texto = new StringBuilder("ola").insert(0,"1");
	texto.delete(0, 2);
	System.out.println(texto);
	}

	
}
