package Assignment5;

public class Account {
	
	protected int accno;
	protected String name;
	protected double balance;
	
	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	
	
	
	public void withdraw(double amount) throws InvalidWithdrawException, InsufficientBalanceException {
		if(amount<=0) {
			throw new InvalidWithdrawException("Can not withdraw amount less than zero.");
		}
		if(amount> balance) {
			throw new InsufficientBalanceException("Your account balance has no sufficient balance to withdraw");
		}
		balance -= amount;
		System.out.println("Withdrawn successfull: " +amount);
		System.out.println("Balance ramaining: "+balance);
	}
	
	public void deposit(double amount)throws InvalidDepositException, AmountSouldBeMultipleOfFiftyException {
		if(amount<=0) {
			throw new InvalidDepositException("Can not deposite amount less than zero ");
		}
		if(amount%50 != 0) {
			throw new AmountSouldBeMultipleOfFiftyException("Deposited amount should be multiple of 50");
		}
		balance += amount;
		System.out.println("Deposited successfull: " +amount);
		System.out.println("Balance amount: "+balance);
		
	}
	
	
	
	public void displayAccount() {
		System.out.println("Account_no=" + accno + ", name=" + name + ", balance=" + balance);
	}
	
	
	

}

