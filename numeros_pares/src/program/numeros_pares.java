package program;
import java.util.Scanner;

public class numeros_pares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		
		int qtdPares = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				qtdPares += 1;
			}
		}
		System.out.println();
	
		System.out.println("QUANTIDADE DE PARES = " + qtdPares);
		
		
		sc.close();
	}
}
