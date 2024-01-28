package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		String primeiro = leitor.nextLine().replace(",",".");

		System.out.println("Digite o segundo valor:");
		String segundo = leitor.nextLine().replace(",",".");

		System.out.println("Digite o terceiro valor:");
		String terceiro = leitor.nextLine().replace(",",".");
		
		double num1 = Double.parseDouble(primeiro);
		double num2 = Double.parseDouble(segundo);
		double num3 = Double.parseDouble(terceiro);
		
		double soma = (num1 + num2 + num3);
		double media = (num1 + num2 + num3)/3;
		
		System.out.println("A soma dos valores é: " + String.format("%.2f", soma));
		System.out.println("A media dos valores é: " + String.format("%.2f", media));

	}
}
