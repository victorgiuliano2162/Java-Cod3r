package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		int temperaturaF = 100;
		double converteFparaC = ((temperaturaF - 32) * (5/9.0));
		
		System.out.println("A temperatura em celcius é: "+ String.format("%.1f", converteFparaC) + "ºC");
	};
};
