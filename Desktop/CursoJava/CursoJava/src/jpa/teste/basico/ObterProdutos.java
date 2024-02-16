package jpa.teste.basico;

import java.util.List;

import jpa.infra.ProdutoDAO;
import jpa.modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto : produtos) {
			System.out.printf("ID: %d - %s\n",produto.getId(), produto.getNome());
		}
	
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t,p)-> t+p)
				.doubleValue();
		System.out.printf("Valor Total: %.2f",precoTotal);
		
		dao.fechar();
	}
}
