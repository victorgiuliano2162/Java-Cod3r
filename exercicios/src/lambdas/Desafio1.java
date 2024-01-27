package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio1 {
	
	public static void main(String[] args) {

		/*
		 * A partir do produto calcular o preço real (com desconto)
		 * Imposto municipal: >= 2500 (8,5%)/ < 2500 (isento)
		 * Frete: >= 3000 (100) / < 3000 (50)
		 * Arredondar: deixar com duas casas decimais
		 * Formatar: R$ 1235,57
		 */
				
		
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085: preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final do produto é: " + preco);
	}
}
