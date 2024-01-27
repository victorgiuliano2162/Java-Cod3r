package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Caraca, moleque";
		System.out.println(c);
		
		/*
		 * A inferência proporciona a capacidade de declarar as variáveis com a palavra reservarda var dando a engine do java a responsabilidade de determinar o tipo de cada variável, contudo após receberem um tipo as variáveis não podem tê-lo modificado ainda que aceitem a sobreescrita de valores do mesmo tipo.
		 * 
		 * var a = "corro";
		 * a = "corri";
		 * Pode ser feito
		 * 
		 * var a = "corro";
		 * a = 49;
		 * Não pode ser feito. Ocasionará um erro de compilação.
		 */
	}
}
