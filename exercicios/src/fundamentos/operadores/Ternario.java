package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		int media = 6;
		
		String resultado = media > 5 && media < 7 ? "Recuperação" : "Reprovado";
		
		System.out.println(resultado);
	}
}
