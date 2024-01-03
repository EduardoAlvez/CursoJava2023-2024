package Streams.Desafio;

public class Carro {
    private String tipo;
    private String modelo;
    private int ano;
    private double km;

    private boolean aVenda;

    public Carro(String tipo, String modelo, int ano, double km, boolean aVenda) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
        this.aVenda = aVenda;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getKm() {
        return km;
    }

    public boolean isaVenda() {
        return aVenda;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setaVenda(boolean aVenda) {
        this.aVenda = aVenda;
    }
}
