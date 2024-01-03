package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        List<String> marcas = Arrays.asList("bmw ", "audi ","iveco ");
        marcas.stream().forEach(Util.printl);

        UnaryOperator<String> maiuscula = n-> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+"";
        UnaryOperator<String> grito = n -> n +"!!!";

        System.out.println("\nUsando composição...");
        marcas.stream()
                .map(Util.maiuscula)
//                .map(maiuscula) PODEMOS FAZER DESSA FORMA TB...
                .map(primeiraLetra)
//                .map(grito) PODEMOS FAZER DESSA FORMA TB...
                .map(Util::grito)
                .forEach(Util.printl);

    }
}
