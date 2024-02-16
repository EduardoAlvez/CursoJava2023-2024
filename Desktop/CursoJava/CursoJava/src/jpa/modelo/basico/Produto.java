package jpa.modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos",schema = "curso_java")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome",length = 254,nullable = false)
	private String nome;
	
//	precision, É O TAMNHO DOS NUMEROS,CAMPO. scale, QUANTIDADE DE NUMERO DEPOIS DA VIRGULA
	@Column(name = "preco",nullable = false,precision = 11,scale = 2)
	private double preco;
	
//	CONSTRUTORES
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

//	GET E SET
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
