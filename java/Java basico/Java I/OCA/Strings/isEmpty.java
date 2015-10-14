package a.b.c;

 public class D {
	 public static String msg;
	public static void main(String[] args) {
	// fail,  isEmpty em nulo da NullpointerException
		if(!msg.isEmpty()) {
			System.out.println(msg); 
			
		}else {
			System.out.println("Vazio");
		}
	}

	
}









