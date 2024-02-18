package jpa.teste.muitospramuitos;

import jpa.infra.DAO;
import jpa.modelo.muitospramuitos.Ator;
import jpa.modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
	
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Wars", 5.3);
		
		Ator atorA = new Ator("Lula");
		Ator atriz = new Ator("Bosolnaro");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atriz);
		
		DAO<Filme> dao = new DAO<Filme>();
		
		dao.abrirTransacao()
			.incluir(filmeA)
			.fecharTransacao()
			.fechar();
		
	}

}
