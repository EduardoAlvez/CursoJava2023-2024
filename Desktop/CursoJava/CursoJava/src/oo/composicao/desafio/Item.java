package oo.composicao.desafio;

public class Item {

	Produto produto;
	int quantidade;

	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
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

}
