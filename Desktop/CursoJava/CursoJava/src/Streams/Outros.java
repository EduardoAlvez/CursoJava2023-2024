package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Edu", 7.9);
		Aluno a2 = new Aluno("Momo", 6.9);
		Aluno a3 = new Aluno("Nanda", 9.9);
		Aluno a4 = new Aluno("Dona", 9.9);
		Aluno a5 = new Aluno("Pedro", 7.9);
		Aluno a6 = new Aluno("Mauricio", 6.9);
		Aluno a7 = new Aluno("Nanda", 9.9);
		Aluno a8 = new Aluno("Dona", 9.9);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
		.distinct()
		.skip(1)
		.limit(3)
		.forEach(Util.printl);
		
		System.out.println("\nTakeWhile");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >=7)
		.forEach(Util.printl);
		
	}
}
