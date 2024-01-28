package fundamentos.operadores;

public class DesafioLogico {
	public static void main(String[] args) {
		//Trabalho na terça V ou F
		//Trabalho na quinta V ou F
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV de 50?\"" + comprouTv50);
		System.out.println("Comprou TV de 32?\"" + comprouTv32);
		System.out.println("Comprou sorvete?" + comprouSorvete);
		System.out.println("Ficou mais saudável?" + maisSaudavel);
		
	}
}
