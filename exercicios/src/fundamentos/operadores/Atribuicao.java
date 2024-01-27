package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b  = a;
		int c = a + b;
		
		c += b;
		c -= a;
		c *= b;
		c /= a;
		
		c++;
		
		c %= 2;
		//Ou c % 2 (0 ou 1)
		
	}
}
