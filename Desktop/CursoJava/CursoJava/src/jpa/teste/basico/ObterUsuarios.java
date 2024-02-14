package jpa.teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("CursoJava-JPA");
		EntityManager em = emf.createEntityManager();
		
////		NÓS PERMITE FAZER CONSULTA NOS OBJETOS, OU SEJA, NA PRÓPRIA CLASSE
////		EM SQL TERIAMOS QUE FAZER u.*
//		String jpql = "SELECT u FROM Usuario u";
////		.CLASS, ELE PASSA ALGUMAS INFORMAÇÕES, REFERENCIAS. METADADOS DA CLASSE
//		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
////		LIMITE DE RESULTADO POR CONSULTA.
//		query.setMaxResults(3);
		
//		PODEMOS FAZER AS LINHAS 20 ATÉ A 26, EM DESSA FORMA SIMPLIFICADA.
		List<Usuario> usuarios = em
				.createQuery("SELECT u FROM Usuario u", Usuario.class)
				.setMaxResults(3)
				.getResultList();
		
		usuarios.stream().forEach(u -> 
			System.out.println("ID: "+u.getId()+" E-mail: "+u.getEmail()));
		
		em.close();
		emf.close();
	}
}
