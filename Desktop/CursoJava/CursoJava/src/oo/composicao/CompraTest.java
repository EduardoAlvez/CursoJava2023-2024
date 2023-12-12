package oo.composicao;

public class CompraTest {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "joao Pedro";
		c1.adcionarItens(new Item("Caneta", 3.1, 30));
		c1.adcionarItens(new Item("Camisa", 50.24, 89));
		c1.adcionarItens(new Item("Tupo", 3.90, 2));

		System.out.println(c1.itens.size());
		System.out.printf("R$ %.2f", c1.obterValorToral());

	}
}
