package Generation;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMat {

	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[][] mat = new int[3][3];
		
		System.out.println("Digite os números da matriz: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(mat[i][i] + " ");
			}
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if (i+j == 3-1) {
					System.out.print(mat[i][j] + " ");
				}
			}			
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: ");
		int soma = 0;
		for (int i = 0; i < 3; i++) {			
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					soma += mat[i][j];
				}
			}
		}
		System.out.println(soma);
		
		System.out.println("Soma dos Elementos da Diagonal Secundária: ");
		int soma2 = 0;
		for (int i = 0; i < 3; i++) {			
			for (int j = 0; j < 3; j++) {
				if (i+j == 3-1) {
					soma2 += mat[i][j];
				}
			}
		}
		System.out.println(soma2);
		
		sc.close();
	}
}
