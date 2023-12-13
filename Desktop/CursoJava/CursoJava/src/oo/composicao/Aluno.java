package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String NOME;
	final List<Curso> cursos = new ArrayList<>();

	Aluno(String nome) {
		this.NOME = nome;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if(curso.NOME.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	public String toString() {
		return NOME;
	}
}
