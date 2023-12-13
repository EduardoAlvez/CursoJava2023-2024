package oo.composicao.desafio;

import java.util.Objects;

public class Produto {
	
	String nome;
	double valor;
	
	Produto(String nome, double valor){
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
}
