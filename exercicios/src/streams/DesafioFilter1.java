package streams;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;


public class DesafioFilter1 {
	
	//private static final DecimalFormat df = new DecimalFormat("0.00");
	//Joguei para a class produto e alterei o modificador de acesso

	public static void main(String[] args) {
		
		//Criar duas functions para filtrar algo
		//Depois usar um map
		
		Consumer<Object> imprimirProduto = System.out::println;
		
		Produto p1 = new Produto("Lapis", 1.99, .12, 30);
		Produto p2 = new Produto("Notebook", 4899.99, .32, 0);
		Produto p3 = new Produto("Caderno", 30, .45, 0);
		Produto p4 = new Produto("Impressora", 1200, .40, 0);
		Produto p5 = new Produto("iPad", 3100, .29, 0);
		Produto p6 = new Produto("Relógio", 1900, .12, 0);
		Produto p7 = new Produto("Monitor", 800, .31, 0);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<Produto> superPromocao = p -> p.getDesconto() >= .3;
		Predicate<Produto> freteGratis = p -> p.getValorFrete() == 0;
		Predicate<Produto> produtoRelevante = p -> p.getPreco() >= 500;
		Function<Produto, String> dividido = p -> Double.toString(p.getPreco() / 12);
		
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.getName() + " por " + p.getPreco() + " ou em 12x de " +(Produto.df.format(p.getPreco()/12));
		
		produtos.stream().filter(superPromocao).filter(freteGratis).filter(produtoRelevante).map(chamadaPromocional).forEach(imprimirProduto);
		
		
		
		
	}

}
