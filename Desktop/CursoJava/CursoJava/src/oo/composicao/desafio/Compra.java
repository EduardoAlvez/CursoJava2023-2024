package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();

	Compra() {

	}

	ArrayList<String> nomeDosProduto() {
		ArrayList<String> listaNome = new ArrayList<>();
		for (Item item : itens) {
			listaNome.add(item.obterNomeDoProduto());
		}
		return listaNome;

	}

//	double valoresCurso() {
//		double valor = 0;
//		for (Item item : itens) {
//			valor = item.quantidade * item.produto.valor;
//		}
//		return valor;
//	}

	double valores() {
		double valorTotal = 0;
		for (Item item : itens) {
			valorTotal += item.total();
		}

		return valorTotal;
	}

	// SEGUNDA FORMA DE SER FEITA, TESTADO!!!
	void adicionarItem(String nome, double valor, int quantidade) {
		if (quantidade != 0) {
			boolean adiciona = true;
			Produto i = new Produto(nome, valor);
			// VERIFICA SE O ITEM JÁ EXISTE, NESSE CASO ELE SOMA A QUANTIDADE;
			for (Item ite : itens) {
				if (ite.equals(new Item(i, quantidade))) {
					ite.quantidade += quantidade;
					adiciona = false;
				}
			}
			if (adiciona)
				itens.add(new Item(i, quantidade));
		}
	}

	// TESTADO NO MAIN!!!
	void adicionarItem(Item item) {
		if (itens.contains(item)) {
			for (Item ite : itens) {
				if (ite.equals(item))
					ite.quantidade += item.quantidade;
			}
		}
		itens.add(item);
	}

	// FEITO NO CURSO, ainda a ser testado no MAIN
	void adicionarItem(Produto produto, int quantidade) {
		boolean adicionar = true;
		for (Item item : itens) {
			if (item.equals(new Item(produto, quantidade))) {
				item.quantidade += quantidade;
				adicionar = false;
			}
		}
		if (adicionar) {
			itens.add(new Item(produto, quantidade));
		}
	}

	boolean removerItem(Item item) {
		if (item != null) {
			if (itens.contains(item)) {
				for (Item ite : itens) {
					if (ite.equals(item)) {
						itens.remove(item);
					}
				}
			}
		}
		return false;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
