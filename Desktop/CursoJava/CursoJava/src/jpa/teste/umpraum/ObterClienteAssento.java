package jpa.teste.umpraum;

import jpa.infra.DAO;
import jpa.modelo.umpraum.Assento;
import jpa.modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<Cliente>(Cliente.class);
		DAO<Assento> daoAssento = new DAO<Assento>(Assento.class); 
		
		Cliente cliente = daoCliente.obterPorId(1L);
		System.out.printf("Assento: %s - %s\n",cliente.getAssento().getNome(),cliente.getNome());
		daoCliente.fechar();
		
//		MUITO LEGAL!!!
//		CONSEGUE PEGAR UM CLIENTE POR ASSENTO.
		Assento assento = daoAssento.obterPorId(2L);
		System.out.printf("Nome: %s - %s",assento.getCliente().getNome(),assento.getNome());
		daoAssento.fechar();
	}
}
