package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = leitor.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = leitor.nextInt();
		
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		
		leitor.close();
	}
}
