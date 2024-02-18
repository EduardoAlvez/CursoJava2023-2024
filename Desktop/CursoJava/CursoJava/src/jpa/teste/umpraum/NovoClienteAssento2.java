package jpa.teste.umpraum;

import jpa.infra.DAO;
import jpa.modelo.umpraum.Assento;
import jpa.modelo.umpraum.Cliente;

public class NovoClienteAssento2{

	public static void main(String[] args) {
		
		Assento assento = new Assento("1B");
		Cliente cliente = new Cliente("Manoel",assento);
		
		DAO<Object> dao = new DAO<Object>();
		
//		CRIA UM CLIENTE, E COMO NECESSITA DE UM ASSENTO TB O FAZ.
		dao.incluirAtomico(cliente);
		
	}
}
