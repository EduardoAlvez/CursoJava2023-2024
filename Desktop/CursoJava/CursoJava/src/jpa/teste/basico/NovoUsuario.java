package jpa.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
//		UMA FABRICA IGUAL USADO ANTES
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("CursoJava-JPA");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario("Eduardo", "eduardo@homail.com");
		
//		LOGO PARA USAR O PERSIST, TEM OBRIGATORIAMENTE DE FAZER UMA TRANSAÇÃO
//		GERA UMA TRANSAÇÃO QUE PODE SER PERSISTIDA
		em.getTransaction().begin();
//		PERSISTE A TRANSAÇÃO
		em.persist(usuario);
//		SALVA NO BANCO DE DADOS
		em.getTransaction().commit();
		
		System.out.println("O ID gerado foi: "+usuario.getId());
		
		em.close();
		emf.close();
	}
}
