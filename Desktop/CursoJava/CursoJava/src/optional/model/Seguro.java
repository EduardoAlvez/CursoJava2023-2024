package optional.model;

public class Seguro {

	public String descricao;
	private double valor;
	
	
	
	public Seguro(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
