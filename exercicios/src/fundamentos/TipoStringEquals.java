package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		//Para comprar Strings melhor é usar o equals do que o ==	
		System.out.println("2" == "2"); //avalia como verdadeiro
		
		String s = "2";
		System.out.println("2" == s); //Avalia como falso(deveria)
		
		System.out.println("2".equals(s)); //Avalia como verdadeiro
		
		Scanner entrada = new Scanner(System.in);
	
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		//O método trim() apaga todos os espaços da string
		
		
		entrada.close();
		
		//O método next do objeto Scanner apaga os espaços em branco, enquanto o método nextLine() não.
		
	}
}
