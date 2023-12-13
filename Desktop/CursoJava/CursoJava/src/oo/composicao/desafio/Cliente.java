package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<>();

	double obterValorTotal() {
		double total = 0;
		for (Compra compra : compras) {
			total = compra.getItens().get(0).total();
			}
		return total;
	}
}
