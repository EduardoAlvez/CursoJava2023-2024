package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Eduardo");
		Aluno a2 = new Aluno("Fernanda");
		Aluno a3 = new Aluno("Edson");
		
		Curso curso1 = new Curso("Java Edition Pocket");
		Curso curso2 = new Curso("Java Edition Mini");
		Curso curso3 = new Curso("Java Edition Ultra");
		
		a1.adicionarCurso(curso1);
		a1.adicionarCurso(curso3);
		a1.adicionarCurso(curso2);
		
		a2.adicionarCurso(curso3);
		
		a3.adicionarCurso(curso1);
		// OU...
		curso2.adicionarAluno(a3);
		curso3.adicionarAluno(a3);
		
		for (Aluno alunos : curso1.alunos) {
			System.out.println("Aluno Matriculado no Curso 1: "+alunos.NOME);
		}
		for (Aluno alunos : curso3.alunos) {
			System.out.printf("Aluno Matriculado no %s: %s\n",curso3.NOME,alunos.NOME);
		}
		
		System.out.println(a1.cursos.get(0).alunos);
	}
}
