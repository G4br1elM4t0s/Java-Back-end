package OO.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> op = (ac, n) -> ac + n;


        //O resultado final de um reduce não é um outro stream
        //ou seja ela é uma função terminadora assim como o forEach;
        //Nesta primeira versão do reduce onde ele é um opcional de integer
        //pois não a um parametro passado junto com a respectiva function "op"
        int total = list.stream().reduce(op).get();

        System.out.println(total);

        
        Integer total2 = list.stream().reduce(100, op);
        System.out.println(total2);
        
        list.stream().filter(n-> n >5)
        .reduce(op).ifPresent(System.out::println);
    }
}
