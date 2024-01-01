package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (num1, num2) -> (num1 + num2) / 2;
		System.out.println(media.apply(8.2, 3.5));
		
		BiFunction<Double, Double, String> media2 = (Double nume1, Double nume2) 
				-> (nume1+nume2)/2 >=7 ? "Aprovado":"Reprovado";
		// OU PODEMOS FAZER...
		BiFunction<Double, Double, String> media21 = (n1,n2) -> {
		double resultado =	(n1+n2)/2;
		return resultado >= 7 ? "Aprovado!":"Reprovado.";
		};	
		
		System.out.println(media21.apply(6.3, 2.3));
		System.out.println(media2.apply(6.3, 2.3));
	}
}
