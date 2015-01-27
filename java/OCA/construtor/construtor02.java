package a.b.c;

 public class D {
	 D() {
		 System.out.println("construtor");
	 }
	 
	 void D() {
		 System.out.println("metodo");
	 }
	 
	 
	 public static void main(String... args) {
		new D(); // valido construtor
		new D().D(); // valido metodo
		
		 
	}
 }









