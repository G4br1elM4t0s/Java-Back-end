package OO.streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gabriel", 8.2);
        Aluno a2 = new Aluno("Giu", 9.8);
        Aluno a3 = new Aluno("Guilherme", 7.8);
        Aluno a4 = new Aluno("Adriano", 7.8);
        Aluno a5 = new Aluno("Gabriel", 8.2);
        Aluno a6 = new Aluno("Giu", 9.8);
        Aluno a7 = new Aluno("Guilherme", 7.8);
        Aluno a8 = new Aluno("Adriano", 5.8);

       
        List<Aluno> alunos =Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);


        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
        
        System.out.println("\nTakeWhile");
        alunos.stream().distinct().skip(2).takeWhile(a -> a.nota>=7).forEach(System.out::println);
    }
}
