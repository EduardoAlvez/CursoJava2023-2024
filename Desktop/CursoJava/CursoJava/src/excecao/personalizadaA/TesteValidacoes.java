package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 8);
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException  
				| NumeroForaDoIntervaloException  | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim.");
	}
}
