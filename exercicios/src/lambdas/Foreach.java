package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		//Forma tradicional de usar o Foreach para iterar sobre um array list
		System.out.println("Forma tradicional...");
		for (String aprovado : aprovados) {
			System.out.println(aprovado);
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + " aprovado(a)"));
		
		System.out.println("\nMethod reference #01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi, meu nome é " + nome);
	}

}
