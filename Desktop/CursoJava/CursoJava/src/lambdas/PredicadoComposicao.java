package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {

		Predicate<Integer> isPAr = num -> num % 2 == 0;
		Predicate<Integer> tresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPAr.and(tresDigitos).test(122));
		System.out.println(isPAr.or(tresDigitos).test(123));
		System.out.println(isPAr.and(tresDigitos).negate().test(122));
	}
}
