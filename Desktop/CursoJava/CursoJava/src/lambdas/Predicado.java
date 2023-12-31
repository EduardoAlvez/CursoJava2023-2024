package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String agrs[]) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.valor*(1 -prod.desconto))>= 750;
		
		Produto produto = new Produto("Lampada",30.0,0.10);
		
		System.out.println(isCaro.test(produto));
	}

}
