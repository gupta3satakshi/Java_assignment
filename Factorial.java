package Assignment1;

public class Factorial {
	public static void main(String[] args) {
		int x = 6;
		int fact = 1;
		if(x == 0) {
			System.out.println("factorial of 0 is 1");
		}else {
			for(int i = x; i >= 1; i--) {
				fact =fact * i;
			}
			System.out.println("Factorial of " +x+ " is " +fact);
		}
		
	}

}
