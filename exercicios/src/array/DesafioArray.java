package array;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		//Perguntar ao usuário a quantidade de notas a ser digitadas.
		//Laço for para digitar as notas
		//Percorrer o array com o forEach
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de notas a ser informada?");
		int quantidadeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		System.out.println("Informe as notas");
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d nota: ", i+1);
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		
		System.out.println(Arrays.toString(notas));
		System.out.println("A soma das notas é: " + total);
		System.out.println("A media das notas é: "+ media);
		
		entrada.close();

	}

}
