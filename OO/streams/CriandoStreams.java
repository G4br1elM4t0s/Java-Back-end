package OO.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        

        //função funcional que não retorna nada e recebe um parametro especifico.
        //criado para não ficar precisando chamar o metodo por referencia toda vez!
        Consumer<String> print = System.out::print;
        
        //primeira forma de criar uma Stream(Metodo Statico).
        Stream<String> langs = Stream.of("Java","Python","JavaScript", "Lua\n");

        langs.forEach(print);


        //a partir de um array
        String[] maisLangs = {"Ruby", "Lisp", "Perl", "Go\n"};
        

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1 , 3).forEach(print);


        //A partir de collections

        List<String> outrasLangs = Arrays.asList("C", "PHP", "KOTLIN \n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);


        Stream.generate(()-> "a").forEach(print);
        Stream.iterate(0, n -> n + 1);

        


    }  
}
