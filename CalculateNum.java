package Assignment7;

import java.util.Arrays;
import java.util.List;

public class CalculateNum {
	
	public static void operationOnNumber(Predicate<Integer> p, List<Integer> num) {
		for(Integer num1: num) {
			if(p.test(num1)) {
				System.out.println(num1 + " ");
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) 
			 return false;

			 for(int i =2; i*i<=n; i++) {
				 if(n % i == 0) {
					 return false;
				 }
			 }
			 return true;
		}

	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(14,25,20,30,27,69,53,11);
		Predicate<Integer> isPositive = (n) -> n > 0;
		
		System.out.println("--------------------Check if a number is a positive number--------------------------");
		System.out.println(isPositive.test(7));
		System.out.println(isPositive.test(-7));
		
		Predicate<Integer> isPrime = (n) -> {
			
			 if(n <= 1) 
				 return false;

				 for(int i =2; i*i<=n; i++) {
					 if(n % i == 0) {
						 return false;
					 }
				 }
				 return true;
		};
		System.out.println("--------------------Check if a number is prime number by lambda--------------------------");
		System.out.println(isPrime.test(7));
		System.out.println(isPrime.test(3));
		System.out.println(isPrime.test(8));
		
		System.out.println("--------------------Check if a number is prime number by method reference--------------------------");
		Predicate isPrimeMethodRef =CalculateNum::isPrime;
		System.out.println(isPrimeMethodRef.test(31));
		System.out.println(isPrimeMethodRef.test(12));
		System.out.println(isPrimeMethodRef.test(95));
	
		System.out.println("--------------------print all even numbers--------------------------");
		operationOnNumber((n)-> n%2 ==0, num);
		
		System.out.println("--------------------print all numbers which are divisible by 2,3 and 5--------------------------");
		operationOnNumber((n)-> n%2 ==0 && n % 3 == 0 && n%5 ==0 , num);
	}
}

