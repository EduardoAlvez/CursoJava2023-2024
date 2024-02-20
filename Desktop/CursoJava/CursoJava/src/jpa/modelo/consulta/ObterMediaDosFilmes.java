package jpa.modelo.consulta;

import jpa.infra.DAO;

public class ObterMediaDosFilmes {

	public static void main(String[] args) {
		
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultaUm("obeterMediaGeralDosFilmes");
		
		System.out.println(nota.getMedia());
		dao.fechar();
	}
}
