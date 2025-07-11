package program;
import java.util.Scanner;

public class media_pares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		
		double sum = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum/n;
		
		System.out.println();
		System.out.println("MEDIA DO VETOR = " + avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
