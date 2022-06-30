package OO.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    
    public static void main(String[] args) {
        

        Aluno a1 = new Aluno("Gabriel", 7.8);
        Aluno a2 = new Aluno("Gui",8.9);
        Aluno a3 = new Aluno("Lia",9.9);
        Aluno a4 = new Aluno("Giu",4.9);
        Aluno a5 = new Aluno("Douglas",6.9);
        Aluno a6 = new Aluno("Jonas",3.9);

        List<Aluno> alunos =  Arrays.asList(a1,a2,a3,a4,a5,a6);
        Predicate<Aluno> aprovado = a -> a.nota >=7;

        Function<Aluno, String> saudacaoAprovado = a-> "Parabéns " + a.nome + "! você foi aprovado(a)!";


        alunos.stream()
        .filter(aprovado)
        .map(saudacaoAprovado)
        .forEach(System.out::println);
    }
}
