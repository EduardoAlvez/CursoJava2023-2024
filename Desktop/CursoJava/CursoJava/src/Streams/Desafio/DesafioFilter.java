package Streams.Desafio;

import Streams.Util;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Carro c1 = new Carro("Esportivo","Corsa v8 1.8",2024,0.0,true);
        Carro c2 = new Carro("Convencional","Palio 1.4",2022,0.0,true);
        Carro c3 = new Carro("Esportivo","Marea 3.9 TurboX",2023,5937.3,false);
        Carro c4 = new Carro("Caminhonete","Hilux Xtreme",2024,4000.5,true);
        Carro c5 = new Carro("Convencional","Celta 1.0",2020,0.0,true);

        List<Carro> modelos = Arrays.asList(c1,c2,c3,c4,c5);

        Function<Carro,String> oferta = carro -> "Super OFERTA, venha e nao perca, Carro: "+carro.getModelo()+" "+carro.getTipo()+" A Venda com préço SUPER ESPECIAL, venha já conferir!!!";
        Predicate<Carro> verificadorAnoEKm = carro -> carro.getAno() >= 2020 && carro.getKm() == 0;
        Predicate<Carro> verificadorAvenda = carro -> carro.isaVenda();

        modelos.stream()
                .filter(verificadorAnoEKm)
                .filter(verificadorAvenda)
                .map(oferta)
                .forEach(Util.printl);

    }

}
