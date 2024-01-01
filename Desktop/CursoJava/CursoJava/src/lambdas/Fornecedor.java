package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		//		No lugar do List pode se usar um Object;
		Supplier<List<String>> umLista = () -> Arrays.asList("Edu", "Fer");
		
		System.out.println(umLista.get());
	}
}
