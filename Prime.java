package Assignment1;

public class Prime {
 public static void main(String [] args) {
	 int x=9;
	 int flag =1;
	 if(x <= 1) {
		 flag =0;
	 }
	 else {
		 for(int i =2; i<=x/2; i++) {
			 if(x%i==0) {
				 flag = 0;
				 break;
			 }
		 }
	 }
	 if(flag==1) {
		 System.out.println(x + " is prime");
	 }else {
		 System.out.println(x + " is not prime");
	 }
	 
 }
}
