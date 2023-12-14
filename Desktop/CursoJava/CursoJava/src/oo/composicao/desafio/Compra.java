package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();

	Compra() {

	}
	double Valores(){
		double valorTotal = 0;
			for (Item item : itens) {
				valorTotal += item.total();
			}
		
		return valorTotal;
	}

	void adicionarItem(Item item) {
		if (itens.contains(item)) {
			for (Item ite : itens) {
				if (ite.equals(item))
					ite.quantidade += item.quantidade;
			}
		}
		itens.add(item);
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
