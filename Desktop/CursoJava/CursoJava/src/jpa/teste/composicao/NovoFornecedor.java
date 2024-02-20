package jpa.teste.composicao;

import jpa.infra.DAO;
import jpa.modelo.composicao.Endereco;
import jpa.modelo.composicao.Fornecedor;

public class NovoFornecedor{

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor("AJProducoes");
		Fornecedor f2 = new Fornecedor("TNT");
		
		Endereco e1 = new Endereco();
		Endereco e2 = new Endereco();
		
		e1.setLogradouro("Rua tal de tal");
		e1.setComplemento("perto da casa tal");
		e2.setLogradouro("Avenida do Tal tal");
		e2.setComplemento("Perto da loja do tal tal");
		
		f1.setEndereco(e1);
		f2.setEndereco(e2);
		
		DAO<Fornecedor> dao = new DAO<Fornecedor>();
		
		dao.abrirTransacao()
			.incluir(f1)
			.incluir(f2)
			.fecharTransacao()
			.fechar();
		
		
		
		
	}
}
