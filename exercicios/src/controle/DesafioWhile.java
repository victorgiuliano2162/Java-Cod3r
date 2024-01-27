package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		double nota = 0; 
		int quantidadeDeNotas = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota:");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >= 0) {
			total += nota;
			quantidadeDeNotas++;
			} else if (nota != -1){
				System.out.println("Nota inválida");
			}
		}
		
		//Calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média de notas: "+media);
		
		entrada.close();
	}

}
