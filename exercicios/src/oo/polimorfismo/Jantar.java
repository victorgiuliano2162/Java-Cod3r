package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa("Marcos", 99.65);
		
		Arroz ingrediente1 = new Arroz(0.25);
		Feijao ingrediente2 = new Feijao(0.18);
		Sorvete ingrediente3 = new Sorvete(0.25);
		
		Comida feijao = new Comida();
		
		System.out.println(feijao.peidar());
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		
		
		System.out.println(convidado.getPeso());
		
	}
}
