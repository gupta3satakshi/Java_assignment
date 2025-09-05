package Assignment1;

import java.util.Scanner;

public class StudentArray {
	public static void main(String[] args) {
		System.out.println("enter array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	Student[] students = new Student[5];
	String name;
	for(int i=0; i<n; i++) {
		System.out.println("Enter name");
		name = sc.next();
		students[i]= new Student(name);
	}
	}

}
