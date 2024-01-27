package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data = new Data(19,03,1998);
		
				
		System.out.println(data.retornaData());
		
		System.out.printf("%d/%d/%d", data.dia, data.mes, data.ano);
	}
}
