package fundamentos;

public class ConversaoNumeroParaString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		//System.out.println(num2.toString());
		//Somente o tipo primitivo pode ser convertido para string
		//O modo correto de realizar a conversão:
		System.out.println(Integer.toString(num2));
		
		//Outra possibilidade de transformar tipos númericos com strings é concatená-los com strings:
		System.out.println((""+ num2).length());
		
	}
}
