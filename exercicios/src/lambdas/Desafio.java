package lambdas;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		

		/*
		 * A partir do produto calcular o preço real (com desconto)
		 * Imposto municipal: >= 2500 (8,5%)/ < 2500 (isento)
		 * Frete: >= 3000 (100) / < 3000 (50)
		 * Arredondar: deixar com duas casas decimais
		 * Formatar: R$ 1235,57
		 */
		
		
		
		BiFunction<Double, Double, Double> precoReal = (pR, d) -> pR * (1 - d);
		double pR = precoReal.apply(p.preco, p.desconto);
		System.out.println(pR);
		
		
		UnaryOperator<Double> calculoImpostoMunicipal = prodPreco -> prodPreco >= 2500 ? (prodPreco * (8.5/100)) + prodPreco: prodPreco;
		double prodMaisImpostoMunicipal = calculoImpostoMunicipal.apply(pR);
		System.out.println(prodMaisImpostoMunicipal);
		
		
		UnaryOperator<Double> calculoFrete = prodPreco -> prodPreco >= 3000 ? prodPreco + 100 : prodPreco + 50;
		double prodMaisFrete = calculoFrete.apply(prodMaisImpostoMunicipal);
		System.out.println(prodMaisFrete);
		
		String valorArredondado = String.format("%.2f", prodMaisFrete);
		
		UnaryOperator<String> formatarValor = valor -> "R$ " + valorArredondado;
		String valorFormatado = formatarValor.apply(valorArredondado);
		
		System.out.println(valorFormatado);
		
		
		//UnaryOperator<Double> arredeondarPR = pR -> pR.;
		
		

	}
}
