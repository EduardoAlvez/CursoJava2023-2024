package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Edu", 7.9);
		Aluno a2 = new Aluno("Momo", 4.9);
		Aluno a3 = new Aluno("Nanda", 9.9);
		Aluno a4 = new Aluno("Dona", 6.9);
				
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado	= al -> al.nota >=7;
		Function<Aluno, Double> apenasNota = al -> al.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media,nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream()
		.filter(aprovado)
		.map(apenasNota)
		.reduce(new Media(), calcularMedia,combinarMedia);
		
		System.out.println("Média da turma: "+media.getValor());
		
	}
}
