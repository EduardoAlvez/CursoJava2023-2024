package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = 
				Arrays.asList("Ivone", "Fernanda", "Eduardo","Ibison");
	
		System.out.println("Forma tradicional...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
				
		System.out.println("\nLAMBDA LAMBDA LAMBDA NEEERD.. #1\n");
		aprovados.forEach(nome -> System.out.println(nome+" TOMAA SANTANAS."));
		
		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);
				
	}
}
