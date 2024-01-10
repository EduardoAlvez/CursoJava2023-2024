package excecao;

public class Aluno {
	
	private String nome;
	private double note;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.note = nota;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	
	

}
