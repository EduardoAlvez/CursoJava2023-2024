package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("Java", "C", "C++", "C#");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		System.out.println((String) ListaUtil.getUltimoElemento(langs));
		System.out.println((Integer) ListaUtil.getUltimoElemento(numbers));
		
//		MODO ESPECIFICADO
		System.out.println(ListaUtil.getUltimoElementoT(langs));
		System.out.println(ListaUtil.getUltimoElementoT(numbers));
	}
}
