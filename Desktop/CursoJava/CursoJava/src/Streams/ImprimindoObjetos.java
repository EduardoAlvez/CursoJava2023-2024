package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Edu","Fer", "Ivi");

//       USANDO FOREACH
        System.out.println("Foreach...");
        for (var nome:aprovados) {
            System.out.println(nome);
        }
//        USANDO iTERATOR
        System.out.println("\nIterator...");
        Iterator<String> it = aprovados.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
//        STREAMS
        System.out.println("\nStream...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);



    }
}
