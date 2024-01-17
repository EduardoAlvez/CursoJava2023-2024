package Streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Edu",1.0);
        Aluno a2 = new Aluno("Nandinha",10.0);
        Aluno a3 = new Aluno("Dona",10.0);
        Aluno a4 = new Aluno("Fer",10.0);

        List<Aluno> turma = Arrays.asList(a1,a2,a3,a4);

//        PODEMOS CIRAR DE FORMA SEPARA AS FUNÇOES LAMBDAS
//        Predicate<Aluno> verificadorAprovado = aluno -> aluno.nota >= 7;
//        Function<Aluno,String> menssagemCarinhosa = aluno -> "O aluno(a) "+aluno.nome+", Foi Aprovado(a) pivete, manda bala.";

//        PODEMOS ENTAO, FAZER DESSA FORMA OU INTRODIZIR OS METODOS LAMBDAS NO LUGAR ABAIXO...
        turma.stream()
                .filter(aluno -> aluno.nota >= 7)
                .map(aluno -> "O aluno(a) "+aluno.nome+", Foi Aprovado(a) pivete, manda bala.")
                .forEach(Util.printl);


    }
}
