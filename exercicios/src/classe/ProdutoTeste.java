package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		int a = 3;
		//Tipo Nome = Valor
		
		Scanner leitor = new Scanner(System.in);
		//Tipos Nome = Cria Construtor
		
		Produto p1 = new Produto("Notebook");
		
		var p2 = new Produto("Caneta");
		//Pelo valor(construtor) o java infere o tipo (Produto) e cria um objeto da classe
		
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		p2.nome = "Caneta";
		p2.preco = 12.56;

		
		System.out.println(Produto.desconto);
	}

}
