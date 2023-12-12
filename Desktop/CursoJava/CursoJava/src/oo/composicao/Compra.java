package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens;

	Compra() {
		itens = new ArrayList<>();
	}

	void adcionarItens(Item item) {
		if (!this.itens.contains(item))
			this.itens.add(item);
			item.compra = this;
		}
		else {
			this.itens.get(item.hashCode()).quantidade += 1;
		}

	public double obterValorToral() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}

}
