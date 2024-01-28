package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		
		Mamifero rex = new Cachorro();
		System.out.println(rex.mover());
		System.out.println(rex.respirar());
		System.out.println(rex.mamar());
		System.out.println(rex.cagar());
	
	}

}
