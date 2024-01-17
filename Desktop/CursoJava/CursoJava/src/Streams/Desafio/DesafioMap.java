package Streams.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
        /*
        * 1. Número para string binária... 6 => "110" DONE
        * 2. Inverter a string... "110" => "011" DONE
        * 3. Converter de volta para inteiro "011" => 3
        */

    public static void main(String[] args) {
        Consumer<Integer> println = System.out::println;
        Function<Integer,String> numeroParaStringBinario = n -> Integer.toBinaryString(n);
        UnaryOperator<String> ivercao = str -> new StringBuilder(str).reverse().toString();
        Function<String, Integer> converter = str -> Integer.parseInt(str, 2);

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        nums.stream()
                .map(numeroParaStringBinario)
//                .map(Integer::toBinaryString) PODEMOS FAZER ASSIM, MAIS SIMPLES...
                .map(ivercao)
                .map(converter)
                .forEach(println);
    }
}
