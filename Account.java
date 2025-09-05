package Assignment3;

public abstract class Account {
	protected int acc_no;
	protected String name;
	protected double balance;
	public Account(int acc_no, String name, double balance) {
		
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}
	public abstract void withdrawal(double amount);
	
	public abstract void deposit(double amount);
	
	public void transaction(Account acc1, double amount) {
		if(this.balance >= amount) {
			this.balance = this.balance - amount;
			acc1.balance = acc1.balance + amount;
			System.out.println("Transaction successfull "+amount+ "transfered from accountno" + this.acc_no + "to accountno" + acc1 );
		}
		else {
			System.out.println("Transaction failed");
		}
	}
	public void display() {
		System.out.println("Accountno: " +acc_no +"  Name: " +name+ "  Balance: Rs." +balance ) ;
	}

}
