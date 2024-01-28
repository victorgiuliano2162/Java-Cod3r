package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String a = "o";
		
		while(!a.equalsIgnoreCase("sair")){
			a = entrada.nextLine();
		}
		
		entrada.close();
	}
}
