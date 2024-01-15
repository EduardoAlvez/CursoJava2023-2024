package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<Integer, String>();
			
		resultadoConcurso.adicionar(1, "Momo");
		resultadoConcurso.adicionar(2, "De");
		resultadoConcurso.adicionar(3, "Momo");
		resultadoConcurso.adicionar(4, "Guga");
		resultadoConcurso.adicionar(4, "Dudu");
		
		System.out.println(resultadoConcurso.getValor(4));
		
	}
}
