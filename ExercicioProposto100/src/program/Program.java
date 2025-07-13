package program;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import entities.Employees;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employees> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			
			Employees emp = new Employees(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int validadorNull = 0, idIncrease = sc.nextInt();
		double percentage;
				
		for (int i = 0; i < n; i++) {
			if (list.get(i).getId() == idIncrease) {
				System.out.print("Enter the percentage: ");
				percentage = sc.nextDouble();
				list.get(i).increaseSalary(percentage);
				validadorNull += 1;
			}
			
		}
		
		if (validadorNull == 0) {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		sc.close();
	}
}
