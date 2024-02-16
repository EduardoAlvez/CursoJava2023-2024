package jpa.infra;

import jpa.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{

	public ProdutoDAO() {
		super(Produto.class);
	}
}
