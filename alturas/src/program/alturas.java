package program;
import java.util.Scanner;
import entities.People;
public class alturas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		People[] vect = new People[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new People(nome, idade, altura);
		}
		
		double avg = 0;
		
		for (int i = 0; i < vect.length; i++) {
			avg += vect[i].getAltura();
		}
		
		int menorIdade = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				menorIdade += 1;
			}
		}
		
		double percentage = ((double) menorIdade /vect.length)*100;
		
		System.out.printf("Altura média: %.2f%n", avg / n);
		System.out.println("Pessoas com menos de 16 anos: " + percentage + "%");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}

		
		
		sc.close();
	}
}
