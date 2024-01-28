package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + " "+ p.preco);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.05);
		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("lapis", 19.90, 0.09);
		Produto p4 = new Produto("Estojo", 7.8, 0.18);
		Produto p5 = new Produto("Bolsa", 4.39, 0.19);
//		imprimir.accept(p1);
			
		List<Produto> produtos = Arrays.asList(p1, p2, p3 , p4);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
