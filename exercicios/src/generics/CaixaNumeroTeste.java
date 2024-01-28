package generics;

public class CaixaNumeroTeste {
	
	public static void main(String[] args) {
		
		//CaixaNumero<String> caixa = new CaixaNumero<String>();
		//A linha acima não funciona pois o generics estabelecido herda a classe Number 
		
		CaixaNumero<Double> caixa = new CaixaNumero<>();
		caixa.guardar(3.14);
		System.out.println(caixa.abrir());

		CaixaNumero<Integer> caixa1 = new CaixaNumero<>();
		caixa1.guardar(3);
		System.out.println(caixa1.abrir());
	}
}
