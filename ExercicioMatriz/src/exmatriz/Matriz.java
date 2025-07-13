package exmatriz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		int negativeNumbers = 0;
		
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				if (mat[l][c] < 0) {
					negativeNumbers += 1;
				}
			}
		}
		
		System.out.println("Negative numbers= " + negativeNumbers);
		
		sc.close();
	}

}
