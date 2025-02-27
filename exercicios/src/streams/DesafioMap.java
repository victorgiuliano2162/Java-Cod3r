package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/* 
		 * 1. Número para String binária: 6 => "110"
		 * 2. Reverter as String: "110" => "011"
		 * 3. Converter de volta para inteiro: "3" => 3
		 */
		
		//Integer.toBinaryString(); 
		//Traduz números inteiros para String Binárias
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		
		
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s,2);
		//Ao usar o valor 2 como segundo parâmetro do método parseInt da classe Integer informamos ao conversor parseInt (que espera por um valor real) que o valor informado é binário
		
		//nums.stream().forEach(System.out::println);
		
		nums.stream()
		.map(Integer::toBinaryString)
		//.map(inverter)
		.map(binarioParaInt)
		.forEach(System.out::println);
		
		
	}

}
