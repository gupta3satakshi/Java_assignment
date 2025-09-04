package Assignment5;

public class TestAccount {

	public static void main(String[] args) {
		Account acc = new Account(123456, "Riya", 50000);
		acc.displayAccount();
		
		
		try {
			acc.withdraw(6000);
			acc.withdraw(-200);
			acc.withdraw(2000);
		} catch (InvalidWithdrawException | InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			acc.deposit(5000);
			acc.deposit(1230);
			acc.deposit(-300);
		} catch (InvalidDepositException | AmountSouldBeMultipleOfFiftyException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
