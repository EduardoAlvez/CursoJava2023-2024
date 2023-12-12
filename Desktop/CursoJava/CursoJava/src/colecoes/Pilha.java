package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Menino da cabeça preta.");
		livros.push("Don do Quixote Pagode Classico");
		livros.push("Tomelé");
		
		for (String livro : livros) {
			System.out.println(livro);
		}
		System.out.println("-----");
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.peek());
		System.out.println(livros.poll());	// retonar null se nao tiver nada;
		System.out.println(livros.pop());	//retorna um excecao...;
		
//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty()
	}
}
