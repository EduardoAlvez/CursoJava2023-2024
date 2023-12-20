package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}

	public void setIdade(int idade) {
		int dade = Math.abs(idade);
		if (dade >= 0 && dade < 150)
			this.idade = dade;
	}

	public int getIdade() {
		return this.idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
}
