package colecoes;

import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

//		Set<String> lista = new TreeSet<>();
//		SortedSet<String> lista = new TreeSet<>();
		TreeSet<String> lista = new TreeSet<>();
		lista.add("--Nós--");
		lista.add("Eduardo");
		lista.add("Fernanda");
		lista.add("Meu Amor");
		lista.add("S2");

		for (String nomes : lista) {
			System.out.println(nomes);
		}

		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(78);
		nums.add(2);
		nums.add(3);
		nums.add(6);
		
		for (Integer inte : nums) {
			System.out.println(inte);
		}
		
	}

}
