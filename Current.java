package Assignment3;

public class Current extends Account {
	
	public Current (int acc_no, String name, double balance) {
		super(acc_no, name, balance);
	}

	@Override
	public void withdrawal(double amount) {
		if(amount>50000) {

			System.out.println("You're not allowed to withdrawal more than 50000");
			
		}else if(amount > balance){
			System.out.println("Your account balance is not sufficient for withdrawal");
		}
		else {
			balance =balance - amount;
			System.out.println("Withdrawn successful.Currenct balance: Rs. "+ balance);
			
		}
		
	}

	@Override
	public void deposit(double amount) {
		if(amount<50 || amount%50 !=0) {
			System.out.println("You are not allowed to deposit. minimum denomination should be Rs. 50." + balance);
			
		}else {
			balance= balance + amount;
			System.out.println("Deposit successful.Current balance: Rs. "+ balance);
			
		}
	}
	
	
	

}
