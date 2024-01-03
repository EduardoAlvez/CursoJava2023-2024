package Streams.Desafio;

public class Produto {
    private String nome;
    private double valor;
    private double desconto;
    private double valorFrete;

    public Produto(String nome, double valor, double desconto) {
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
    }

    private void definirFrete(double valor){
        setValorFrete(valor <= 100 ? 0: valor<=500 ? 150: valor<=1000 ? 200:300);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }
}
