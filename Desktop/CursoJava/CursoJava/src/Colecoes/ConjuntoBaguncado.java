package Colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		// ELE CONVERTE TUDO PARA OBJETO. NAO ACEITA TIPOS PRIMITIVOS;
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho é " + conjunto.size());
		conjunto.add("teste");
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		
		
	}

}
