package program;
import java.util.Scanner;
import entities.People;

public class mais_velho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		People[] vect = new People[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			vect[i] = new People(nome, idade);
		}

		int maisVelho = 0;
		int indexMaisVelho = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() > maisVelho) {
				maisVelho = vect[i].getIdade();
				indexMaisVelho = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vect[indexMaisVelho].getNome());
		
		sc.close();
	}
}
