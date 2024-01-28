package array;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizDesafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de alunos na turma?");
		int quantidadeAlunos = entrada.nextInt();
		System.out.println("Qual a quantidade de notas de cada aluno?");
		int quantidadeNotas = entrada.nextInt();
		
		double[][] notas = new double[quantidadeAlunos][quantidadeNotas];
		
		System.out.println("Informe as notas");
		
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas.length; j++) {
			System.out.printf("Digite a %d nota: ", i+1);
			notas[i][j] = entrada.nextDouble();
			}
			

		entrada.close();
				
		//double media = total / notas.length;
		
		System.out.println(Arrays.toString(notas));
		//System.out.println("A soma das notas é: " + total);
		//System.out.println("A media das notas é: "+ media);
		
		}
	}

}
