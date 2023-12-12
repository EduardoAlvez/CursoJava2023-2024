package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Quantos alunos?: ");
		int quantidadeAlunos = leitor.nextInt();

		System.out.println("Quantas notas por aluno?: ");
		int quantidadeNotas = leitor.nextInt();

		double notasDaTurma[][] = new double[quantidadeAlunos][quantidadeNotas];

		var total = 0;
		// alunos;
		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			// notas;
			for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {

				System.out.printf("Informe a nota %d do aluno %d: ", aluno + 1, nota + 1);
				notasDaTurma[aluno][nota] = leitor.nextDouble();
				
				total += notasDaTurma[aluno][nota];
			}
		}
		
		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.println("Média da turma é :" + media);

		for (double[] notas : notasDaTurma) {
			System.out.println(Arrays.toString(notas));
		}

		leitor.close();
	}
}
