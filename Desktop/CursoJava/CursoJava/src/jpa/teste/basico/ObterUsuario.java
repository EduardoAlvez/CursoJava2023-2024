package jpa.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("CursoJava-JPA");
		EntityManager em = emf.createEntityManager();
		
//		.FIND BUSCA ALGO NO BANCO DE ACORDO COM O QUE FOI PASSADO.
		Usuario usuario = em.find(Usuario.class,5L);
		System.out.println(usuario.getNome());
		
		
		em.close();
		emf.close();
	}
}
