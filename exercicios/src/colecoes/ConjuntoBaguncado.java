package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("teste"); //-> String já é objeto
		conjunto.add(1); //int -> Interget
		conjunto.add('x'); //char -> Charactere
		
		System.out.println(conjunto.size());
		
		//conjunto.remove();
		//conjunto.contains();
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto);
		System.out.println(nums);
		
		//conjunto.addAll(nums); //Somamos o valor de nums a conjunto
		
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);//Somes os valores em comum serão mantidos
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.clear(); //para limpar o conjunto
		
		
		
	}

}
