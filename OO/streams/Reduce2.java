package OO.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gabriel", 8.2);
        Aluno a2 = new Aluno("Giu", 2.8);
        Aluno a3 = new Aluno("Guilherme", 7.8);
        Aluno a4 = new Aluno("Adriano", 5.8);


        List<Aluno> alunos =Arrays.asList(a1,a2,a3,a4);
        //pipeline de execução são processamentos que precisam de filtro 
        // precisam de  mapeamentos, logicas que iram reduzir os dados 

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> notas = a -> a.nota;
        BinaryOperator<Double> somaNota = (a ,b ) -> a + b ;

        alunos.stream().filter(aprovado)
        .map(notas).reduce(somaNota)
        .ifPresent(System.out::println);
    }
}
