package jpa.teste.muitospramuitos;

import jpa.infra.DAO;
import jpa.modelo.muitospramuitos.Sobrinho;
import jpa.modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia = new Tio("Maria Fernada");
		Tio tio = new Tio("Eduardo Alves");
		
		Sobrinho sobrinho = new Sobrinho("Daniel");
		Sobrinho sobrinha = new Sobrinho("Ana Maria");
		
		tia.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tia);
		
		tia.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tia);
		
		tio.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tio);
		
		tio.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tio);
		
		DAO<Object> dao = new DAO<Object>();
		dao.abrirTransacao()
			.incluir(tia)
			.incluir(tio)
			.incluir(sobrinha)
			.incluir(sobrinho)
			.fecharTransacao()
			.fechar();
	}
}
