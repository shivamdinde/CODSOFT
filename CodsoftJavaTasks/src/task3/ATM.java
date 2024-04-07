package task3;

import java.util.Scanner;

public class ATM {
	private UserBankAcc bankAccount;
    private Scanner scanner;

    public ATM(UserBankAcc bankAccount) {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void performTransaction() {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void checkBalance() {
        System.out.println("Your balance is: ₹" + bankAccount.getBalance());
    }

    private void deposit() {
        System.out.print("Enter deposit amount: ₹");
        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter withdrawal amount: ₹");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }
}
