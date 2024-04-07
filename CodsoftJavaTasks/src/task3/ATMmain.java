package task3;

public class ATMmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a bank account with initial balance of $1000
		UserBankAcc account = new UserBankAcc(1000);

        // Create an ATM instance for the bank account
        ATM atm = new ATM(account);

        // Start ATM transaction
        atm.performTransaction();
	}

}
