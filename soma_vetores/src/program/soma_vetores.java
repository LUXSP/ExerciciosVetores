package program;
import java.util.Scanner;

public class soma_vetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
				
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		for (int i = 0; i < vectA.length; i++) {
			System.out.println(vectA[i]+vectB[i]);
		}

		
		

		
		
		
		sc.close();
	}
}
