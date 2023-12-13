package oo.composicao;

import java.util.ArrayList;
import java.util.Objects;

public class Compra {

	String cliente;
	ArrayList<Item> itens;

	Compra() {
		itens = new ArrayList<>();
	}

	void adcionarItens(Item item) {
		if (!this.itens.contains(item)) {
			this.itens.add(item);
			item.compra = this;
		} else {
			for (Item ite : itens) {
				if (ite.nome.equals(item.nome))
					ite.quantidade += item.quantidade;
			}
		}
	}

//	void adicionarItens(String nome, double preco, int quantidade) {
//		adcionarItens(new Item(nome, preco, quantidade));
//	}

	public double obterValorToral() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return Objects.equals(cliente, other.cliente);
	}

}
