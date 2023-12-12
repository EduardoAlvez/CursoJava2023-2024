package Classes;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		//CRIANDO OBJETOS;
		Produto p1 = new Produto("Caneta",4.00);
		
		var p2 = new Produto("Borracha",0.5);
		//p2.nome = "Borracha";
		//p2.valor = 0.5;
		//p2.desconto = 0.1;
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " R$" + p1.precoComDesconto());
		System.out.println(p2.nome + " R$" + p2.precoComDesconto());
		
		double precoFinal = p1.precoComDesconto();
		double precoFinalDois = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal+precoFinalDois) / 2;
		
		System.out.printf("Média Total: R$%.2f",mediaCarrinho);
	}

}
