package jpa.teste.umpraum;

import jpa.infra.DAO;
import jpa.modelo.umpraum.Assento;
import jpa.modelo.umpraum.Cliente;

public class NovoClienteAssento1{

	public static void main(String[] args) {
		
		Assento assento = new Assento("7A");
		Cliente cliente = new Cliente("João",assento);
		
		DAO<Object> dao = new DAO<Object>();
		
		dao.incluirAtomico(assento);
		dao.incluirAtomico(cliente);
	}
}
