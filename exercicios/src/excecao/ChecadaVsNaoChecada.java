
package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			geraErro2();
		} catch (Throwable e) {
			e.getMessage();
		}
		
		System.out.println("Fim");
		
	}
	
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro, filha da puta 01");
	}
	static void geraErro2() throws Exception{
		try {
		throw new Exception("Ocorreu um erro 02");
		} catch (Exception e) {
			System.out.println("Erro tratado");
		}
	}
}
