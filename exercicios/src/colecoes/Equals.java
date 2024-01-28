package colecoes;

import java.util.Date;

class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Victor";
		u1.email = "victor.giuliano@gmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Victor";
		u2.email = "victor.giuliano@gmail.com";
		
		
		System.out.println(u1 == u2); //false
		System.out.println(u1.equals(u2)); //false
		System.out.println(u2.equals(u1)); //false
		System.out.println(u2.equals(new Date())); //false
		
		
	}

}
