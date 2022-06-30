package OO.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFiltro {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gabriel", 8.2);
        Aluno a2 = new Aluno("Giu", 2.8);
        Aluno a3 = new Aluno("Guilherme", 7.8);
        Aluno a4 = new Aluno("Adriano", 5.8);
        Aluno a5 = new Aluno("José", 4.8);
        Aluno a6 = new Aluno("João", 9.9);



        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, String> alunosAprovados = a -> "O Aluno " + a.nome + " foi aprovado com " + a.nota;

        //coloque a letra de acordo com o nome que você espera.
        Predicate<Aluno> alfabetica = a -> a.nome.startsWith("J");

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        alunos.stream().filter(aprovados)
        .filter(alfabetica)
        .map(alunosAprovados)
        .forEach(System.out::println);

    }
}
