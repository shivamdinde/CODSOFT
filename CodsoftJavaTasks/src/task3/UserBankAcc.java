package task3;

public class UserBankAcc {

	 private double balance;

	    public UserBankAcc(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful.");
	        } else {
	            System.out.println("Invalid amount for deposit.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful.");
	        } else {
	            System.out.println("Invalid amount or insufficient balance.");
	        }
	    }
}
