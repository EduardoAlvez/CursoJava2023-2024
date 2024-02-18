package jpa.modelo.umpramuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date data;
	
//	mappedBy FAZ A PARTE BIDIRECIONAL
	@OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)
	private List<ItemPedido> itens;
	
//	CONSTRUTOR
	public Pedido() {
		this(new Date());
	}	
	
	
	public Pedido(Date data) {
		this.data = data;
	}

	//	GETS E SETS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}


	
	public List<ItemPedido> getItens() {
		return itens;
	}
	


	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
	
}
