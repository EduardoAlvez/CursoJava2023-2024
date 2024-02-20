package jpa.infra;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<M> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<M> classe;
	
//	ATRIBUTOS ESTATICO PODEM SER INICIADO EM UM BLOCO ESTATICO OU NO PRÓPRIO ATRIBUTO
	static {
		try {
			emf = Persistence.createEntityManagerFactory("CursoJava-JPA");
		} catch (Exception e) {
			e.printStackTrace();
			// LOGAR -> log4j
		}
	}
	
//	CONSTRUTORES
	public DAO() {
		this(null);
	}

	public DAO(Class<M> classe) {
		super();
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
//	MÉTODOS DAO
	public DAO<M> abrirTransacao(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<M> fecharTransacao(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<M> incluir(M entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<M> incluirAtomico(M entidade){
		abrirTransacao().incluir(entidade).fecharTransacao();
		return this;
	}
	
//	SOBRECARGA
	public List<M> obterTodos(){
		return obterTodos(10, 0);
	}
	
	public M obterPorId(long id){
		return em.find(classe,id);
	}
	
	public List<M> obterTodos(int quatidade, int maximo){
		if(classe == null)
			throw new RuntimeErrorException(new Error(), "Classe nula.");
		
		String jpql = "select e from "+classe.getName()	+" e";
		TypedQuery<M> query = em.createQuery(jpql,classe);
		query.setMaxResults(quatidade);
		query.setFirstResult(maximo);
		return query.getResultList();
	}
	
	public List<M> consulta(String consulta,Object...args) {
		TypedQuery<M> query = em.createNamedQuery(consulta, classe);
		
		for (int i = 0; i < args.length; i+=2) {
			query.setParameter(args[i].toString(), args[i+1]);
		}
		
		return query.getResultList();
	}
	
	public M consultaUm(String consulta,Object...args){
		List<M>lista = consulta(consulta, args);
		return lista.isEmpty() ? null: lista.get(0);
	}
	
	public DAO<M> fechar(){
		em.close();
		return this;
	}
}
