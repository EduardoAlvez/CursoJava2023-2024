package oo.composicao;

public class CompraTest {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "joao Pedro";
		c1.adcionarItens(new Item("Caneta", 3.1, 30));
		c1.adcionarItens(new Item("Camisa", 50.24, 89));
		c1.adcionarItens(new Item("Tupo", 3.90, 2));
		c1.adcionarItens(new Item("Tupo", 3.90, 220));
		c1.adcionarItens(new Item("Tupo", 3.90, 2230));

		System.out.println(c1.itens.size());
		System.out.printf("R$ %.2f", c1.obterValorToral());
		System.out.println();
		for (Item it : c1.itens) {
			if (it.nome.equals("Tupo")) {
				System.out.println(it.nome+" <> "+it.quantidade);
			}
		}
		// DEMOSTRACAO DO USO BIDIRECIONAL, PODE SER ACESSADA POR DUAS CLASSES
		double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorToral();
		System.out.println("R$ "+total);
	}
}
