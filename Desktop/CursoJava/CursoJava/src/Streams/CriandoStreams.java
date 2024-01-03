package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<Object> tela = System.out::println;
//        PRIMEIRA FORMA
        Stream<String> ling = Stream.of("JAVA ", "LUA ", "JS\n");
        ling.forEach(tela);

//       SEGUNDA FORMA
        String maisLing[] = {"PYTHON ","LISP ","PERL ","GO\n"};
        Stream.of(maisLing).forEach(tela);
        Arrays.stream(maisLing).forEach(tela);
        Arrays.stream(maisLing, 1,4).forEach(tela);

//        TERCEIRA FORMA
        List<String> outraLing = Arrays.asList("C ","C++ ","C#\n");
        outraLing.stream().forEach(tela);

//        Stream.generate(()-> "A").forEach(tela);
        Stream.iterate(0,n -> n+1).forEach(tela);

    }

}
