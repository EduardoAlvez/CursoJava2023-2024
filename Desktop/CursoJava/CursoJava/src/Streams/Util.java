package Streams;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Util {

    public final static Consumer<Object> printl = System.out::println;
    public final static UnaryOperator<String> maiuscula = n ->n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+ "";
    public final static String grito(String n){
        return n +"!!!";
    }
}
