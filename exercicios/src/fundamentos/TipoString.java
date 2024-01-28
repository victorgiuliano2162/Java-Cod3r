package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá, pessoal".charAt(5));
		
		String s = "Boa tarde";
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Victor";
		var idade = 25;
		var salario = 2500.35;
		
		System.out.printf("Nome: %s \nIdade: %d \nSalario: %.2f", nome, idade, salario);
		System.out.println();
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
}
