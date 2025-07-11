package program;
import java.util.Scanner;

public class abaixo_da_media {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
		
		double qtdPar = 0;
		double sum = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				qtdPar += 1;
				sum += vect[i];
			}
		}
		
		double avg = sum/qtdPar;
		
		if (qtdPar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
			
		else {
			System.out.println("MEDIA DOS PARES = " + avg);
		}
		
		sc.close();
	}
}
