package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// DIFERENCA DO COMPORTAMENTO... QUANDO A FILA ESTA CHEIA;
		fila.add("Fernandao"); // Lanca uma excecao
		fila.offer("Edu o Totoso"); // lanca false
		fila.add("Fernandinha");
		fila.offer("A perigosa");
		fila.add("Beira Mar...");

		// PEEK DA VALOR NULL QUANDO A LISTA ESTA VAZIA, ELEMENT LANCA UM EXCECAO;
		System.out.println(fila.peek());
		System.out.println(fila.element());

//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains();
		
		System.out.println(fila.poll());	// .POOL RETORNA FALSE;
		System.out.println(fila.poll());	
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());	// .REMOVE LANCA UMA EXCECAO;
		


	}
}
