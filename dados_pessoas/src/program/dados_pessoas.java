package program;
import java.util.Scanner;
import entities.Pessoas;

public class dados_pessoas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoas[] vect = new Pessoas[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			sc.nextLine();
			vect[i] = new Pessoas(altura, genero);
			}
		
		double menorAltura = 10, maiorAltura = 0, avg = 0;	
		int nHomens = 0, nMulheres = 0;
		double sum = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			}
			if (vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
			if (vect[i].getGenero() == 'F' || vect[i].getGenero() == 'f') {
				sum += vect[i].getAltura();
				nMulheres += 1;
			}
			if (vect[i].getGenero() == 'M' || vect[i].getGenero() == 'm') {
				nHomens += 1;
			}
			
			avg = sum / nMulheres;
		}
		
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", avg);
		System.out.println("Numero de homens = " + nHomens);
		
		
		
	}
}
