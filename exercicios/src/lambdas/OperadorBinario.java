package lambdas;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double num1 = leitor.nextDouble();
		double num2 = leitor.nextDouble();
		
		//BinaryOperator<Double> media = ( n1, n2) -> (n1 + n2) / 2;
		
		//System.out.println(media.apply(num1, num2));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((num1 + num2) /2) >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println("Teste");
		System.out.println(resultado.apply(num1, num2));
		
		double media = (num1 + num2) /2;
		
		
		Function<Double, String> resultado3 = n -> n >= 7 ? "Aprovado!!" : "Reprovado" ;
		
		System.out.println(resultado3.apply(media));
		
		
		
		
		leitor.close();
		
	}
}
