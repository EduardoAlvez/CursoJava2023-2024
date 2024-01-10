package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {
	
	private Validar() {}
	
	public static void aluno(Aluno aluno) {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno e nulo.");
		}
		if(aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		if(aluno.getNote() < 0 || aluno.getNote() > 10) {
			throw new NumeroForaDoIntervaloException("nota");
		}
	}
	

}
