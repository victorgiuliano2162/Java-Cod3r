package lambdas;

import java.util.function.Predicate;

abstract class Predicado {

	public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> (prod.preco * (1- prod.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 4000.00, 0.4);
        System.out.println(produto.preco * (1 	- produto.desconto));
        System.out.println(isCaro.test(produto));
    }

}
