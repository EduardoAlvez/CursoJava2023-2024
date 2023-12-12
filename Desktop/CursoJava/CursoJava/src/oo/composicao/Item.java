package oo.composicao;

public class Item {

	String nome;
	double preco;
	int quantidade;
	Compra compra;

	Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;

	}
}
