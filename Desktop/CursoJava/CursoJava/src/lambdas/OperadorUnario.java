package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		// OPERADOR UNARIO,, ESSE OPERADO PODE SE LIGADO EM SEQUÊNCIA FACILMENTE;
		UnaryOperator<Integer> maisDois = num -> num+2;
		UnaryOperator<Integer> vezesDois = num -> num*2;
		UnaryOperator<Integer> aoQuadrado = num -> num*num;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
					.andThen(aoQuadrado)
						.apply(10);
				
		int resultado2 = aoQuadrado
				.compose(vezesDois)
					.compose(maisDois)
						.apply(10);
				
		System.out.println(resultado1);
		System.out.println(resultado2);
	}
}
