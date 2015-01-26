package a.b.c;


public class D {
	public static void main(String[] args) {
		strange(new String("ola"),new Object(),new Object());
	}

	public static void strange(Object... ob) {
		for (Object b : ob){
			System.out.println(b);
		}
	}	
}
