package OO.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu","Gui","Lari","Rafa","Gabi");
        

        System.out.println("Usando forEach");
        for(String nome : aprovados){
            System.out.println(nome);
        }

        //Iterator tem dois metodos tem um metodo que retorna verdadeiro ou falso ou seja tem proximo?
        //e o outro metodo que faz
        System.out.println("\nUsando o Iterator");
        Iterator<String> it = aprovados.iterator();
        //Ou seja ele verifica se tem algum elemento na chamada do while...
        //dentro do while ele verifica se tem um proximo se ouver ele pula para o proximo no laço
        //ele verifica se tem mesmo e vai ficando neste respectivo loop até acabar a lista de aprovados...
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nUsando uma Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);// Laço interno, ou seja a praticidade que o stream lhe dá é pegar o trabalho de fazer laços, testes, tudo interno assim melhorando a visibilidade do codigo e o deixando mais enchuto 
        //ou seja parte dos problemas são resolvidos nativamente dentro da linguagem.
        //Dentro da API de Streams tem uma serié de operadores com mais de 30 metodos ou seja comportamentos
        //ou seja uma serié de funcionalidades para ajudar no trabalho.
        
    }
}
