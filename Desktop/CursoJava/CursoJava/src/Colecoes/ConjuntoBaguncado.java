package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		// ELE CONVERTE TUDO PARA OBJETO. NAO ACEITA TIPOS PRIMITIVOS;
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho : " + conjunto.size());
		conjunto.add("teste");
		System.out.println("Tamanho : " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tem? "+conjunto.contains('x'));
		
		Set nums = new HashSet(); // FUNCIONA COMO HASHSET, POREM O SET PARECE SER UMA INTERFACE...;
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // Uniao entre dois conjunto
		System.out.println(conjunto);
		System.out.println();
		
		conjunto.retainAll(nums); // retira os dados idem
		System.out.println(conjunto);
		
		conjunto.clear(); // limpa os dados
		System.out.println(conjunto);
		
	}

}
