package Assignment3;

public class Savings extends Account {
	public Savings(int acc_no, String name, double balance) {
		super(acc_no, name, balance);
	}

	
	@Override
	public void withdrawal(double amount) {
		
		if(amount > balance) {
			System.out.println("You are not allowed to withdrawal due to insufficient balance.");
			
		}else {
			balance= balance - amount;
			if(balance < 10000) {
				balance -= 500;
				System.out.println("You should maintain minimum balance.Rs. 500 charged as penalty.");
			}
			System.out.println("After Withdrawal.Current balance: "+balance);
			
		}
	}
	@Override
	public void deposit(double amount) {
		if(amount<50 || amount%50 !=0) {
			System.out.println("You are not allowed to deposit. minimum denomination should be Rs. 50.");
			
		}else {
			balance= balance + amount;
			System.out.println("Deposit successful.Current balance: Rs. "+ balance);
			
		}
	}
}
