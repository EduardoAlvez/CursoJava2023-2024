package jpa.modelo.umpraum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assentos")
public class Assento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nome;

//	ASSENTO ESTÁ MAPEADA PELO CLIENTE, NÃO GERA COLUNA
//	BIDIRECIONAL
	@OneToOne(mappedBy = "assento")
	private Cliente cliente;

//	CONSTRUTORES
	public Assento() {
	}

	public Assento(String nome) {
		super();
		this.nome = nome;
	}

//	GETS E SETS
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
