class B {
	void x(Object... x) {
		System.out.println(x.length);
	}
}


class A{
	public static void main (String ... args){
	// objeto se passando por array, absurdo kkk
		new B().x(new Object[]{123123,123313});
	}
	
}
