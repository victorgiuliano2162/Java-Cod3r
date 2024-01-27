package array;

import java.util.Arrays;

public class exercicios {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];	
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			System.out.println(notasAlunoA[i]);
		}
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		double media = total / notasAlunoA.length;
		
		System.out.println(String.format("%.2f", media));
	}

}
