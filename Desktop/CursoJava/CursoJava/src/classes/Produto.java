package classes;

public class Produto {
	
	public String nome;
	public double valor;
	public static double desconto = 0.25;
	
	Produto(){}
	Produto(String nomeInicial, double valorInicial){
		nome = nomeInicial;
		valor = valorInicial;
		//desconto = descontoInicial;
	}
	
	public double precoComDesconto() {
		return this.valor*(1 - desconto);
	}

}
