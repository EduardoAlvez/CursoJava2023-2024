package Streams.Desafio;

import Streams.Util;

import java.util.Arrays;
import java.util.List;

public class DesafioFilterCurso {
    public static void main(String[] args) {

        Produto p1 = new Produto("Celular",899.99,0.70);
        Produto p2 = new Produto("Tv 90 Polegadas",4899.99,0.75);
        Produto p3 = new Produto("Tablet",1899.99,0.60);
        Produto p4 = new Produto("Camisa Branca",99.99,0.90);
        Produto p5 = new Produto("Meias",29.50,0.85);

        List<Produto> stock = Arrays.asList(p1,p2,p3,p4,p5);




        stock.stream()
                .filter(produto -> produto.getDesconto()>= 0.70)
                .filter(produto -> produto.getValorFrete() == 0)
                .map(produto -> String.format("Produtos em Promoção e com Frete gratis: %s, Custando APENAS: R$%.2f",produto.getNome(),produto.getValor() * produto.getDesconto()))
                .forEach(Util.printl);
    }
}
