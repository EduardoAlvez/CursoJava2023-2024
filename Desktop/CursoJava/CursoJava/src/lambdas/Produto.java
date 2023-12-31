package lambdas;

public class Produto {

	final String NOME;
	double valor;
	double desconto;
	
	Produto(String nome, double valor, double desconto){
		this.NOME = nome;
		this.valor = valor;
		this.desconto = desconto;
		
	}
	public String toString() {
		double precoFinal = valor-(1 - desconto);
		
		return NOME+" tem um valor de R$"+String.format("%.2f",precoFinal);
	}
}
