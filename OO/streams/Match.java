package OO.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gabriel", 8.2);
        Aluno a2 = new Aluno("Giu", 9.8);
        Aluno a3 = new Aluno("Guilherme", 7.8);
        Aluno a4 = new Aluno("Adriano", 7.8);

        //O match tbm é uma função terminadora;
        List<Aluno> alunos =Arrays.asList(a1,a2,a3,a4);
               
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        //Ou seja o match verifica se todos os alunos foram aprovados
        System.out.println(alunos.stream().allMatch(aprovado));
        //se algum deles foram aprovados
        System.out.println(alunos.stream().anyMatch(aprovado));
        //negação
        System.out.println(alunos.stream().noneMatch(reprovado));



    }
}
