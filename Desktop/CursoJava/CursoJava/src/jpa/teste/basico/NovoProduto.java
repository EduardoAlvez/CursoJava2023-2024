package jpa.teste.basico;

import jpa.infra.DAO;
import jpa.modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		Produto produto = new Produto("Bike", 999.01);
		
//		DAO
		DAO<Produto> dao = new DAO<Produto>(Produto.class);
		dao.abrirTransacao()
		.incluir(produto)
		.fecharTransacao()
		.fechar();
		
//		OU
//		dao.incluirAtomico(produto).fechar();
		
		System.out.println("Id do produto: "+ produto.getId());
	}
}
