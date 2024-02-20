package jpa.teste.heranca;

import javax.persistence.MappedSuperclass;

import jpa.modelo.composicao.Endereco;

@MappedSuperclass
public abstract class Pessoa {

	private String nome;
	
	private Endereco endereco;
	
	private String obs;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
}
