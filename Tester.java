package Assignment3;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Savings sa= new Savings(101, "Alice",15000);
		sa.display();
		sa.deposit(500);
		sa.withdrawal(11000);
		System.out.println();
		
		Current ca= new Current (201, "Bob",80000);
		ca.display();
		ca.deposit(100);
		ca.withdrawal(600000);
		ca.withdrawal(40000);
		ca.withdrawal(50000);
		
		
		
		

	}

}
