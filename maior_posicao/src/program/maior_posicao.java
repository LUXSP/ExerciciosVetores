package program;
import java.util.Scanner;

public class maior_posicao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double maiorValor = 0;
		int posMaior = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posMaior = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.2f%n", maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posMaior);
		
		
		
		
		
		sc.close();
	}
}
