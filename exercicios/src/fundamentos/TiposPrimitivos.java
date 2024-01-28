package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56798;
		long pontosAcumulados = 3234845223L;
		
		//Tipos numéricos reais
		float salario = 11_445.44f;
		double vendasAcumuladas = 2_456_121_123.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numerosDeVoos / 2);
		
		//Pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Id
		System.out.println(id + " ganha " + salario);
		
		//Férias
		System.out.println("Férias? "+ estaDeFerias);
		
		//Status
		System.out.println("Status: "+status);
		
	}
}
