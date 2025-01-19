package optional.model;

import java.util.Optional;

public class Motorista {

	private String nome;
	private int idade;
	private double salario;

	private Optional<Caminhao> caminhaOpicional;

	
	public Motorista(String nome, int idade, double salario, Optional<Caminhao> caminhaOpicional) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.caminhaOpicional = caminhaOpicional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Optional<Caminhao> getCaminhaOpicional() {
		return caminhaOpicional;
	}

	public void setCaminhaOpicional(Optional<Caminhao> caminhaOpicional) {
		this.caminhaOpicional = caminhaOpicional;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

	
	
}
