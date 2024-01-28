package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String retornaData() {
		return String.format("%d/%d/%d", dia, mes, ano);	
	}
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//Byte, short, int, long -> valor padrão = 0
	//float, doblue -> valor padrão = 0.0
	//boolean -> false
	//char -> '\u0000'
	//String -> null
	//O valor padrão de objetos é nulo
}
