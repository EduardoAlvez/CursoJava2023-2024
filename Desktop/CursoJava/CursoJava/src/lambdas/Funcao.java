package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Integer nume = 91;
		Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Impar";

		Function<String, String> formatado = tring -> "O número é " + tring;

		Function<String, String> exclamacao = tring -> tring + " !!!";

		Function<String, String> interrogacao = tring -> tring + " ???";

		System.out.println(parOuImpar.apply(nume));
		System.out.println(parOuImpar.andThen(formatado).apply(nume));
		System.out.println(parOuImpar.andThen(formatado).andThen(exclamacao).apply(nume));

		
		String resultadoFinal = parOuImpar.andThen(formatado).andThen(exclamacao).apply(nume);
		System.out.println(resultadoFinal);

		String resultadoFinal2 = parOuImpar.andThen(formatado).andThen(interrogacao).apply(nume);
		System.out.println(resultadoFinal2);
	}
}
