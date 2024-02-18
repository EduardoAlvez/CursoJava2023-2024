package jpa.teste.umpramuitos;

import jpa.infra.DAO;
import jpa.modelo.umpramuitos.ItemPedido;
import jpa.modelo.umpramuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(1L);
		
		for (ItemPedido item : pedido.getItens()) {
			System.out.println(item.getQuantidade()
					+"\n"+ item.getProduto().getNome());
		}
		dao.fechar();
	}
}
