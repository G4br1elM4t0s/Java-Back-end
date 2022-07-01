package OO.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFiltro2 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Lapís", 2.3, 0.2, 0);
        Produto p2 = new Produto("Caderno", 12.3, 0.5, 0);
        Produto p3 = new Produto("Caneta", 1.3, 0.1, 0);
        Produto p4 = new Produto("Ipad", 3222.3, 0.15, 0);
        Produto p5 = new Produto("Notebook", 12232.3, 0.25, 0);
        Produto p6 = new Produto("LivroGenerico", 30.32, 0.4, 0);
        Produto p7 = new Produto("Mouse", 120.3, 0.21, 0);
        Produto p8 = new Produto("Teclado", 172.3, 0.25, 0);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);

        //FIlter, filter, Map

        Predicate<Produto> superPromo = p-> p.desconto >= 0.1;
        Predicate<Produto> freteGratis = p-> p.frete == 0;
        Predicate<Produto> precoRelevante = p -> p.preco >100;

        Function<Produto, String> promo =  p -> "Aproveite " + p.nome + " por " + p.preco;


        produtos.stream().filter(superPromo)
        .filter(freteGratis)
        .filter(precoRelevante)
        .map(promo)
        .forEach(System.out::println);

    }
}