package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Comsumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.NOME);
		
		Produto p1 = new Produto("Bolacha", 3.9, 0.02);

		Produto p2 = new Produto("Biscoito", 4.10, 0.04);

		Produto p3 = new Produto("Bola", 33.90, 0.09);
		
//		imprimirNome.accept(p3);
		
		List<Produto> listona = Arrays.asList(p1,p2,p3);
		
		listona.forEach(imprimirNome);
//		listona.forEach(p -> System.out.println(p.NOME));
		listona.forEach(System.out::println);
	}
}
