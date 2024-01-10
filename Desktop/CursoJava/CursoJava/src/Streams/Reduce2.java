package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	public static void main(String args[]) {
		
		Predicate<Aluno> aprovado	= al -> al.nota >=7;
		Function<Aluno, Double> apenasNota = al -> al.nota;
		BinaryOperator<Double> somatorio = (n1,n2) -> n1+n2;
		
		Aluno a1 = new Aluno("Edu", 7.9);
		Aluno a2 = new Aluno("Momo", 4.9);
		Aluno a3 = new Aluno("Nanda", 9.9);
		Aluno a4 = new Aluno("Dona", 6.9);
				
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		alunos.stream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
	}
}

