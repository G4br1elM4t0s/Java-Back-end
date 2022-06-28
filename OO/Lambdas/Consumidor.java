package OO.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    
    public static void main(String[] args) {
        
        Consumer<Produto> imprimir =  p -> System.out.println(p.nome);
        
        
        Produto produto = new Produto("caneta", 1.20,  0.1);


        // recebe um unico parâmetro e não retorna nada
        imprimir.accept(produto);
         
        Produto p1 = new Produto("Caneta", 1.20,  0.1);
        Produto p2 = new Produto("Borracha", 2.00,  0.1);
        Produto p3 = new Produto("Grafite", 4.50,  0.1);
        Produto p4 = new Produto("Caderno", 10.20,  0.1);
        Produto p5 = new Produto("Notebook", 1020.20,  0.15);
        
        
        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);


        produtos.forEach(imprimir);
        produtos.forEach(p-> System.out.println(p.preco));

        produtos.forEach(System.out::println);

    }
}