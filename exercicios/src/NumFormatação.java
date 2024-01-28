import java.text.DecimalFormat;

public class NumFormatação {

	//Para formatar números:
	
	public static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		
		double pi = 3.14159265359;
		System.out.println(df.format(pi));
	}

}
