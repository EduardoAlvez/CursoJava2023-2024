package jpa.teste.umpramuitos;

import jpa.infra.DAO;
import jpa.modelo.basico.Produto;
import jpa.modelo.umpramuitos.ItemPedido;
import jpa.modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<Object>();
		
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Sapato",99.99);
		ItemPedido item = new ItemPedido(pedido, produto,50);
		
		dao.abrirTransacao()
		.incluir(produto)
		.incluir(pedido)
		.incluir(item)
		.fecharTransacao()
		.fechar();
		
	}
}
