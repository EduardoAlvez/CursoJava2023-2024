package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String agrs[]) {
		
		Predicate<Produto> isCaro = prod -> false;
		
		Produto produto = new Produto("Lampada",30.0,0.10);
		
		System.out.println(isCaro.test(produto));
	}

}
