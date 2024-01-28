package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(14);
		//O método andThen segue uma ordem de execução que vai da esquerda para direita
		
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(14);
		//O método compose, ao contrário do andThen é executado da direita para esquerda
		
		
		System.out.println(resultado);
		System.out.println(resultado2);
		
	}
}
