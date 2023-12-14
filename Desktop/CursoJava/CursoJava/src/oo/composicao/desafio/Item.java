package oo.composicao.desafio;

import java.util.Objects;

public class Item {

	Produto produto;
	int quantidade;

	
	// METODOS PARA PEGA INFORMAÇÕES DE PRODUTO;
	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	double valorProduto() {
		return produto.valor;
	}

	int idProduto() {
		return produto.id;
	}

	int obterQuantidade() {
		return quantidade;
	}

	String obterNomeDoProduto() {
		return produto.nome;
	}

	double total() {
		if (produto == null)
			return 0;
		else {
			return produto.valor * this.quantidade;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(produto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(produto, other.produto);
	}
	

}
