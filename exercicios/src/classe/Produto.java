package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = .25;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
}
