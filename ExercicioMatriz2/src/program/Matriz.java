package program;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// m = line; n = column
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				if (mat[l][c] == number) {
					System.out.println("Position " + (l+1) + ", " + (c+1) + ":");
					if (c > 0) {
						System.out.println("Left: " + mat[l][c-1]);
					}
					if (c+1 < n) {
						System.out.println("Right: " + mat[l][c+1]);
					}
					if (l > 0) {
						System.out.println("Up: " + mat[l-1][c]);
					}
					if (l+1 < m) {
						System.out.println("Down: " + mat[l+1][c]);
					}						
					
				}
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
