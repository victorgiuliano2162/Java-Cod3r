package desafioModulo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Carlos", 87.5);
		Comida c1 = new Comida("queijo", 1.7);
		Comida c2 = new Comida("vatapá", 2.9);
		
		p1.comer(c1);
		p1.comer(c2);
		
		System.out.printf("%s comeu %s e agora pesa %.2f", p1.nome, c1.nome, p1.peso);
	}
}
