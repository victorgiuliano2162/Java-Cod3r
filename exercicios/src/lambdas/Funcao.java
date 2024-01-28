package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;

import classe.ValorNull;

public class Funcao {
	
	public static void main(String[] args) {
		
	Function <Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
	Consumer<String> oResultado = valor -> System.out.println("O resultado é "+ valor);;
	
	System.out.println(parOuImpar.apply(33));
	
	Function<String, String> oResultadoE = valor -> "O resultado é: " + valor; 
	
	Function<String, String> empolgado = valor -> valor + "!!!!";
	
	String resultadoFinalString = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
	
	System.out.println(resultadoFinalString);
	
	}
}
