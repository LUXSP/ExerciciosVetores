package program;
import java.util.Scanner;
import entities.Alunos;

public class Aprovados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Alunos[] vect = new Alunos[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota"
					+ " do " + (i+1) + "o aluno: ");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			sc.nextLine();
			double nota2 = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Alunos(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (int i = 0; i < vect.length; i++) {
			if ((vect[i].getNota1() + vect[i].getNota2()) / 2.0 >= 6.0) {
				System.out.println(vect[i].getNome());
			}
		}
	
		
		
		sc.close();
	}
}
