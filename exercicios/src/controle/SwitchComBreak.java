package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
	

		String conceito = "";
		System.out.println("Digite a nota do aluno");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: 
			conceito = "A";
			break;
		case 9:
			conceito = "B";
			break;
		}
		
		System.out.println("Aluno conceito "+ conceito);
		entrada.close();
	}
	
	

}
