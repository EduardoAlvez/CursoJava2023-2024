package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {


		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta",9,10);
		compra1.adicionarItem(new Produto("Notebook", 4000),1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Cardeno",10,10);
		compra2.adicionarItem(new Produto("Bloco de Massa", 100),1);
		compra2.adicionarItem(new Produto("Bloco de Massa", 100),1);

		
		Cliente cliente1 = new Cliente("Maria Fernada");
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
	
		System.out.println(cliente1.obterValorTotal());
		System.out.println(compra2.nomeDosProduto());
		
		System.out.println("...");
		for(Compra itens: cliente1.listaDeCompra()) {
			
			System.out.println(itens.nomeDosProduto());
		}
	
	}
}
