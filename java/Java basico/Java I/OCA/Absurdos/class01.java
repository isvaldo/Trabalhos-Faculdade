class $_oOOo_${
	public static void man(String... args){
		int $$=5;
		int __ = $$++;
		// operador "curto circuito" não executa o segundo lado
		// há dois incrimentos em $$ um antecipado e outro normal
		if (__<++$$ || __-->$$)
			System.out.println("A");
		System.out.println($$); // 7
		System.out.println(__); // 5
	}
}
