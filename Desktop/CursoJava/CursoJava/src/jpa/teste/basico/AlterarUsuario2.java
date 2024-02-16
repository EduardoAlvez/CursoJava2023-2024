package jpa.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("CursoJava-JPA");
		EntityManager em = emf.createEntityManager();
		
//		INICIO
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 6L);
		usuario.setEmail("Manoel@Manoel.com.br");
		usuario.setNome("Manoel");
		
//		.merge MODIFICA UM USUARIO PRESENTE NO BANCO
//		MESMO SEM USAR O .merge O USUARIO SERÁ TROCADO, PQ ELE ESTÁ SENDO GERENCIAADO
//		em.merge(usuario);
		
		em.getTransaction().commit();
//		FIM
		
		em.close();
		emf.close();
	}
}
