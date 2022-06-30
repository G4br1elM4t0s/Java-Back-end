package OO.Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2)/2;
        System.out.println(media.apply(9.1,6.0));


        BiFunction<Double, Double, String> resultado = (n1,n2) -> {
            double notaFinal = (n1+n2)/2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };


        System.out.println(resultado.apply(7.8, 3.2));

       
    }
}
