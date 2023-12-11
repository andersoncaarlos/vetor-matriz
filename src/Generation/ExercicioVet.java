package Generation;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVet {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int vet[] = {2, 5, 1, 3, 5, 9, 7, 8, 10, 6};
		
		System.out.print("Digite o número que você deseja encontrar no vetor: ");
		int n = sc.nextInt();
		
		int comp = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == n) {
				System.out.println("O número " + n + " está localizado na posição " + i); 
				comp = 1;
			}
		}
		
		if (comp == 0) {
			System.out.println("O número " + n + " não foi encontrado!");
		}
		
		sc.close();

	}
}
