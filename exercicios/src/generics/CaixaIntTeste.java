package generics;

public class CaixaIntTeste {
	
	public static void main(String[] args) {
		
		CaixaInt caixa = new CaixaInt();
		
		caixa.guardar(16);
		Integer coisa = caixa.abrir();
		System.out.println(coisa);
	}
}
