package OO.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        

        //O fato de não receber nenhum parâmetro força a colocar os paranteses para declarar que não recebe nada
        //quando támbem recebe mais de um parâmetro
        Supplier< List<String> > umLista = () -> Arrays.asList("Gab","Gui","Bia");

        System.out.println(umLista.get());
    }
}
