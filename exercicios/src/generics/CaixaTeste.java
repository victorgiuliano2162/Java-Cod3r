package generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		
		Caixa<String> caixa = new Caixa<>();
		caixa.guardar("Segredo");
		
		String coisa = caixa.abrir();
		
		System.out.println(coisa);
		
		Caixa<Double> caixa2 = new Caixa<>();
		caixa2.guardar(3.14);
		
		Double coisa2 = caixa2.abrir();
		
		System.out.println(coisa2);
	}
}
