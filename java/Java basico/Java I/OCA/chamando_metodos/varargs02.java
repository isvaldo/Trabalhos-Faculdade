
/// class  tem metodo com varargs que printa o tamanho do vetor
class B {
	void x(int... x) {
		System.out.println(x.length);
	}
}

// class de teste
class A{
	public static void main (String ... args){
	//  chama o metodo x de B passando um novo vetor com 2 argumentos
		new B().x(new int[]{123123,123313});
	}
