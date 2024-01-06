package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Edu", 7.9);
		Aluno a2 = new Aluno("Momo", 7.9);
		Aluno a3 = new Aluno("Nanda", 9.9);
		Aluno a4 = new Aluno("Dona", 9.9);
				
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado	= al -> al.nota >=7;
		Predicate<Aluno> reprovado	= aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
		
	}
}
